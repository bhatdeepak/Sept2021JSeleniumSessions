package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.LaunchBrowser("chrome");
		brUtil.enterURL("http://www.amazon.com");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
//		for(int i=0; i<linklist.size();i++) {
//			String text = linklist.get(i).getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}
		//same thing using for each loop
		for(WebElement e:linklist) {
			String text=e.getText();
			if(!text.isEmpty()) {
				System.out.println(text);
			}
		}
		
	}

}
