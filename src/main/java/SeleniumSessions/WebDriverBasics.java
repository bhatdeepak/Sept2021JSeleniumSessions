package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open chrome
		//enter url
		//get the title - Validation point (actual vs expected)
		//get the URL
		//close the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Bhat\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
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
