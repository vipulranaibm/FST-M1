package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.firefoxdriver().setup();
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://v1.training-support.net/selenium/login-form");
	     System.out.println("Hompage title: " + driver.getTitle());
	     
	     driver.findElement(By.id("username")).sendKeys("admin");
	     driver.findElement(By.id("password")).sendKeys("password");
	     
	     driver.findElement(By.xpath("//button[text()='Log in']")).click();
	     String message = driver.findElement(By.id("action-confirmation")).getText();
	     System.out.println("Login message: " + message);
	     
	     driver.close();
	}

}
