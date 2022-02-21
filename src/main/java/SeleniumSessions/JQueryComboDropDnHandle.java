package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryComboDropDnHandle {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//List<WebElement> choicesList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		By choices = By.cssSelector("span.comboTreeItemTitle");
		
		selectCombos(choices, "choice 2", "choice 2 2", "choice 6 2 3");
	}
	
	public static void selectCombos(By locator, String...values) {
		
		List<WebElement> choicesList = driver.findElements(locator);
		
		for(WebElement e : choicesList) {
			String text = e.getText();
		//	System.out.println(text);
			
			for(int i=0;i<values.length;i++) {
				if(text.equals(values[i])) {
					e.click();
					break;
				}
			}
			
		}
	}

}
