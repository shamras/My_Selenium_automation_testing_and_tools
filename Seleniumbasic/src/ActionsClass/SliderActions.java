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
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	public String baseUrl = ("http://jqueryui.com/slider/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://jqueryui.com/slider/";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception {
	driver.get(baseUrl);
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	
	//Using the action class
	WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
	Actions action = new Actions(driver);
	///this action you drag the block further and further down or across, the 0 is only if you moving up or down
	action.dragAndDropBy(element, 400, 0).perform();
	}
	
	@After
	public void tearDown() throws Exception{
	
	}}