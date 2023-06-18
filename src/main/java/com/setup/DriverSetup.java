package com.setup;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.enums.ConfigPropertiesEnum;
import com.utils.PropertiesUtils;

/**
 * @author preetammitra
 * @created 16 June 2023
 * @implNote Class to create driver object and store
 */
public class DriverSetup {

	private WebDriver driver;
	private static ConfigPropertiesEnum BROWSER;

	// This will return the current driver instance.
	/**
	 * Constructor of the class
	 * 
	 * @param create driver object while creating object of the class
	 */
	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote create webdriver object using value from properties files
	 */
	private WebDriver createDriver() {
		switch (PropertiesUtils.get(ConfigPropertiesEnum.BROWSER)) {
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "chrome":

			String downloadFilepath = System.getProperty("user.dir") + "\\" + "data" + "\\" + "reports\\download";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
			chromePrefs.put("download.prompt_for_download", false);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			options.merge(cap);
			// cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(options);

			break;
		case "internetexplorer":
			driver = new InternetExplorerDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	/**
	 * @author preetammitra
	 * @created 16 June 2023
	 * @implNote close driver object
	 */
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
