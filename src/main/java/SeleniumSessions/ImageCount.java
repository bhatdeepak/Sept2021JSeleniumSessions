package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.LaunchBrowser("chrome");
		
		brUtil.enterURL("https://www.amazon.com");
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		System.out.println( elUtil.getElementsCount("tagname", "a") );
		
		List<String> textList = elUtil.getElementsTextList("tagname", "a");
		
		elUtil.printElementValues(textList);
		
		List<String> attr = elUtil.getAttributeList("tagname","img","src");
		
		elUtil.printElementValues(attr);
		
		brUtil.closeBroweser();
	}

}
