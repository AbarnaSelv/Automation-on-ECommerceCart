package com.ab.cart.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="small-searchterms")
	private WebElement search;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']//a[contains(text(),'Simple Computer')]")
	private WebElement product;

	@FindBy(id="add-to-cart-button-75")
	private WebElement addToCart;
	
	@FindBy(id="product_attribute_75_5_31_96")
	private WebElement processor;
	
	@FindBy(xpath = "//div[@class='bar-notification success']//p")
	private WebElement confirmation;

	
	public void searchProduct( ) {
		 search.clear();
		 search.click();
		 
	 }
	 
	 public void selectProduct(String productName) {
		 search.sendKeys(productName);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(product));
		 
		 product.click();
		 
	 }
	 
	 public void addProductToCart() {
		 processor.click();
		 addToCart.click();
	 }
	 
	 public void check() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(confirmation));
		System.out.println(confirmation.getText()); 
	 }
	 

}
