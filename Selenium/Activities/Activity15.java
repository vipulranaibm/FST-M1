package activities;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.firefoxdriver().setup();
	     WebDriver driver = new FirefoxDriver();
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	     driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
	     System.out.println("Hompage title: " + driver.getTitle());
	     
	     WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
	     WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
	     
	     username.sendKeys("admin");
	     password.sendKeys("password");
	     
	     driver.findElement(By.xpath("//button[@type='submit']")).click();

	     String message = driver.findElement(By.id("action-confirmation")).getText();
	     System.out.println("Login message: " + message);

	     driver.quit();

	}

}