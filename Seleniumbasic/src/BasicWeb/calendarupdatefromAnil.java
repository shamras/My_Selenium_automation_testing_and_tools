package BasicWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendarupdatefromAnil {
	public String baseUrl = ("https://www.expedia.com");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void test1() throws Exception {
		driver.get(baseUrl);
		// Find departing field
		WebElement departingField = driver.findElement(By.id("package-departing-hp-package"));
		// Click departing field
		departingField.click();
		Thread.sleep(3000);
		// Find the date to be selected
		// It is just about finding the correct XPath
		// This Xpath will find date 26
		WebElement dateToSelect = driver.findElement(By.xpath("(//div[@class='datepicker-cal-month'])[1]//button[text()='26']"));
		// Click the date
		dateToSelect.click();
	}
	
	@Test
	public void test2() throws Exception {
		driver.get(baseUrl);
		WebElement departingField = driver.findElement(By.id("package-departing-hp-package"));
		departingField.click();
		WebElement calMonth = driver.findElement(By.xpath("(//div[@class='datepicker-cal-month'])[1]"));
		
		List<WebElement> allValidDates = calMonth.findElements(By.tagName("button"));
		
		Thread.sleep(3000);
		
		for (WebElement date : allValidDates) {
			if (date.getText().equals("26")) {
				date.click();
				break;
			}
	
		}}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
driver.quit();
}
}
	