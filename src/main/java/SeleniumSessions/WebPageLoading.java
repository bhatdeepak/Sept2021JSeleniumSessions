package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageLoading {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://api.cogmento.com/register/");
		
		driver.findElement(By.partialLinkText("Log in here")).click();
		
		WebPageLoading wp = new WebPageLoading();
		
		wp.waitForPageLoaded();
		driver.findElement(By.name("email")).sendKeys("Deepak@dingdong.com");
	}	
		
		public void waitForPageLoaded() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String loadingStatus= js.executeScript("return document.readyState;").toString();
		
		if(loadingStatus.equals("complete")) {
			System.out.println("Page has loaded");
		}
		else
		{
			for(int i=1; i<=20; i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				loadingStatus = js.executeScript("return document.readyState;").toString();
				System.out.println("current page loading status :" +loadingStatus);
				if(loadingStatus.equals("complete")) {
					break;
				}
			}
		}
	}
}
