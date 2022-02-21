package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * 
	 * @param Launch browser
	 * @return return the webdriver object
	 */
	public WebDriver LaunchBrowser(String browser) { 
		
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Bhat\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); //launch chrome
		}else
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak Bhat\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); //launch firefox
		}

		return driver;
	}
	
	/**
	 * This method is used to enter the URL
	 * @param url
	 */
	public void enterURL (String url) {
		if(url==null) {
			System.out.println("url is null..");
			return;
		}
		if(url.indexOf("http")==-1) {
			System.out.println("http is missing URL");
			return;
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getAppCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void closeBroweser() {
		driver.close();
	}
	
}
