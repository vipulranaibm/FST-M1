package stepDefinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginTestSteps {
	private WebDriver driver;
	@Before
	public void setup()  {
		driver = new FirefoxDriver();
		new WebDriverWait (driver, Duration.ofSeconds(10));
	}
	
	@Given ("User is on Login page")
	public void user_on_login_page() {
		driver.get("https://v1.training-support.net/selenium/login-form");
		
	}
	@When ("User enters username and password")
	public void user_enters_credentials()	{
		driver.findElement(By.id("username")).sendKeys("admin");

        driver.findElement(By.id("password")).sendKeys("password");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

}

	@Then ("Read the page title and confirmation message")
	public void user_should_see_result() {
		String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        
  
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
	}
	
		
	    @And("Close the Browser")
	    public void closeBrowser() {
	        //Close browser
	        driver.close();
	}
	
	
	
	
}
