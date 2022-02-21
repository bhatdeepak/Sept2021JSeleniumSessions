package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		br.LaunchBrowser("chrome");
		br.enterURL("http://www.amazon.com");
		String title = br.getPageTitle();
		if(title.contains("Amazon")) {
			System.out.println("Correct page launched");
		}
		
		String url = br.getAppCurrentURL();
		System.out.println(url);
		br.closeBroweser();
	}

}
