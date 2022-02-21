package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-2nd-test-1277080/full-scorecard");
		
		Thread.sleep(3000);
		
		String tableRowXpath = "//h5[text()='India 1st INNINGS ']//ancestor::span/following-sibling::div//table[@class='table batsman']//tbody//a"; //kl rahul or 
		//opening batsman
		int rowCount = driver.findElements(By.xpath(tableRowXpath)).size();
		String newTableRowXpath = "//h5[text()='India 1st INNINGS ']//ancestor::span/following-sibling::div//table[@class='table batsman']//tbody/tr[";
		
		driver.findElement(By.xpath("//span[@class='Collapsible__trigger is-closed']//i")).click();
		
		//String status = tableRowXpath + "//parent::td//following-sibling::td//span";
		//String otherParameters = status + "//parent::td//following-sibling::td[";
		
		String builder="";
		
		for(int row=1; row<(rowCount*2); row++) {
			String trPath = newTableRowXpath + row + "]//a";
			System.out.println(trPath);
			String batName = driver.findElement(By.xpath(trPath)).getText().trim();
			System.out.println(batName);
			String statusPath = "//a[text()='" + batName + "']/parent::td/following-sibling::td//span";
			String battingStatus = driver.findElement(By.xpath(statusPath)).getText(); 
			String otherParametersPath = "//a[text()='" + batName + "']/parent::td/following-sibling::td[";
			for(int col=2;col<=7;col++) {
				String otherParametersCompletePath = otherParametersPath + col +"]";
				String values = driver.findElement(By.xpath(otherParametersCompletePath)).getText();
				if(!values.isEmpty()) {
					builder = builder + values + " ";
				}
			}
			System.out.println(batName + " " + battingStatus + " " + builder);
			builder = "";
			row++;
		}
		
		
		
	}

}
