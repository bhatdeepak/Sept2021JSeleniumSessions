package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResourceTestPage {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.LaunchBrowser("chrome");
		brUtil.enterURL("https://demo.opencart.com/index.php?route=account/register");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By userName = By.id("input-email");
//		By userPwd = By.id("input-password");
		
//		eleUtil.doSendKeys(firstName, "Deepak");
//		eleUtil.doSendKeys(lastName, "Bhat");
//		eleUtil.doSendKeys(userName, "email@gmail.com");
		
		eleUtil.doSendKeys("id", "input-firstname", "Deepak");
		eleUtil.doSendKeys("id", "input-lastname", "Bhat");
		eleUtil.doSendKeys("id", "input-email", "testmail.gmail.com");
		eleUtil.doSendKeys("id", "input-password", "testPwd");
		eleUtil.doSendKeys("id", "input-confirm", "confirmpwd");
		
		Thread.sleep(5000);
		
		brUtil.closeBroweser();
		
	}

}
