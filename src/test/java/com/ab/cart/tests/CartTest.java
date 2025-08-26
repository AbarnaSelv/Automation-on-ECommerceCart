package com.ab.cart.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ab.cart.base.BaseTest;
import com.ab.cart.pages.CartPage;
import com.ab.cart.pages.HomePage;
import com.ab.cart.pages.LoginPage;

public class CartTest extends BaseTest{
	
	@Test
	public void cartTestActions() {
		
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
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertTrue(currentUrl.contains("onepagecheckout"), "Checkout page not displayed!");

	}

}
