package com.pageObject;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote Created for Page object implementation of Subscribe page
 */
public class SubscribePage extends BasePage {

	WebDriver driver;

	/**
	 * Constructor of the class
	 * 
	 * @param driver has been passed to do operations on browser
	 */
	public SubscribePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	// locators
	public By digitalPulse() {
		return By.xpath("//h2[contains(text(), 'Subscribe')]");
	}

	public By textFieldValidation(String fieldname, String required, String fieldType) {
		return By.xpath("//label[contains(text(),'" + fieldname + "')]/span[contains(text(),'" + required
				+ "')]/../following-sibling::input[@type='" + fieldType + "']");
	}

	public By dropDownFieldValidation(String fieldname, String required, String fieldType) {
		return By.xpath("//label[contains(text(),'" + fieldname + "')]/span[contains(text(),'" + required
				+ "')]/../following-sibling::" + fieldType);
	}

	public By captchaRequired() {
		return By.xpath("//label[contains(text(),'Please click here')]/span");
	}

	public By captchaIFrame() {
		return By.xpath("//iframe[@title='reCAPTCHA']");
	}

	public By reCaptcha() {
		return By.xpath("//div[text()='reCAPTCHA']");
	}

	// methods
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote Verify subscribe page is displayed
	 */
	public void verifySubscripePageDisplayed() {

		assertTrue(elementVisible(digitalPulse()));
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @param DataTable field values to be verified
	 * @implNote Verify page fields details
	 */
	public void verifyFields(DataTable dataTable) {
		List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : user) {
			System.out.println(row);
			if (row.get("Type").contains("text")) {
				String required = "";
				if (row.get("Required").contains("true")) {
					required = "*";
				}
				assertTrue(elementVisible(textFieldValidation(row.get("Field"), required, row.get("Type"))));
			}
			if (row.get("Type").contains("dropdown")) {
				String required = "";
				String fieldType = "select";
				if (row.get("Required").contains("true")) {
					required = "*";
				}

				assertTrue(elementVisible(dropDownFieldValidation(row.get("Field"), required, fieldType)));
			}
		}
	}

	// This is used to verify the reCaptcha.
	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote Verify captcha mandatory and captcha element present
	 */
	public void verifyRecaptcha() {

		Assert.assertTrue(elementVisible(captchaRequired()));
		switchFrame(captchaIFrame());
		Assert.assertTrue(elementVisible(reCaptcha()));
	}

}
