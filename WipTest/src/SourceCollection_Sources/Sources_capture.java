package SourceCollection_Sources;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sources_capture {
	public String baseUrl = ("https://wip.staging.ijetcorp.com");
	String driverPath = "/C:/Users/rassools/Desktop/IEDri/IEDriverServer.exe";
	public WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.out.println("launching google browser");
		System.setProperty("webdriver.chrome.driver", "/C:/Users/rassools/Desktop/ChromeD/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DUO_Auth() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(new String[] { "rassools" });
		driver.findElement(By.id("password")).sendKeys(new String[] { "ilikecarsandphotos" });
		driver.findElement(By.id("login-button")).click();
		driver.switchTo().frame(driver.findElement(By.id("duo_iframe")));
		;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement button = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".positive.auth-button[type='submit']")));
		button.click();
		// System.out.println("error");
		Thread.sleep(7000);
		// driver.switchTo().parentFrame();
		System.out.println("Duo passed");
		Thread.sleep(7000);

	}

	@Test
	public void Source_Collection() throws InterruptedException {
		driver.findElement(By.linkText("Sources")).click();
		// System.out.println("errorone");
		Thread.sleep(2000);
		driver.findElement(By.linkText("New source")).click();
		Thread.sleep(2000);
		System.out.println("Click Source Collection");
	}

}
