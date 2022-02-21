package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//table[@id="customers"]/tbody/tr[2]/td[1] values from 1st column of the table
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[5]/td[1]
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		int numRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
//		int i = 2;
//		String cellPath = beforeXpath + i +  afterXpath;
		List<String> textList = new ArrayList<String>();
		
		for(int i=2;i<numRows;i++) {
			String cellPath = beforeXpath + i +  afterXpath;
			String text = driver.findElement(By.xpath(cellPath)).getText();
			textList.add(text);
		}
		System.out.println(textList);
	}

}
