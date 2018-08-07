package Waittypes;



	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ImplicitWaitDemo {
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
			
			
			
			
		}
		@Test()
		public void test() throws Exception {
			driver.get(baseUrl1);
			driver.findElement(By.linkText("Login")).click();
			
			WebDriverWait  wait = new WebDriverWait (driver,3);
			WebElement emailField = 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
			emailField.sendKeys("test");
			driver.findElement(By.id("user_email")).sendKeys("test");
		}
		
	
		@After
		public void tearDown() throws Exception {
			Thread.sleep(3000);
			driver.quit();
		}
	
	}