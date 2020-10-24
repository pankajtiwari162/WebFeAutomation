package com.webfeautomation.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="./Features/PurchaseItem.feature",
glue="com.webfeautomation.StepDefs",
monochrome=true, tags="@Regression", dryRun = false,
plugin= {"html:target/cucumber-report/",
		"json:target/cucumber.json",
		"pretty:target/cucumber-pretty.txt",
		"junit:target/cucumber-results.xml",
"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}
		)
public class TestRunner {

	@BeforeClass
	public static void setup() {
		ExtentProperties   extentproperties    =    ExtentProperties.INSTANCE;
		extentproperties.setReportPath("./Reports/AutomationReport.html");
	}

	@AfterClass
	public static void sytemInformation() {
		Reporter.loadXMLConfig("./Config/extent-config.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
	}

}

