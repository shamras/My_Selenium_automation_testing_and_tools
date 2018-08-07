package ActionsClass;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions2 {
	public String baseUrl = ("https://jqueryui.com/droppable/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\GEKO2\\geckodriver-v0.20.1-win64\\geckodriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rassools\\Desktop\\GEKO2\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://jqueryui.com/droppable/";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception {
	driver.get(baseUrl);
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	
	WebElement fromElement = driver.findElement(By.id("draggable"));
	WebElement toElement = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions(driver);
	
	//Drag and drop
	//action.dragAndDrop(fromElement, toElement).build().perform();
	
	//Click and hold, move to element, release, build and perform
	action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	
	}}