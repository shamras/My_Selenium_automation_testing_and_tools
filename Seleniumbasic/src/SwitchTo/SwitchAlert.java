package SwitchTo;

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

public class SwitchAlert {
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
	
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
