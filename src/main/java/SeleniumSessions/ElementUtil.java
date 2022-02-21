package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		
		switch(locatorType.toLowerCase()){
			case "id":
				locator = By.id(locatorValue);
				break;
			case "xpath":
				locator = By.xpath(locatorValue);
				break;
			case "classname":
				locator = By.className(locatorValue);
				break;
			case "cssselector":
				locator = By.cssSelector(locatorValue);
				break;
			case "partiallinktext":
				locator = By.partialLinkText(locatorValue);
				break;
			case "linktext":
				locator = By.linkText(locatorValue);
				break;
			case "name":
				locator = By.name(locatorValue);
			case "tagname":
				locator = By.tagName(locatorValue);
				break;
			default:
				System.out.println("please pass the right locator and value");
		}
		
		return locator;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType,locatorValue));
	}
	
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType,locatorValue).sendKeys(value);
	}
	
	public String doGetText(String locatorType, String locatorValue) {
		return getElement(locatorType, locatorValue).getText();
	}
	
	public void doClick(String locatorType, String locatorValue) {
		getElement(locatorType,locatorValue).click();
	}
	
	public List<WebElement> getElements(String locatorType, String locatorValue) {
		return driver.findElements(getBy(locatorType, locatorValue));
	}
	
	public int getElementsCount(String locatorType, String locatorValue) {
		return getElements(locatorType, locatorValue).size();
	}
	
	public List<String> getElementsTextList (String locatorType, String locatorValue){
		List<WebElement> eleWebTextList = getElements(locatorType, locatorValue);
		List<String> eleTextList = new ArrayList<String>(); 
		for(WebElement e : eleWebTextList) {
			String eleText = e.getText();
			if(!eleText.isEmpty()) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}
	
	public List<String> getAttributeList (String locatorType, String locatorValue, String attrname){
		List<WebElement> eleWebTextList = getElements(locatorType, locatorValue);
		List<String> eleTextList = new ArrayList<String>(); 
		for(WebElement e : eleWebTextList) {
			String eleText = e.getAttribute(attrname);
			if(!eleText.isEmpty()) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}
	
		
	public void printElementValues(List<String> eleList) {
		for(String e: eleList) {
			System.out.println(e);
		}
	}
}
