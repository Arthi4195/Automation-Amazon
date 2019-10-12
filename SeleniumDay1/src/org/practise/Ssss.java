package org.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ssss {
	public static void chromeDriverLaunch() {
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String fid = driver.getWindowHandle();
		driver.manage().window().maximize();

		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		Actions ac = new Actions(driver);
		ac.contextClick(images).build().perform();

		// contextclick(it is used for rightclick)

		Robot rb = new Robot(); /// java class (Robot)
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		ac.contextClick(gmail).build().perform();

		// contextclick(it is used for rightclick)

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Set<String> pid = driver.getWindowHandles();
		System.out.println(fid);
		System.out.println(pid);
		List<String> li = new ArrayList<>();
		li.addAll(pid);
		
			driver.switchTo().window(li.get(1));
		
		for (String x : pid) {
			driver.switchTo().window(x);
			String title = driver.getTitle();
			
			if (title.contains("Images")) {

				driver.switchTo().window(x);
				driver.findElement(By.name("q")).sendKeys("Mobiles", Keys.ENTER);
				Thread.sleep(4000);
				driver.close();
			}else if (title.contains("Gmail")) {
				driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
				Thread.sleep(4000);
				driver.close();
			}
		}
	}

}
