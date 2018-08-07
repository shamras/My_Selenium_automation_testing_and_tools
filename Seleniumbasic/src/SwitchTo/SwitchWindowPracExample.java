package SwitchTo;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowPracExample {
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
	

		// Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		
		// Find Open Window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();

		// Get all handles
		Set<String> handles = driver.getWindowHandles();

		// Switching between handles
		for (String handle: handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		// Switch back to the parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}



