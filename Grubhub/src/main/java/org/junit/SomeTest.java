package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class SomeTest {
	public static WebDriver dri;
	
	@BeforeClass
	public static void DriverInitialization() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/arthi/eclipse-workspace/SeleniumDay1/Drivers/chromedriver.exe");
		 dri = new ChromeDriver();
		dri.get("http://automationpractice.com/index.php");
		dri.manage().window().maximize();
System.out.println("Launch the URL");
Thread.sleep(3000);
	}
	
	@Before
	public void login() throws InterruptedException {
		
		WebElement loginnn = dri.findElement(By.xpath("//a[@class='login']"));
		Actions ac = new Actions(dri);
		ac.click(loginnn).build().perform();
System.out.println("Login into the application");
Thread.sleep(3000);
	}

	@After
	public void logout1() throws InterruptedException {
		WebElement logout = dri.findElement(By.id("header"));
		Actions ac2 = new Actions(dri);
		ac2.click(logout).build().perform();
		Thread.sleep(3000);
		
		System.out.println("Loged out");
		
		
		
	}
	@Test
	public void testcase1() throws InterruptedException {
		WebElement email = dri.findElement(By.id("email"));
		WebElement password = dri.findElement(By.id("passwd"));
		WebElement signin = dri.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("1234test@gmail.com");
		password.sendKeys("test123");
		Actions acc = new Actions (dri);
		signin.click();
		System.out.println("passdetails");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void testcase2() {
		WebElement contact = dri.findElement(By.id("contact-link"));
		Actions ac3 = new Actions(dri);
		ac3.click(contact).build().perform();
		System.out.println("contact us");
System.out.println("test2 ran successfully");
	}
	
@AfterClass
	public static void quitDriver() {
	dri.close();
System.out.println("quit");		
	}

	

	
		
	}
	


