package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo {

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

	@Test
	public void testGetText() throws Exception{
		driver.get(baseurl);
		driver.findElement(By.linkText("Practice")).click();
		
		WebElement buttonElement = driver.findElement(By.id("opentab"));
		String elementText = buttonElement.getText();
		
		System.out.println("Text on the element is: "+ elementText);
		
		
	}
	
	
}
