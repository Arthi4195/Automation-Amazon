import java.util.Set;

import org.openqa.selenium.Alert;

public class WindowHandler {
	String firstid = driver.getWindowHandle();
	
	
	Set<String> allId = driver.getWindowHandles();
	
	for (String id : allId) {
		
		if (!(id.equals(firstid))) {
			driver.switchTo().window(id);
		}
	}
	
	Alert al= driver.switchTo().alert();
	al.accept();
	
	al.dismiss();
	
	al.sendKeys("adfdf");
	al.accept(); 
	
}
