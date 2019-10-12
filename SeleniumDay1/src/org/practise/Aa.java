package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa {
	
	public static void abc() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement smail = driver.findElement(By.id("email"));
	
	boolean selected = smail.isSelected();
	System.out.println(selected);
	
	
	boolean displayed = smail.isDisplayed();
	System.out.println(displayed);
	
	boolean enabled = smail.isEnabled();
	System.out.println(enabled);
	
	System.out.println("For login");
	
	
	//WebElement password = driver.findElement(By.id("pass"));
	
	//boolean en = password.isSelected();
	//System.out.println(en);
	WebElement login = driver.findElement(By.xpath("//input[@value ='Log In']"));
	boolean select = login.isSelected();
	System.out.println(select);
	
	
	boolean display = login.isDisplayed();
	System.out.println(display);
	
	boolean enable = login.isEnabled();
	System.out.println(enable);
	
	}
	
	

	public static void main(String[] args) {
abc();
	}

}
