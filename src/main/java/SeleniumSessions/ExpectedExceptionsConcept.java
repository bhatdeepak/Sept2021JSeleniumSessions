package SeleniumSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

	String name = "Tom";
	
	//@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		System.out.println("login....");
		int i = 9/0;
		ExpectedExceptionsConcept ref = new ExpectedExceptionsConcept();
		ref = null;
		System.out.println(ref.name);
		
	}
}
