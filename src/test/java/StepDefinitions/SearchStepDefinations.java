package StepDefinitions;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;

import com.context.Setup;
import com.pageObject.HomePage;
import com.pageObject.SubscribePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import com.pageObject.SearchPage;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote class for step definition of feature files Gherkin for Search Page
 */
public class SearchStepDefinations {

	Setup setup;
	HomePage homePage;
	SubscribePage subscribePage;
	SearchPage SearchPage;

	/**
	 * Constructor of the class
	 * 
	 * @param Using Pico container to initialize setup and use in page objects
	 */
	public SearchStepDefinations(Setup setup) {
		this.setup = setup;
		this.SearchPage = setup.getPageManager().getSearchPage();
	}

	private static Logger log = LogManager.getLogger(SearchStepDefinations.class);

	@Then("I am taken to the search results page")
	public void iAmTakenToTheSearchResultsPage() {

		SearchPage.verifySearchResultPageOpened();
		log.info("Search Result page is displayed");
	}

	@And("I am presented with at least \"(.*)\" search result")
	public void iAmPresentedWithAtLeastSearchResult(String noOdResults) {

		SearchPage.minNoOfSearchResults(noOdResults);
		log.info("Min 1 search result is present");
	}

}
