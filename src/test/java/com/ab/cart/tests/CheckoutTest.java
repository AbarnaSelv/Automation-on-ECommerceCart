package com.ab.cart.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ab.cart.base.BaseTest;
import com.ab.cart.pages.CartPage;
import com.ab.cart.pages.CheckoutPage;
import com.ab.cart.pages.HomePage;
import com.ab.cart.pages.LoginPage;

//@Listeners(com.ab.cart.base.TestListener.class)
public class CheckoutTest extends BaseTest {


	@Test
	public void CheckoutActions() {

		LoginPage login = new LoginPage(driver);
		login.loginWithCredentials("abarnaselvaganapathy@gmail.com", "Abharnas#123");

		String actualText = driver.findElement(By.className("ico-logout")).getText();
		Assert.assertEquals(actualText, "Log out", "Login failed!");
		System.out.println("Logged in successfully");

		HomePage home = new HomePage(driver);
		home.searchProduct();
		home.selectProduct("simpl");
		home.addProductToCart();
		home.check();
		CartPage cart = new CartPage(driver);
		cart.linkToShoppingCart();
		cart.productDetails();
		cart.checkoutActions("India");
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		Assert.assertTrue(pageUrl.contains("onepagecheckout"), "Checkout page not displayed!");
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.checkboxFlow();
		checkout.order();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("checkout/completed"));

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("checkout/completed")) {
			System.out.println("Successfully navigated to Checkout Completed page");
		} else {
			System.out.println("Navigation failed. Current URL: " + currentUrl);
		}

		checkout.Sesslogout();

		String logoutVerify = driver.findElement(By.className("ico-login")).getText();
		Assert.assertEquals(logoutVerify, "Log in", "Login failed!");
		System.out.println("Logged out successfully");

	}

}
