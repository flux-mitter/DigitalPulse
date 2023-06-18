package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @param driver has been passed to do operations on browser
 * @implNote Created for Page object implementation of Header in Page
 */
public class CommonHeader extends BasePage {
	WebDriver driver;

	/**
	 * Constructor of the class
	 * 
	 * @param driver has been passed to do operations on browser
	 */
	public CommonHeader(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	public By searchButton() {
		return By.xpath("//button[text()='Search']");
	}

	public By searchField() {
		return By.xpath("//input[@name='searchfield']");
	}

	public By searchSubmit() {
		return By.xpath("//input[@type='submit']");
	}

	// implementation methods

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote Click on Search
	 */
	public void clickSearchButton() {
		click(searchButton());
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote Enter value in search text field to be searched
	 */
	public void enterTextIntoSearchbox(String text) {
		enterText(searchField(), text);
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote Click on submit Search
	 */
	public void clickOnSubmitSearchButton() {
		click(searchSubmit());

	}
}
