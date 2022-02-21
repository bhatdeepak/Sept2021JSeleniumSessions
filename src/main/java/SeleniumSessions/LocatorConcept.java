package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement userName= driver.findElement(By.id("input-email"));
		WebElement userPwd= driver.findElement(By.id("input-password"));
		userName.sendKeys("test@gmail.com");
		userPwd.sendKeys("testpassword");
		
		//3rd way
		
		By user= By.id("input-email");
		By pwd = By.id("input-password");
		
		getElement(user).sendKeys("newusername");
		getElement(pwd).sendKeys("newpassword");
		
		//driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
