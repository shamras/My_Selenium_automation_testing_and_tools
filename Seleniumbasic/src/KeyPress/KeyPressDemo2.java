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

public class KeyPressDemo2 {
	public String baseUrl = ("https://learn.letskodeit.com/p/practice");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception {
	driver.get(baseUrl);
	//can do it this way or
	//driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
	Thread.sleep(2000);
	
	//can do it this way or
	///driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL + "a"));
	//Thread.sleep(2000);
	
	//can do it this way or
	String selectAll = Keys.chord(Keys.CONTROL + "a");
	driver.findElement(By.id("openwindow")).sendKeys(selectAll);
	Thread.sleep(2000);
	}
	@After
	public void tearDown() throws Exception {
	driver.quit();
	}
	}

