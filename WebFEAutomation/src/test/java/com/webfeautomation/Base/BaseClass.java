package com.webfeautomation.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.webfeautomation.Utils.Logs;
import com.webfeautomation.Utils.ReadPropertyFiles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver  driver   =   null;
	public static int TIMEOUT      =   5;
	/**
	 * @cons
	 * */
	public BaseClass() {}



	/**
	 * Function to get the browser
	 * */
	public String getBrowser() {
		try {
			String browser  			=			ReadPropertyFiles.readConfigFile("BROWSER");
			return browser;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Browser Name is Invalid");
		}
	}


	/**
	 * 
	 * Function to get the driver
	 * **/

	public WebDriver getDriver() throws Exception {
		if(driver== null) {

			String browserValue    			=        getBrowser();

			if(browserValue.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", ReadPropertyFiles.readConfigFile("CHROMEDRIVERPATH"));
				System.setProperty("webdriver.chrome.silentOutput", "true");
				driver 		=        new ChromeDriver();
				Logs.info("Chrome browser started");

			}

			else if(browserValue.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.gecko.driver", ReadPropertyFiles.readConfigFile("FFDRIVERPATH"));
				driver 		=        new FirefoxDriver();
				Logs.info("Firefox browser started");

			}

			else if(browserValue.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", ReadPropertyFiles.readConfigFile("IEDRIVERPATH"));
				driver          =  new InternetExplorerDriver();
				Logs.info("Internet explorer browser started");
			}

			else {
				System.setProperty("webdriver.chrome.driver", ReadPropertyFiles.readConfigFile("CHROMEDRIVERPATH"));
				driver 		=        new ChromeDriver();
				Logs.info("Chrome browser started");
			}}



		return driver;
	}

	public void setDriver() {
		this.driver   = null;

	}

}

