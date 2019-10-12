package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aaaaa {
public static void Hwork() throws Exception {
	System.setProperty("ebdriver.chrome.driver",
			"C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
driver.get("https://www.facebook.com/");
WebElement smail = driver.findElement(By.id("email"));

smail.sendKeys("arthiashok04@gmail.com");

WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("arthi123456");

WebElement login = driver.findElement(By.xpath("//input[@value ='Log In']"));
login.click();

Thread.sleep(3000);




}




	
	public static void main(String[] args) throws Exception  {
		
		Hwork();
}

}
