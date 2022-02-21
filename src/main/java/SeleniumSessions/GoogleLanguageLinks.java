package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://google.co.in");
		
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		for(WebElement e:langList) {
			String langText = e.getText();
			System.out.println(langText);
		}
		
	}

}
