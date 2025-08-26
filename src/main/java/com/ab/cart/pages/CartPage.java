package com.ab.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@href='/cart']")
	private WebElement cartLink;

	@FindBy(xpath = "//td[@class='product']/a")
	private WebElement productName;

	@FindBy(xpath = "//td[@class='unit-price nobr']//span[@class='product-unit-price']")
	private WebElement productPrice;

	@FindBy(xpath = "//input[contains(@class,'qty-input')]")
	private WebElement productQuantity;

	@FindBy(xpath = "//td[@class='subtotal nobr end']//span[@class='product-subtotal']")
	private WebElement productTotalPrice;

	@FindBy(id = "CountryId")
	private WebElement country;

	@FindBy(id = "termsofservice")
	private WebElement termsAndConditions;

	@FindBy(id = "checkout")
	private WebElement checkout;

	public void linkToShoppingCart() {

		cartLink.click();
	}

	public void productDetails() {
		String name = productName.getText();
		String price = productPrice.getText();
		String qty = productQuantity.getAttribute("value");
		String total = productTotalPrice.getText();

		System.out.println("Product: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + qty);
		System.out.println("Total: " + total);
	}

	public void checkoutActions(String text) {
		Select countries = new Select(country);
		countries.selectByVisibleText(text);

		termsAndConditions.click();
		checkout.click();
	}

}
