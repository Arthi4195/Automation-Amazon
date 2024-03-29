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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.remote.server.handler.FindElements;
public class BrowserLaunch1 {
public static void chromeDriverLaunch() throws Exception {
			System.setProperty("webdriver.chrome.driver",
				"C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement signin = driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	Actions ac = new Actions (driver);
	ac.moveToElement (signin).build().perform();
	
WebElement wishlist = driver.findElement(By.xpath("//span[text()='Baby Wish List']"));
ac.click(wishlist).build().perform();
File des = new File ("C:\\Users\\arthi\\eclipse-workspace\\SeleniumDay1\\Screenshot\\photo.png");
TakesScreenshot ts = (TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(temp, des);
	
	
	 
	}
public static void fireFoxBrowserLaunch() {
		System.setProperty("webdriver.gecko.driver",
				"C://Users//arthi//eclipse-workspace//SeleniumDay1//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
public static void IEBrowserLaunch() {
		System.setProperty("webdriver.ie.driver",
				"C://Users//arthi//eclipse-workspace//SeleniumDay1//Drivers//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
		
	}

	public static void main(String[] args) throws Exception {
		
	//chromeDriverLaunch();

		 
		//fireFoxBrowserLaunch();
		IEBrowserLaunch();
	}

}
