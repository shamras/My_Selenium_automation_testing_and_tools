
//////////site testing back and forward and refresh
package BasicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {
	public String baseUrl1 = ("http://letskodeit.teachable.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;
    
    
	@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl1 = "http://letskodeit.teachable.com/";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl1);
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+ title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		String urlToNavigate = 
		"https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		System.out.println("Naviagtion to log in");
		
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		driver.navigate().refresh();
		System.out.println("navigate refresh");
		driver.getCurrentUrl();
		System.out.println("navigate refresh");
		
		/*String pageSource = driver.getPageSource();
		System.out.println("pagesource");*/
		
	}

}
