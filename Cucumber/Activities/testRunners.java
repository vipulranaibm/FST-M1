package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class testRunners {

	@RunWith(Cucumber.class)
			@CucumberOptions(
				    features = "Features",
				    glue = {"stepDefinitions"},
				    tags = "@SmokeTest",
				    plugin = {"pretty"},
				    monochrome = true
				)
	public class ActivityRunner {}
	
}
