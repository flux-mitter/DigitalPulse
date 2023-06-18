package com.pageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @param driver has been passed to do operations on browser
 * @implNote Created for Page object implementation of Search page
 */
public class SearchPage extends BasePage {

	WebDriver driver;

	/**
	 * Constructor of the class
	 * 
	 * @param driver has been passed to do operations on browser
	 */
	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public By searchResultPage() {
		return By.xpath("//h2[contains(text(),'Refine your search')]");
	}

	public By searchResuls() {
		return By.xpath("//div[@class='srp-list']/div");
	}

	// This is used to verify Search result is opened.
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote Verify search result
	 */
	public void verifySearchResultPageOpened() {
		assertTrue(elementVisible(searchResultPage()));
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param int number of min search results
	 * @implNote verify number of results for the search criteria
	 */
	// This is used to search minn no of search results.
	public void minNoOfSearchResults(String minNoOfSSearch) {
		assertTrue(returnSize(searchResuls()) >= Integer.parseInt(minNoOfSSearch));
	}

}
