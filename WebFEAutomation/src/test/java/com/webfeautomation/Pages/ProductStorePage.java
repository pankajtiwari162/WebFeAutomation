package com.webfeautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vimalselvam.cucumber.listener.Reporter;
import com.webfeautomation.Base.BaseClass;
import com.webfeautomation.Utils.Assertion;
import com.webfeautomation.Utils.FindPageObjects;
import com.webfeautomation.Utils.Logs;
import com.webfeautomation.Utils.ReadPropertyFiles;
import com.webfeautomation.Utils.WebDriverUtilities;

public class ProductStorePage {
	FindPageObjects         findpageObjects            =               new     FindPageObjects();
	WebDriverUtilities      webdriverutilties          =               new     WebDriverUtilities(); 
	Assertion               assertion                  =               new     Assertion();
	BaseClass               baseclass                  =               new     BaseClass();
	WebDriver               driver;


	/**
	 * @constructor
	 * */
	public ProductStorePage() throws Exception{
		this.driver    =  baseclass.getDriver();
	}

	/**
	 * 
	 * Function to click on Add To Cart button
	 * */
	public void ClickAddToCart() {
		try {
			webdriverutilties.JSClick(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("BTN_ADD_TO_CART")),BaseClass.TIMEOUT);
			Reporter.addStepLog("Click Performed on Add To Cart button");
			Logs.info("Click Performed on Add To Cart button");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to Click on Add To Cart button");
			Logs.error("Unable to Click on Add To Cart button");
			throw new RuntimeException();
		}
	}

}
