package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		//driver.get("http://orangehrm.com//orangehrm-30-day-trial/");
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
		
		//driver.findElement(By.id("u_0_2_Of")).click();
		
		
		By dayElement = By.xpath("//select[@name=\"birthday_day\"]");
		By monElement = By.xpath("//select[@name=\"birthday_month\"]");
		By yrElement = By.xpath("//select[@name=\"birthday_year\"]");
		
		doDropDownSelectByIndex(dayElement,10);
		doDropDownSelectByValue(monElement, "10");
		doDropDownByVisibleText(yrElement, "1978");
		//WebElement country = driver.findElement(By.id("Form_submitForm_Country")); 
		
		//Select select = new Select(country);
		//select.selectByIndex(5);
		//select.selectByValue("Ghana"); //value of the option
		//select.selectByVisibleText("India"); //text of the option
		//By country = By.id("Form_submitForm_Country");
		//doDropDownSelectByIndex(country,10);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doDropDownSelectByValue(By locator, String valueText) {
		Select select = new Select(getElement(locator));
		select.selectByValue(valueText);
	}
	
}
