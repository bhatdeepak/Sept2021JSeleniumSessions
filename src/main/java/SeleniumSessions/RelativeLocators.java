package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement baseEle = driver.findElement(By.xpath("//a[text()='Surrey, Canada']"));

		String aquiText = driver.findElement(with(By.tagName("p")).toRightOf(baseEle)).getText();
		
		String rankText = driver.findElement(with(By.tagName("p")).toLeftOf(baseEle)).getText();
		
		System.out.println("Air Quality Index: "+aquiText+ " - Rank: "+rankText);
		
	}

}
