package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crmpro.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("newautomation");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
