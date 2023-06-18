package runner;
/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote class to run cucumber feature files
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/featureScopes.feature", glue = { "StepDefinitions" },

		plugin = { "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
				
				"junit:target/cucumber-reports/cucumber.xml" },
				tags =      { "@Sanity or @Regression"},// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		monochrome = true, strict = true, dryRun = false)

public class TestRunner {

}
