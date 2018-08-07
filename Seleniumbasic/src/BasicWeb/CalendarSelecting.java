package BasicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelecting {
	public String baseUrl1 = ("https://www.expedia.com");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl1 = "https://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test1() throws Exception {
		driver.get(baseUrl1);
		// Click flights tab
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
		// Find departing field
		WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
		// Click departing field
		departingField.click();
		Thread.sleep(3000);
		// Find the date to be selected
		WebElement dateToSelect = driver.findElement(By.xpath("//div[@id=\"flight-departing-wrapper-hp-flight\"]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[7]/button[1]"));
		// Click the date
		dateToSelect.click();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
