package com.testScripts;

import org.openqa.selenium.WebDriver;

import com.org.baseclass.TestBase;
import com.pom.Homepage_Amazon;

public class AmazonTestPage extends TestBase {
	
public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		driver = getDriver("chrome");
		driver.get("https://www.amazon.com");
	driver.get("https://www.amazon.com");
	System.out.println("Url launched");
	
	Homepage_Amazon ha = new Homepage_Amazon(driver);
	mouseOver(ha.getHelloSignin());
	clickElement(ha.getSignIn());
	
	
	
	System.out.println("Clicked signin");
	
	
	Thread.sleep(4000);
	driver.close();
	
	
	}
}	


