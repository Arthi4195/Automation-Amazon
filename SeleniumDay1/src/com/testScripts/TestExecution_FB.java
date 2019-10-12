package com.testScripts;

import org.openqa.selenium.WebDriver;

import com.org.baseclass.TestBase;
import com.pom.HomePage_FB;
import com.pom.LoginPage_FB;

public class TestExecution_FB extends TestBase{ 
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		driver = getDriver("chrome");
		driver.get("https://www.amazon.com");
		System.out.println("Url launched");
		HomePage_FB hp = new HomePage_FB(driver);
		sendkey(hp.getEmailField(), "Value@gmail.com");
		sendkey(hp.getPasswordField(), "value123");
		clickElement(hp.getLoginButton());
		System.out.println("Clicked on Login button in Homepage");
		
		LoginPage_FB lp = new LoginPage_FB(driver);
		clickElement(lp.getRecoverLink());
		
		System.out.println("Clicked on Recover link in Login Page");
		
		
		Thread.sleep(4000);
		driver.close();
		
	
	}
	

}
