package AppTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	@Test(priority=1)
	public void searchTest() throws InterruptedException {
	//	driver.get("https://www.google.com/");
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Thread.sleep(10);
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void btnSearchTest() {
		boolean newFlag = driver.findElement(By.name("btnK")).isDisplayed();
		Assert.assertTrue(newFlag);
	}
	
	@Test(priority=3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}
}
