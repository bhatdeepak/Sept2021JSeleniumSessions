package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

//		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));	
//		
//		Actions act = new Actions(driver);
//		
//		act.contextClick(rightClickMe).build().perform();
		
		By locator = By.xpath("//span[text()='right click me']");
		bringUpContextMenu(locator);
		
		//assignment click on each context menu item and get the text from the alert
		
		List<WebElement> contextDropDownList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]/span"));
		
		for(WebElement e: contextDropDownList) {
			String contextText = e.getText();
			e.click();
			Alert alert = driver.switchTo().alert();
			String popupText = alert.getText();
			alert.accept();
			System.out.println("For context "+contextText+" popup text is " +popupText );
			bringUpContextMenu(locator);
		}
		
	}
	
	public static void bringUpContextMenu(By locator) {
		WebElement rightClickMe = driver.findElement(locator);
		Actions act = new Actions(driver);
		act.contextClick(rightClickMe).build().perform();
	}

}
