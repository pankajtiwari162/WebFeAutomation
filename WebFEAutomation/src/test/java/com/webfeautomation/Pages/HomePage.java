package com.webfeautomation.Pages;

import org.openqa.selenium.WebDriver;


import com.vimalselvam.cucumber.listener.Reporter;
import com.webfeautomation.Base.BaseClass;
import com.webfeautomation.Utils.Assertion;
import com.webfeautomation.Utils.FindPageObjects;
import com.webfeautomation.Utils.Logs;
import com.webfeautomation.Utils.ReadPropertyFiles;
import com.webfeautomation.Utils.WebDriverUtilities;



public class HomePage {
	WebDriver               driver;
	FindPageObjects         findpageObjects            =               new     FindPageObjects();
	WebDriverUtilities      webdriverutilties          =               new     WebDriverUtilities(); 
	Assertion               assertion                  =               new     Assertion();
	BaseClass               baseclass                  =               new     BaseClass();
	
	
	
	/**
	 * @constructor
	 * */
	public HomePage() throws Exception{
		this.driver    =  baseclass.getDriver();
	}



	/**
	 * 
	 * Function to click on Home tab
	 * */
	public void ClickHomeTab() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("HOME_TAB")),BaseClass.TIMEOUT);
			Reporter.addStepLog("Click Performed on Home tab");
			Logs.info("Click Performed on Home tab");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to click on Home tab");
			Logs.error("Unable to click Home tab");
			throw new RuntimeException("Unable to click on Home tab");
		}
	}
	
	
	/**
	 * 
	 * Function to click on Cart tab
	 * */
	public void ClickCartTab() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("CART_TAB")),BaseClass.TIMEOUT);
			Reporter.addStepLog("Click Performed on Cart tab");
			Logs.info("Click Performed on Cart tab");
		} catch (Exception e) {
			e.printStackTrace();
			Logs.error("Unable to Click on Cart tab");
			Reporter.addStepLog("Unable to Click on Cart tab");
			throw new RuntimeException("Unable to Click on Cart tab");
		}
	}


	/**
	 * Function to perform click on Laptops tab
	 * */

	public void clickLaptopsTab() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("CATEGORY_LAPTOPS")), BaseClass.TIMEOUT);
			Reporter.addStepLog("Click performed on Laptops");
			Logs.info("Click performed on Laptops");
		} catch (Exception e) {
			e.printStackTrace();
			Logs.error("Unable to click on Laptops tab");
			Reporter.addStepLog("Unable to click on Laptops tab");
			throw new RuntimeException("Unable to click on Laptops tab");
		}
	}	
	
	
	public void clickSonyVaioLaptop() {
		try {
			webdriverutilties.JSClick(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("LAPTOP_SONY_VAIO_5")), BaseClass.TIMEOUT);
			Reporter.addStepLog("Click performed on Sony Vaio i5 laptop");
			Logs.info("Click performed on Sony Vaio i5 laptop");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to click on Sony Vaio i5 laptop");
			Logs.error("Unable to click on Sony Vaio i5 laptop");
			throw new RuntimeException(e);
		}
	}	

	
	
	/**
	 * Function to perform click on Dell laptop
	 * */
	public void clickDellLaptop() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("LAPTOP_DELL_I7_8GB")), BaseClass.TIMEOUT);
			Reporter.addStepLog("Click performed on Dell i7 8gb laptop");
			Logs.info("Click performed on Dell i7 8gb laptop");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to click on Dell i7 8gb laptop");
			Logs.error("Click performed on Dell i7 8gb laptop");
			throw new RuntimeException("Unable to click on Dell i7 8gb laptop");
		}
	}
}
