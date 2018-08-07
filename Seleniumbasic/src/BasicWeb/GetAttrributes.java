package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrributes {

	private WebDriver driver;
	private String baseurl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseurl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize the browser and window
		driver.manage().window().maximize();
		
		
	}
///////////////////this is to show you the type is a text attribute
	@Test
	public void testGetText() throws Exception{
		driver.get(baseurl);
		driver.findElement(By.linkText("Practice")).click();
		
		WebElement element = driver.findElement(By.id("name"));
		String attributeValue = element.getAttribute("type");
		
		System.out.println("Value of attribue is: " + attributeValue);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
		

