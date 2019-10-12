package org.practise;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Shots {
	
public static void Launch() throws Exception   {
System.setProperty("webdriver.chrome.driver", "C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");

WebDriver Driver1 = new ChromeDriver();
Driver1.get("https://www.redbus.com");
File dest = new File ("C:\\Users\\arthi\\eclipse-workspace\\SeleniumDay1\\Screenshot2\\Arthi1.png");
	
	TakesScreenshot st = (TakesScreenshot) Driver1;
	
File tmp = st.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(tmp, dest);	}

public static void main(String[] args) throws Exception{
Launch();

}
}

//WebElement delivery = driver.findElement(By.xpath("//body[contains(@class,'a-aui_152852')]"));
//WebElement furniture = driver.findElement(By.xpath("//img[contains(@alt,'Furniture up to 60% off')]"));
//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("argument(0).scrollIntoview(false);",delivery);