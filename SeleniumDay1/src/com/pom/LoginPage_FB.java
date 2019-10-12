package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_FB {
	
	public WebDriver driver;
	
	public LoginPage_FB(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(linkText="Recover Your Account")
	private WebElement recoverLink;
	
	@FindBy(css="button#loginbutton")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'Log')]")
	private WebElement loginText;
	
	public WebElement getRecoverLink() {
		return recoverLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLoginText() {
		return loginText;
	}

	
	

}
