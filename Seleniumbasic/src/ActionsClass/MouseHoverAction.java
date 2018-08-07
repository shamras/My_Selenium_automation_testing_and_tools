package ActionsClass;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public String baseUrl = ("https://learn.letskodeit.com/p/practice");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;
    JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		jse = (JavascriptExecutor)driver;
		
	}
	@Test
public void test1() throws Exception {
	driver.get(baseUrl);
		
	jse.executeScript("window.scrollBy(0, 800)");
		Thread.sleep(2000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(subElement).click().perform();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
