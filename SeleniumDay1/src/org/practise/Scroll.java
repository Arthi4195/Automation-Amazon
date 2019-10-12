package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void Launch() throws Exception{
		System.setProperty("webdriver.chrome.driver",
			"C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
	

WebElement a = driver.findElement(By.xpath("//div[@id ='P1xlcFBYa1QjcFAU3AzQng']"));
WebElement b = driver.findElement(By.xpath("//div[@id ='shQjg6mm8Q_nX6pLKkzAXg']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("argument(0).scrollIntoview();",a);
	System.out.println("Scroll is started");
	Thread.sleep(3000);
	js.executeScript("argument(0).scrollIntoview();",b);
	System.out.println("scroll is completed");
	
	}
public static void main(String[] args)throws Exception {
	Launch();
}
}

	