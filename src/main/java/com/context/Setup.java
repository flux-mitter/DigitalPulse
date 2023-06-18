package com.context;

import com.setup.DriverSetup;
import com.setup.PageManager;
/**
 * @author preetammitra
 * @created 15 June 2023
 * @param driver has been passed to do operations on browser
 * @implNote Created to store objects of driver and page objects
 */
public class Setup {
	private DriverSetup driverSetup;
	private PageManager pageManager;

	public Setup() {
		driverSetup = new DriverSetup();
		pageManager = new PageManager(driverSetup.getDriver());
	}

	// This will return the current webdriver manager object
	public DriverSetup getDriverSetup() {
		return driverSetup;
	}

	// This will return the current page object manager object
	public PageManager getPageManager() {
		return pageManager;
	}

}
