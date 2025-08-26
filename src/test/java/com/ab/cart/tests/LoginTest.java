package com.ab.cart.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ab.cart.base.BaseTest;
import com.ab.cart.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void LoginPageActions() {
		LoginPage login = new LoginPage(driver);
		login.loginWithCredentials("abarnaselvaganapathy@gmail.com", "Abharnas#123");

		Assert.assertTrue(login.isAccountDisplayed(), "Login failed - account link not visible!");
		System.out.println("Logged in successfully");

	}
}
