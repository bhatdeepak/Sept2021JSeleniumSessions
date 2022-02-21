package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverCastings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. WD - CD
		//WebDriver driver = new ChromeDriver();
		
		//2. ChromerDriver driver = new ChromeDriver();
		
	//3. Remote WD - CD
	//	RemoteWebDriver driver = new ChromeDriver();
		
		//Capabilities capabilities;
		//WebDriver driver = new RemoteWebDriver(new URL("193.44.33.4:4455"), capabilities);
		
		//Search Contect - WD
		//SearchContext driver = new ChromeDriver(); //never do top casting since there are only two elements that you will get here
		
	}

}
