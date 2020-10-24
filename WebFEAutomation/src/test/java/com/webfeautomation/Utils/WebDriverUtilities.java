package com.webfeautomation.Utils;

import java.util.concurrent.TimeUnit;

import javax.swing.text.TabExpander;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;
import com.webfeautomation.Base.BaseClass;



public class WebDriverUtilities {
	WebDriverWait      wait;
	WebDriver          driver;
	BaseClass          baseclass      =     new BaseClass();


	/**
	 * @throws Exception 
	 * @constructor
	 * */
	public WebDriverUtilities() throws Exception {
		this.driver   =  baseclass.getDriver();
	}


	/**
	 * 
	 * */
	public void click(WebElement element, int timeout) {
		try {
			wait      =     new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			if(element.isDisplayed())
				element.click();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(element.toString() + "not clicked");

		}


	}



	/**
	 * 
	 * Function to enter value in input boxes
	 * */

	public void sendKeys(WebElement element, String valueToEnter, int timeout) {
		try {
			wait       =       new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(element));

			if(element.isDisplayed()) 
				element.sendKeys(valueToEnter);


		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(valueToEnter + " not entered in " +element.toString());
		}
	}



	/**
	 * 
	 * Function to accept Ok on alert box
	 * */
	public void alertAcceptOK() {
		try {
			wait  =   new  WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert   alert       =      driver.switchTo().alert();
			alert.accept();
			Reporter.addStepLog("Click performed on Ok");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to accept OK on pop up");
		}

	}


	/**
	 * Function to perform click using JavaScriptExecutor
	 * */
	public void JSClick(WebElement element,int timeout) {
		try {
			wait      =     new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor     js       =     ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

