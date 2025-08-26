package com.ab.cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    
    
    
    public LoginPage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath = "//a[.='Log in']")
    private WebElement login;
    
    @FindBy(id="Email")
    private WebElement email;
    
    @FindBy(id="Password")
    private WebElement pass;
    
    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement submit;
    
    @FindBy(xpath = "//a[@class='account']")
    private WebElement accountDisplay;
    
    public void loginWithCredentials(String emailid, String password) {
        login.click();
        email.clear();
        email.sendKeys(emailid);
        pass.clear();
        pass.sendKeys(password);
        submit.click();
    }
    
    public boolean isAccountDisplayed() {
        return accountDisplay.isDisplayed();
    }
}
