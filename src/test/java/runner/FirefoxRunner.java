package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features\\FirefoxTest.feature",
		glue= {"stepdefinitions"},
		monochrome=true,
		strict=true,
		dryRun=false,
		plugin = {"pretty"}
		)
public class FirefoxRunner {

}
