package SeleniumSessions;


import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=2)
	public void aTest() {
		System.out.println("a test");
	}
	
	@Test(priority=1)
	public void bTest() {
		System.out.println("b test");
	}
	
	@Test(priority=0)
	public void cTest() {
		System.out.println("c test");
	}
	
	@Test
	public void dTest() {
		System.out.println("d test");
	}
	
	@Test
	public void eTest() {
		System.out.println("e test");
	}
}
