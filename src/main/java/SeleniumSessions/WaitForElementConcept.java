package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crmpro.com/index.html");
		
		By username = By.name("username");
		By password = By.name("password");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		
		username_ele.sendKeys("Deepak");
		
		WebElement password_ele = wait.until(ExpectedConditions.presenceOfElementLocated(password));
		password_ele.sendKeys("Bhat");
		
	}

}


