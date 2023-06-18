package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.context.Setup;
import com.custom.exceptions.FrameworkExceptions;
import com.pageObject.HomePage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote class for implementing Hooks
 */
public class Hooks {

	Setup setup;
	HomePage homePage;

	/**
	 * Constructor of the class
	 * 
	 * @param Using Pico container to initialize setup and use in page objects
	 */
	public Hooks(Setup setup) {
		this.setup = setup;
	}

	@Before
	public void beforeScenario(Scenario scenario) {

	}

	// This method will take the screenshot on test failure.
	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			try {
				byte[] data = ((TakesScreenshot) setup.getDriverSetup().getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.embed(data, "image/png");

			} catch (Exception e) {
				throw new FrameworkExceptions(e.getMessage());
			}

		}
	}

	// This method will close the driver instance.
	@After(order = 0)
	public void AfterSteps() {
		setup.getDriverSetup().closeDriver();
	}
}
