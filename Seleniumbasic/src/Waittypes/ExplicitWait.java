package Waittypes;



	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class ExplicitWait {
		public String baseUrl1 = ("http://letskodeit.teachable.com/");
		String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
	    public WebDriver driver;

		
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl1 = "http://letskodeit.teachable.com/";
			
			///maximize the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			
		}
		@Test()
		public void test() throws Exception {
			driver.get(baseUrl1);
			driver.findElement(By.linkText("Login")).click();
			
			driver.findElement(By.id("user_email")).sendKeys("test");
		}
		
	
		@After
		public void tearDown() throws Exception {
			Thread.sleep(3000);
			driver.quit();
		}
	
	}