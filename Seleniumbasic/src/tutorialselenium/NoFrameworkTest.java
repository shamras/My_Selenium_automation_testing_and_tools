package tutorialselenium;

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

public class NoFrameworkTest {
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

		driver.findElement(By.id("header-history")).click();
		driver.findElement(By.id("tab-flight-tab")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("New York");
		driver.findElement(By.id("flight-destination")).sendKeys("Chicago");
		driver.findElement(By.id("flight-departing")).sendKeys("10/28/2014");
		driver.findElement(By.id("flight-returning")).sendKeys("10/31/2014");
		driver.findElement(By.id("search-button")).click();
	}

	@After
	public void afterClass() {
	}

}