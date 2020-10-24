package com.webfeautomation.Pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vimalselvam.cucumber.listener.Reporter;
import com.webfeautomation.Base.BaseClass;
import com.webfeautomation.Utils.Assertion;
import com.webfeautomation.Utils.FindPageObjects;
import com.webfeautomation.Utils.Logs;
import com.webfeautomation.Utils.ReadPropertyFiles;
import com.webfeautomation.Utils.WebDriverUtilities;

public class CartPage {
	FindPageObjects         findpageObjects            =               new     FindPageObjects();
	WebDriverUtilities      webdriverutilties          =               new     WebDriverUtilities(); 
	Assertion               assertion                  =               new     Assertion();
	BaseClass               baseclass                  =               new     BaseClass();
	WebDriver               driver;


	/**
	 * @constructor
	 * */
	public CartPage() throws Exception{
		this.driver    =  baseclass.getDriver();
	}

	/**
	 * 
	 * Function to click on Place Order button
	 * */
	public void ClickPlaceOrder() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("BTN_PLACE_ORDER")),BaseClass.TIMEOUT);
			Reporter.addStepLog("Click Performed on Place Order button");
			Logs.info("Click Performed on Place Order button");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to Click on Place Order button");
			Logs.error("Unable to Click on Place Order button");
			throw new RuntimeException();
		}
	}


	/**
	 * 
	 * Function to click on Purchase button 
	 **/

	public void ClickPurchase() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("BTN_PURCHASE")),BaseClass.TIMEOUT);
			Reporter.addStepLog("Click Performed on Purchase button");
			Logs.info("Click Performed on Purchase button");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to Click on Purchase button");
			Logs.error("Unable to Click on Purchase button");
			throw new RuntimeException("Unable to Click on Purchase button");
		}
	}



	/**
	 * 
	 * Function to click on OK button 
	 **/

	public void ClickOK() {
		try {
			webdriverutilties.click(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("BTN_OK")),BaseClass.TIMEOUT);
			Reporter.addStepLog("Click Performed on OK button");
			Logs.info("Click Performed on OK button");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to Click on OK button");
			Logs.error("Unable to Click on OK button");
			throw new RuntimeException();
		}
	}

	/**
	 * 
	 * Function to enter value in Name text box
	 * @param Value to enter in Name text box
	 * */
	public void enterName(String name) {
		try {
			webdriverutilties.sendKeys(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TXTBOX_NAME")),name,BaseClass.TIMEOUT);
			Reporter.addStepLog(name + " entered in name input box");
			Logs.info(name + " entered in name input box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog(name + " not entered in name input box");
			Logs.error(name + " not entered in name input box");
			throw new RuntimeException();
		}
	}


	/**
	 * 
	 * Function to enter value in Country text box
	 * @param  Value to enter in Country text box
	 * */
	public void enterCountry(String country) {
		try {
			webdriverutilties.sendKeys(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TXTBOX_COUNTRY")),country,BaseClass.TIMEOUT);
			Reporter.addStepLog(country + " entered in country input box");
			Logs.info(country + " entered in country input box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog(country + " not entered in country input box");
			Logs.error(country + " not entered in country input box");
			throw new RuntimeException();
		}
	}


	/**
	 * 
	 * Function to enter value in city text box
	 * @param    Value to enter in City text box
	 * */
	public void enterCity(String city) {
		try {
			webdriverutilties.sendKeys(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TXTBOX_CITY")),city,BaseClass.TIMEOUT);
			Reporter.addStepLog(city + " entered in city input box");
			Logs.info(city + " entered in city input box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog(city + " not entered in city input box");
			Logs.error(city + " not entered in city input box");
			throw new RuntimeException();
		}
	}


	/**
	 * 
	 * Function to enter value in card number text box
	 * @param   Value to enter in Card number text box
	 * */
	public void enterCardNumber(String cardNumber) {
		try {
			webdriverutilties.sendKeys(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TXTBOX_CREDIT_CARD")),cardNumber,BaseClass.TIMEOUT);
			Reporter.addStepLog(cardNumber + " entered in card number input box");
			Logs.info(cardNumber + " entered in card number input box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog(cardNumber + " not entered in card number input box");
			Logs.error(cardNumber + " not entered in card number input box");
			throw new RuntimeException();
		}
	}	



	/**
	 * 
	 * Function to enter value in month text box
	 * @param    month to enter in Month input box
	 * */
	public void enterMonth(String month) {
		try {
			webdriverutilties.sendKeys(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TXTBOX_MONTH")),month,BaseClass.TIMEOUT);
			Reporter.addStepLog(month + " entered in month input box");
			Logs.info(month + " entered in month input box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog(month + " not entered in month input box");
			Logs.error(month + " not entered in month input box");
			throw new RuntimeException();
		}
	}


	/**
	 * 
	 * Function to enter value in year text box
	 * @param   year to enter in Year text box
	 * */
	public void enterYear(String Year) {
		try {
			webdriverutilties.sendKeys(findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TXTBOX_YEAR")),Year,BaseClass.TIMEOUT);
			Reporter.addStepLog(Year + " entered in year input box");
			Logs.info(Year + " entered in year input box");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog(Year + " not entered in year input box");
			Logs.error(Year + " not entered in year input box");
			throw new RuntimeException();
		}
	}		


	/**
	 *Function to get Total price 
	 **/

	public String getTotalPrice() {
		String totalPrice        =     null;
		try {

			totalPrice           =    findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("TOTAL_PRICE")).getText();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return  totalPrice;
	}


	/**
	 *
	 **/

	public List<String> getActualPricePurchaseConfirmation() {
		String        actualPrice    =     null;
		String[]      values         =     null;
		List<String>  listOfValues   =     null;
		try {
			actualPrice       =    findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("DATA_PURCHASE_CONFIRMATION")).getText();
			System.out.println("******Logs for purchase id and amount along with other details*******");
			System.out.println(actualPrice);
			Logs.info("******Logs for purchase id and amount along with other details*******");
			Logs.info(actualPrice);
			values =  actualPrice.split(" ");
			listOfValues = Arrays.asList(values);

		} catch (Exception e) {

		}
		return  listOfValues;
	}





	/**
	 * Below function delete the product from product table
	 * @param  provide the productname which you want to delete
	 * */

	public void deleteItemProductsTable(String productName) {
		try {
			WebElement tablebody  =     findpageObjects.getObject(ReadPropertyFiles.readLocatorsFile("PRODUCT_TABLE_BODY"));
			int totalProducts   =   tablebody.findElements(By.tagName("tr")).size();
			for(int counter=1;counter<=totalProducts;counter++) {
				String productTitle =  driver.findElement(By.xpath("//tbody[@id='tbodyid']/tr["+counter+"]/td["+2+"]")).getText();
				if(productTitle.equalsIgnoreCase(productName)) {
					driver.findElement(By.xpath("//tbody[@id='tbodyid']/tr["+counter+"]/td["+4+"]/a")).click();
					Reporter.addStepLog(productName + " removed from product list");
					Logs.info(productName + " removed from product list");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.addStepLog("Unable to remove " + productName + " from product list");
			Logs.error("Unable to remove " + productName + " from product list");
		}

	}	

}
