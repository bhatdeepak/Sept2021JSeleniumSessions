package SeleniumSessions;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationTest {
	
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS.....DBConnection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT...createuser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC...launchBrowser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM....logintoApp");
	}
	
	@Test
	public void userInfoTest() {
		System.out.println("userInfotest");
	}
	
	@Test
	public void accountInfoTest() {
		System.out.println("AccountInfotest");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AM....logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC...close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT....delete user");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS.......disconnectDB");
	}

}
