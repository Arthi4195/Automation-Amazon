package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	
	public static void Down()  {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");

		WebDriver Driver1 = new ChromeDriver();
		Driver1.get("https://www.facebook.com");
		
		WebElement day = Driver1.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = Driver1.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = Driver1.findElement(By.xpath("//select[@name='birthday_year']"));
		
Select sday = new Select (day);
sday.selectByValue("4");

Select smonth = new Select (month);
smonth.selectByValue("1");

Select syear = new Select (year);
syear.selectByValue("0");                    


}
	
	
	
	public static void main(String[] args) throws Exception{
		Down();

		}
}
