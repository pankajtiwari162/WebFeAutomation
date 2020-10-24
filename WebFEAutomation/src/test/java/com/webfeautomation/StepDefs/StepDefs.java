package com.webfeautomation.StepDefs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.vimalselvam.cucumber.listener.Reporter;
import com.webfeautomation.Base.BaseClass;
import com.webfeautomation.Pages.CartPage;
import com.webfeautomation.Pages.HomePage;
import com.webfeautomation.Pages.ProductStorePage;
import com.webfeautomation.Utils.ReadPropertyFiles;
import com.webfeautomation.Utils.WebDriverUtilities;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefs {
	WebDriver  			    driver;
	BaseClass       	    baseclass                  =               new      BaseClass();
	HomePage                homePage                   =               new      HomePage();
	ProductStorePage        productStorePage           =               new      ProductStorePage();
	CartPage                cartpage                   =               new      CartPage();
	WebDriverUtilities      webdriverutilities         =               new      WebDriverUtilities();
	String finalPrice;
	@Before
	public void init() {
		// Before Hooks

	}


	public StepDefs() throws Exception {
		this.driver     =     baseclass.getDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}


	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
		driver.get(ReadPropertyFiles.readConfigFile("URL"));
		driver.manage().window().maximize();
	}

	@When("^User navigate to Laptops$")
	public void user_navigate_to_Laptops() throws Throwable {
		homePage.clickLaptopsTab();
	}

	@When("^Clicks on Sony vaio i(\\d+) laptop$")
	public void clicks_on_Sony_vaio_i_laptop(int arg1) throws Throwable {
		homePage.clickSonyVaioLaptop();;
	}

	@When("^Add the laptop into the cart$")
	public void add_the_laptop_into_the_cart() throws Throwable {
		productStorePage.ClickAddToCart();
	}

	@When("^Accept the ok on pop up confirmation$")
	public void accept_the_ok_on_pop_up_confirmation() throws Throwable {
		webdriverutilities.alertAcceptOK();
	}

	@When("^User clicks on Home Page tab$")
	public void user_clicks_on_Home_Page_tab() throws Throwable {
		homePage.ClickHomeTab();
	}

	@When("^Clicks on Dell i(\\d+) (\\d+)gb laptop$")
	public void clicks_on_Dell_i_gb_laptop(int arg1, int arg2) throws Throwable {
		homePage.clickDellLaptop();
	}

	@When("^User Navigate to Cart tab$")
	public void user_Navigate_to_Cart_tab() throws Throwable {
		homePage.ClickCartTab();
	}

	@When("^User delete \"(.*?)\" from cart$")
	public void user_delete_from_cart(String productName) throws Throwable {
		cartpage.deleteItemProductsTable(productName);
		Thread.sleep(3000);
		finalPrice = cartpage.getTotalPrice();
		System.out.println("Final Price on Product page is " + finalPrice);
			
	}

	@When("^Clicks on Place Order$")
	public void clicks_on_Place_Order() throws Throwable {
		cartpage.ClickPlaceOrder();

	}

	@When("^Fill all place order web form fields with below data$")
	public void fill_all_place_order_web_form_fields_with_below_data(DataTable userInformation) throws Throwable {
		List<List<String>> userData   =   userInformation.raw();
		cartpage.enterName(userData.get(0).get(0));
		cartpage.enterCountry(userData.get(0).get(1));
		cartpage.enterCity(userData.get(0).get(2));
		cartpage.enterCardNumber(userData.get(0).get(3));
		cartpage.enterMonth(userData.get(0).get(4));
		cartpage.enterYear(userData.get(0).get(5));

	}


	@When("^Click on Purchase$")
	public void click_on_Purchase() throws Throwable {
		cartpage.ClickPurchase();
	}

	@Then("^Validate purchase amount is equal to amound displayed on Products page$")
	public void validate_purchase_amount_is_equal_to_amound_displayed_on_Products_page() throws Throwable {
	List<String> purchaseAmount  =	cartpage.getActualPricePurchaseConfirmation();
	if(purchaseAmount.contains(finalPrice)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
		
	}

	@When("^User clicks on Ok$")
	public void user_clicks_on_Ok() throws Throwable {
		cartpage.ClickOK();
	}


	@After
	public void tearDown(Scenario  scenario) {
		if(scenario.isFailed()) {
			byte[]    screenshot  =      ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}

		if(driver!=null) {
			driver.close();
			baseclass.setDriver();
		}
	}

}
