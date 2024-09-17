package activities;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    public static List<List<Object>> readExcel(String filePath) {
        List<List<Object>> data = new ArrayList<>();
        try {
            // Read the file as a stream
            FileInputStream file = new FileInputStream(filePath);

            // Create the workbook
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get first sheet from that workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Set up a Data Formatter
            DataFormatter dataFormatter = new DataFormatter();

            // Iterate through all the rows one by one
            for (Row row: sheet) {
                // Temp var
                List<Object> rowData = new ArrayList<>();
                // Iterate over all the cells one by one
                for(Cell cell: row) {
                    if(cell != null) {
                        switch (cell.getCellType()) {
                            case STRING:  {
                                rowData.add(cell.getStringCellValue());
                                break;
                            }
                            case NUMERIC:  {
                                rowData.add(dataFormatter.formatCellValue(cell));
                                break;
                            }
                            case BOOLEAN: {
                                rowData.add(cell.getBooleanCellValue());
                                break;
                            }
						case BLANK: throw new UnsupportedOperationException("Unimplemented case: " + cell.getCellType());
						case ERROR: throw new UnsupportedOperationException("Unimplemented case: " + cell.getCellType());
						case FORMULA: throw new UnsupportedOperationException("Unimplemented case: " + cell.getCellType());
						case _NONE: throw new UnsupportedOperationException("Unimplemented case: " + cell.getCellType());
						default: throw new IllegalArgumentException("Unexpected value: " + cell.getCellType());
                        }
                    }
                }
                data.add(rowData);
            }
            file.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @DataProvider(name = "Registration")
    public static Object[][] signUpInfo() {
        String filePath = "employees.xlsx";
        List<List<Object>> data = readExcel(filePath);
        return new Object[][] {
                { data.get(1) },
                { data.get(2) },
                { data.get(3) },
        };
    }

    @Test(dataProvider = "Registration")
    public void registrationTest(List<Object> rows) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement phoneNumberField = driver.findElement(By.id("number"));

        // Clear the fields
        firstNameField.clear();
        lastNameField.clear();
        emailField.clear();
        phoneNumberField.clear();

        // Enter the data
        firstNameField.sendKeys(rows.get(1).toString());
        lastNameField.sendKeys(rows.get(2).toString());
        emailField.sendKeys(rows.get(3).toString());
        phoneNumberField.sendKeys(rows.get(4).toString());

        // Click on the submit button
        driver.findElement(By.cssSelector("input.green")).click();

        // Wait for the alert to show up
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to Alert
        Alert message = driver.switchTo().alert();
        // Get the alert message
        System.out.println("Alert Message: " + message.getText());
        Reporter.log("Alert Message: " + message.getText());
        message.accept();

        // Refresh the page
        driver.navigate().refresh();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}