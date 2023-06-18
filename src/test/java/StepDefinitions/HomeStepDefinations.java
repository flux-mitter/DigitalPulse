package StepDefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.context.Setup;
import com.pageObject.CommonHeader;
import com.pageObject.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote class for step definition of feature files Gherkin for Home Page
 */
public class HomeStepDefinations {

	Setup setup;
	HomePage homePage;
	CommonHeader commonHeader;

	/**
	 * Constructor of the class
	 * 
	 * @param Using Pico container to initialize setup and use in page objects
	 */
	public HomeStepDefinations(Setup setup) {
		this.setup = setup;
		this.homePage = setup.getPageManager().getHomePage();
		this.commonHeader = setup.getPageManager().getCommonHeader();
	}

	private static Logger log = LogManager.getLogger(HomeStepDefinations.class);

	@And("^I navigate to the PwC Digital Pulse website$")
	public void UserIsInsideHomePage() throws Throwable {
		homePage.navigate();
	}

	@When("I am viewing the \"(.*)\" page")
	public void IAmViewingThePage(String pageName) {
		homePage.verifyUserIsInHomePage(pageName);
		// log.info("Home page is displayed");
	}

	@Then("I am presented with \"(.*)\" columns of articles")
	public void iAmPresentedWithColumnsOfArticles(String colNum) {

		int col = Integer.parseInt(colNum);
		homePage.verifyTotalColumns(col);
	}

	@And("The \"(.*)\" column is displaying \"(.*)\" articles")
	public void the_column_is_displaying_articles(String column, String noOfColumns) {
		homePage.noOfArticlesinColumns(column, Integer.parseInt(noOfColumns));
	}

	@When("I click on the Subscribe navigation link")
	public void iClickOnTheSubscribeNavigationLink() {
		homePage.clickSubscribe();
	}

	@When("I click on the Magnifying glass icon to perform a search")
	public void iClickOnTheMagnifyingGlassIconToPerformASearch() {
		commonHeader.clickSearchButton();
		log.info("Clicked on Search Button");
	}

	@And("I enter the text \"(.*)\"")
	public void iEnterTheTextSinglePageApplications(String input) {

		commonHeader.enterTextIntoSearchbox(input);
		log.info("Text entered into the Searchbox");
	}

	@And("I submit the search")
	public void iSubmitTheSearch() {

		commonHeader.clickOnSubmitSearchButton();
		log.info("Clicked on the Submit Search button");
	}

}
