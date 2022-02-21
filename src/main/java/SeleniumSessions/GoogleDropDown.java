package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleDropDown {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		
		Thread.sleep(5000);
		
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));

		if(suggList.size() > 0) {
			System.out.println("The count of dropdown items = " +suggList.size());
		}
		
		
		  for(WebElement e : suggList) { String dropList = e.getText();
		  if(dropList.equals("naveen automationlabs youtube")) { e.click(); 
		  break;}
		  
		  }
		 
	}

}
