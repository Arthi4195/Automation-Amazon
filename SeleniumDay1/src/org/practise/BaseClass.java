package org.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getlaunch (String browsername)throws Exception {
		
		
		try {
			if (browsername=="chrome") {
				System.setProperty("webdriver.chrome.driver",":\\Users\\arthi\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			
			else if(browsername == "firefox") {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\arthi\\eclipse-workspace\\SeleniumDay1\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
	
		catch (Exception e) {
			throw new Exception("Invalid");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	return driver;
		
	}

}
