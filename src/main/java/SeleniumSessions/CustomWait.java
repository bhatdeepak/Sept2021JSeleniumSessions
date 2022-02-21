package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		
		retryingElement(emailId, 10, 3000).sendKeys("deepak@gmai.com");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static WebElement retryingElement(By locator, int timeOut, long pollingtime) {
		
		WebElement element = null;
		
		int attempts = 0;
		
		while(attempts < timeOut) {
			
			try { 
				element = getElement(locator);
				break;
			} 	catch(NoSuchElementException e) {
					System.out.println("Element is not found in attempt " +attempts+ ":" + locator);
					try {
						Thread.sleep(pollingtime);
					}catch(InterruptedException e1) {
						e1.printStackTrace();
					}
			}
			attempts++;
		}
		
		if(element == null) {
			
			try {
					throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			}
			catch(Exception e) {
				System.out.println("Element is not found exception...tried for :" +timeOut+ "With the interval of "+pollingtime+"ms");
			}
		}
		return element;
	}

}
