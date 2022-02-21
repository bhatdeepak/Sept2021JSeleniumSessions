package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageFooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://amazon.com");
		
		List<WebElement> footerList = driver.findElements(By.xpath("//ul/li/a"));
			
		System.out.println(getFooterLinks(footerList));
		
		clickFooterLink(footerList, "Shop with Points");
	}
	
	public static List<String> getFooterLinks(List<WebElement> links) {
		List<String> linkText = new ArrayList<String>();
		for(WebElement e: links) {
			String text = e.getText().trim();
			linkText.add(text);
		}
		return linkText;
	}
	
	public static void clickFooterLink(List<WebElement> links, String linkToClick) {
		for(WebElement e: links) {
			String text = e.getText();
			if(text.equals(linkToClick)) {
				e.click();
				break;
			}
		}
	}
}
