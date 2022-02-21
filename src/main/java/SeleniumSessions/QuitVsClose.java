package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Bhat\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is : " + title);	
		
		driver.close();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		

		
	}

}
