
/////there is an error in this code because the element is not correct

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

public class ElementState {
	public String baseUrl1 = ("https://www.google.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;
    
    
	@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl1 = "https://www.google.com/";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl1);
		String title = driver.getTitle();
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		System.out.println("E1 is Enabled? " + e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("E2 is Enabled? " + e2.isEnabled());
		
		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("E3 is Enabled? " + e3.isEnabled());
		
		e3.sendKeys("letskodeit");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
}

		
		

