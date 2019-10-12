package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber.baseclass.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature\\", glue = "com.cucumber.stepdefinition")

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void getDriver() throws Exception {
		driver = TestBase.getDriver("chrome");
		System.out.println("Test 1");

	}

	@AfterClass
	public static void quitt() {
		System.out.println("Test 1");

		driver.quit();

	}

}