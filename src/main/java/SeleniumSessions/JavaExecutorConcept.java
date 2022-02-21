package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://crmpro.com/index.html");
	
//		driver.get("https://www.amazon.com/");
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("alert('hi')");
		
		String text = js.executeScript("return document.title").toString();
		
		System.out.println(text);
		
		String message = "This is my alert";
		
	//	js.executeScript("alert('"+message+"')");
		
//		String innerText = js.executeScript("return document.documentElement.innerText;").toString();
//		
//		System.out.println(innerText);
		
	//	WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		
		//js.executeScript("arguments[0].style.border='3px solid red'",login);
		
//		String bgcolor = login.getCssValue("backgroundColor");
//		
//		for(int i =1 ; i<80; i++) {
//			js.executeScript("arguments[0].style.backgroundColor = 'rgb(0,200,0)'", login);
//			try {
//				Thread.sleep(200);
//			}catch(InterruptedException e) {
//				
//			}
//			js.executeScript("arguments[0].style.backgroundColor = '"+bgcolor+"'", login);
//		}
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
		//https://amazon.com
//		WebElement element = driver.findElement(By.xpath("//span[text()='Popular products in PC internationally']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//https://demo.opencart.com/index.php?route=account/register
		js.executeScript("document.getElementById('input-firstname').value='Deepak'");
		
		//to get the value from tthe text box do a getAttribute value method
		
		WebElement element = driver.findElement(By.id("input-firstname"));
		
		String newval = element.getAttribute("value");
		System.out.println(newval);
	}

}
