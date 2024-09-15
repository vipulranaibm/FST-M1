package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://v1.training-support.net/selenium/login-form");
}	


	@DataProvider(name = "Credentials")
	public static Object [][] creds() {
		return new Object [][] {
			{"admin", "password", "Welcome Back, admin"},
			{"Wrongadmin", "wrongpassword", "Invalid Credentials"}
			
		};
	}

	@Test(dataProvider = "Credentials")
	public void loginTest(String username, String password, String expectedmessage) {
		WebElement usernamefield = driver.findElement(By.linkText("Username"));
		WebElement passwordfield = driver.findElement(By.linkText("Password"));
	//	WebElement loginbutton = driver.findElement(By.xpath("button[text()='Login']"));

		usernamefield.clear();
		passwordfield.clear();
		
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
	//	loginbutton.click();
		
		String confirmationmessage = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(confirmationmessage,expectedmessage);
	}
	
}
	
	