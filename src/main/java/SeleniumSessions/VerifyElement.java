package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By formFields = By.className("text");
		
		int fieldsCount = driver.findElements(formFields).size();
		
		if(fieldsCount == 0) {
			System.out.println("There are no fields on the page");
		}else {
			System.out.println("There are fields on the page");
		}
		
		By contactSalesLink = By.linkText("CONTACT SALES");
		driver.findElement(contactSalesLink).click();
		
		
	}

}
