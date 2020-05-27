package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features\\ChromeTest.feature",
		glue= {"stepdefinitions"},
		monochrome=false,
		strict=true,
		dryRun=false,
		plugin = {"pretty"}
		)

public class ChromeRunner {
	

}
