package KeyPress;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyPressDemo1 {
	public String baseUrl = ("https://learn.letskodeit.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception {
	driver.get(baseUrl);

	driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
	driver.findElement(By.id("user_email")).sendKeys("test@email.com");
	Thread.sleep(2000);
	/*driver.findElement(By.id("user_password")).sendKeys("123123");
	Thread.sleep(2000);
	/////use this to click enter
	driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
	or use this for TAB key*/
	driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
	
	}
	
	@After
	public void tearDown() throws Exception {
	}
}

