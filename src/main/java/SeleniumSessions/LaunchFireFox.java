package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak Bhat\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //launch chrome
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		
		if(title.equals("Google")) {
			System.out.println("Pass ----- correct title");
		}else 
		{
			System.out.println("Fail ----- incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();	
	}

}
