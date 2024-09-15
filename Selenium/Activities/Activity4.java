package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.firefoxdriver().setup();
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://v1.training-support.net/selenium/target-practice");
	     System.out.println("Hompage title: " + driver.getTitle());
	     
	     String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	     System.out.println(thirdHeaderText);
	     
	     String fifthHeadercolor = driver.findElement(By.xpath("//h3[@id='third-header']")).getCssValue("color");
	     System.out.println(fifthHeadercolor);
	     
	     String violetbuttonClass = driver.findElement(By.className("violet")).getAttribute("class");;
	     System.out.println(violetbuttonClass);
	     
	     String greyButtonText = driver.findElement(By.className("grey")).getText();
	     System.out.println(greyButtonText);
	     
	     driver.close();
	}

}