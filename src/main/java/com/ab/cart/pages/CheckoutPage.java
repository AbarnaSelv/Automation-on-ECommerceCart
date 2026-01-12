package com.ab.cart.pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='billing-buttons-container']/input[@value='Continue']")
	private WebElement billingContinue;

	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input[@value='Continue']")
	private WebElement shippingContinue;

	@FindBy(xpath = "//input[@type='radio'][1]")
	private WebElement shipRadio;

	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/input[@value='Continue']")
	private WebElement shippingMethodContinue;

	@FindBy(xpath = "//input[@value='Payments.CashOnDelivery']")
	private WebElement payRadio;

	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/input[@value='Continue']")
	private WebElement paymentMethodContinue;

	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/input[@value='Continue']")
	private WebElement paymentInfoContinue;

	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input[@value='Confirm']")
	private WebElement confirmOrderButton;

	@FindBy(xpath = "//strong[.='Your order has been successfully processed!']")
	private WebElement orderStatus;

	@FindBy(xpath = "//li/a[@href='/logout']")
	private WebElement logout;

	private WebDriverWait getWait() {
		return new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public void checkboxFlow() {
		getWait().until(ExpectedConditions.elementToBeClickable(billingContinue)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(shippingContinue)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(shipRadio)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(shippingMethodContinue)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(payRadio)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(paymentMethodContinue)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(paymentInfoContinue)).click();
		getWait().until(ExpectedConditions.elementToBeClickable(confirmOrderButton)).click();
	}




	public void order() { 
		getWait().until(ExpectedConditions.visibilityOf(orderStatus));

		System.out.println("Order Status: " + orderStatus.getText());

	}
	public void Sesslogout() {

		getWait().until(ExpectedConditions.visibilityOf(logout));
		logout.click();
	}
}

