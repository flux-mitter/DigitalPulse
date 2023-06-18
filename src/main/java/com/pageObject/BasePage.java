package com.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.custom.exceptions.ElementNotVisibleException;
import com.enums.ConfigPropertiesEnum;
import com.utils.PropertiesUtils;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @param driver has been passed to do operations on browser
 * @implNote Created for creating reusable methods to be used in page object
 *           classes
 */
public class BasePage {

	WebDriver driver;
	WebDriverWait wait;

	/**
	 * Constructor of the class
	 * 
	 * @param driver has been passed to do operations on browser
	 */
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote reusable method to wait for element to be visible
	 */
	public void waitTillElementVisible(By locator) {
		try {
			wait = new WebDriverWait(driver,
					Duration.ofSeconds(Integer.parseInt(PropertiesUtils.get(ConfigPropertiesEnum.CUSTOMWAIT))));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		} catch (Exception E) {
			throw new ElementNotVisibleException(
					"element not visible after waiting " + ConfigPropertiesEnum.CUSTOMWAIT + " Seconds");
		}
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote reusable method to wait for element to be visible and then click
	 */
	public void click(By locator) {
		waitTillElementVisible(locator);
		driver.findElement(locator).click();
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote reusable method to wait for element to be visible and then type
	 *           text
	 */
	public void enterText(By locator, String text) {
		waitTillElementVisible(locator);
		driver.findElement(locator).sendKeys(text);
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote reusable method to wait for element to be visible and then return
	 *           size
	 * @return Size(Integer)
	 */
	public int returnSize(By locator) {
		waitTillElementVisible(locator);
		return driver.findElements(locator).size();
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote reusable method to wait for element to be visible and check for the
	 *           element present
	 * @return boolean
	 */
	public boolean elementVisible(By locator) {
		waitTillElementVisible(locator);
		return driver.findElement(locator).isDisplayed();
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote reusable method to wait for element and return the first element
	 *           from list of element
	 * @return element(WebElement)
	 */
	public WebElement getFirstElement(By locator) {
		return driver.findElements(locator).get(0);
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param locator
	 * @implNote switch to locator flame
	 */
	public void switchFrame(By locator) {
		driver.switchTo().frame(driver.findElement(locator));
	}
}
