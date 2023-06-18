package com.setup;

import org.openqa.selenium.WebDriver;

import com.pageObject.CommonHeader;
import com.pageObject.HomePage;
import com.pageObject.SearchPage;
import com.pageObject.SubscribePage;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote Class to store and create Page Object to be reused
 */
public class PageManager {

	private WebDriver driver;
	private HomePage homePage;
	private SubscribePage subscribePage;
	private SearchPage searchPage;
	private CommonHeader commonHeader;

	/**
	 * Constructor of the class
	 * 
	 * @param driver has been passed to do operations on browser
	 */
	public PageManager(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote create HomePage object and return
	 */
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote create SubscribePage object and return
	 */
	public SubscribePage getSubscribePage() {
		return (subscribePage == null) ? subscribePage = new SubscribePage(driver) : subscribePage;
	}
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote create SearchPage object and return
	 */
	public SearchPage getSearchPage() {
		return (searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;
	}
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote create CommonHeader object and return
	 */
	public CommonHeader getCommonHeader() {
		return (commonHeader == null) ? commonHeader = new CommonHeader(driver) : commonHeader;
	}
}
