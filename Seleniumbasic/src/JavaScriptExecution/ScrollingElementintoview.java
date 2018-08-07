package JavaScriptExecution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingElementintoview {
	private String baseUrl = ("https://letskodeit.teachable.com/pages/practice");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
	private WebDriver driver ;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		js = (JavascriptExecutor) driver;
	}

	

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		//navigation
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
		String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
		Thread.sleep(2000);
		
		//scroll down
		js.executeScript("window.scrollBy(0,1900);");
		Thread.sleep(2000);
		
		//scroll up
		js.executeScript("window.scrollBy(0,-1900);");
		Thread.sleep(2000);
		
		//scroll element into view
		WebElement element = driver.findElement(By.id("Mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
