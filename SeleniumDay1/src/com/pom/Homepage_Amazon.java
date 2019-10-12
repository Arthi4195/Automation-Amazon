package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Amazon {

	public WebDriver driver;
	
	public Homepage_Amazon(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//span[text()='Hello. Sign in']")
	private WebElement HelloSignin;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement SignIn;
	
	public WebElement getHelloSignin() {
		return HelloSignin;
	}


	public WebElement getSignIn() {
		return SignIn;
	}

}