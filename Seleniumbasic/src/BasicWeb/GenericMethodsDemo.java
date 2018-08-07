package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GenericMethodsDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		gm = new GenericMethods(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.linkText("Practice")).click();
		
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}
}


