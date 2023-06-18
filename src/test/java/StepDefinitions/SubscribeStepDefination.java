package StepDefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.context.Setup;
import com.pageObject.HomePage;
import com.pageObject.SubscribePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote class for step definition of feature files Gherkin for Subscribe
 *           Page
 */
public class SubscribeStepDefination {

	Setup setup;
	HomePage homePage;
	SubscribePage subscribePage;

	/**
	 * Constructor of the class
	 * 
	 * @param Using Pico container to initialize setup and use in page objects
	 */
	public SubscribeStepDefination(Setup setup) {
		this.setup = setup;
		this.subscribePage = setup.getPageManager().getSubscribePage();
	}

	private static Logger log = LogManager.getLogger(SubscribeStepDefination.class);

	@Then("I am taken to the Subscribe page")
	public void iAmTakenToTheSubscribePage() {
		subscribePage.verifySubscripePageDisplayed();
		log.info("Subscribe page is displayed");
	}

	@And("I am presented with the below fields")
	public void iAmPresentedWithTheBelowFields(DataTable fields) throws InterruptedException {

		subscribePage.verifyFields(fields);
		log.info("Subscribe page fields are displayed");

	}

	@And("I will need to complete Google reCAPTCHA before I can complete my request")
	public void iWillNeedToCompleteGoogleReCAPTCHABeforeICanCompleteMyRequest() {

		subscribePage.verifyRecaptcha();
		log.info("validated Captcha is displayed and is mandatory");
	}
}
