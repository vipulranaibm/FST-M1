package stepDefinitions;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity1 {
	private WebDriver driver;
	private WebDriverWait Wait;
	
	@Before
	public void setup()  {
		driver = new FirefoxDriver();
		Wait = new WebDriverWait (driver, Duration.ofSeconds(10));
	}
	
	@Given ("User is on the DuckDuckGo Website")
	public void user_in_on_ddg_website() {
		driver.get("https://duckduckgo.com");
		assertEquals("DuckDuckGo — Privacy, simplified.",driver.getTitle());
	}
	@When ("User searches for Cheese")
	public void user_searches_for_cheese()	{
		driver.findElement(By.id("searchbox_input")).sendKeys("Chesse");
		driver.findElement(By.cssSelector("button.searchbox_searchButton__F5Bwq")).click();


}

	@Then ("User should see search results")
	public void user_should_see_result() {
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".aE0gc0ID62YmIzSXoXG2")));
		WebElement result = driver.findElement(By.cssSelector(".aE0gc0ID62YmIzSXoXG2"));
		// Object results = null;
		// assertNotNull(results);
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
}