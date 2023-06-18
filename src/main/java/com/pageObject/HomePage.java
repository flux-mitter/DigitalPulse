package com.pageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.enums.ConfigPropertiesEnum;
import com.utils.PropertiesUtils;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @param driver has been passed to do operations on browser
 * @implNote Created for Page object implementation of Home page
 */
public class HomePage extends BasePage {

	WebDriver driver;

	/**
	 * Constructor of the class
	 * 
	 * @param driver has been passed to do operations on browser
	 */
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	public By digitalPulse() {
		return By.xpath("//p[contains(text(), 'Digital Pulse')]");
	}

	public By totalArticleColumns() {
		return By.xpath("//div[contains(@class,'headline_column')]");
	}

	public By totalLeftArticle() {
		return By.xpath("//div[contains(@class,'headline_column2')]/article");
	}

	public By totalMiddleArticle() {
		return By.xpath("//div[contains(@class,'headline_column1')]/article");
	}

	public By totalRightArticle() {
		return By.xpath("//div[contains(@class,'headline_column3')]/article");
	}

	public By subscribe() {
		return By.xpath("//strong/following-sibling::a[@title='Subscribe']");
	}

	// Methods
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param String homepage
	 * @implNote verify user is in home page
	 */
	public void verifyUserIsInHomePage(String homePage) {
		WebElement element = getFirstElement(digitalPulse());
		assertTrue(element.isDisplayed());
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param number of columns
	 * @implNote verify total columns
	 */
	public void verifyTotalColumns(int noOfColumns) {
		assertEquals(noOfColumns, returnSize(totalArticleColumns()));
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote open url
	 */
	public void navigate() {
		driver.get(PropertiesUtils.get(ConfigPropertiesEnum.URL));
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param String Column, String number of columns
	 * @implNote verify number of articles in different columns
	 */
	public void noOfArticlesinColumns(String column, int noOfColumns) {

		switch (column) {
		case "left":
			assertEquals(noOfColumns, returnSize(totalLeftArticle()));
			break;
		case "middle":
			assertEquals(noOfColumns, returnSize(totalMiddleArticle()));
			break;
		case "right":
			assertEquals(noOfColumns, returnSize(totalRightArticle()));
			break;
		default:
			break;
		}
	}

	public void clickSubscribe() {
		String originalWindow = driver.getWindowHandle();
		click(subscribe());
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> itr = allWindowHandles.iterator();
		while (itr.hasNext()) {
			String window = itr.next();

			if (!originalWindow.equals(window)) {
				driver.switchTo().window(window);
				break;
			}
		}

	}

}
