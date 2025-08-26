package com.ab.cart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.initDriver("chrome");
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();

	}

}
