package BasicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShots {
	public String baseUrl1 = ("https://www.expedia.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl1 = "https://www.expedia.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl1);
		String title = driver.getTitle();
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
		
		
		//Find Elements
		 driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("New York");
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("New York");
		 driver.findElement(By.id("flight-departing-hp-flight")).clear();
		 driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("09/10/2014");
		 Thread.sleep(8000);
		//driver.findElement(By.xpath("//div[@id='wizard-tabs']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector(".package-form-fields [type=\"submit\"]"));
		
		
	}
	///////the sreeenshot part 
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(10) + ".png";
		String directory = "C:\\Users\\rassools\\Desktop\\screenshotsSL";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
	}
}