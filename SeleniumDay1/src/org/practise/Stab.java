package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Stab {
	public static void Sample()
	 {
		System.setProperty("webdriver.chrome.driver", "C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");

		WebDriver Driver1 = new ChromeDriver();
		Driver1.get("https://www.toolsqa.com/automation-practice-table/");
WebElement aa = Driver1.findElement(By.xpath("//h1[text()='Automation Practice Table']"));
String word = aa.getText();
System.out.println(word);

java.util.List<WebElement> bb = Driver1.findElements(By.xpath("//table/tbody/tr[2]"));

for (WebElement wb : bb) {
String text = wb.getText();
System.out.println(text);



//column doubt
	
}





}

	
	
	public static void main(String[] args) {
		 Sample();
}
}