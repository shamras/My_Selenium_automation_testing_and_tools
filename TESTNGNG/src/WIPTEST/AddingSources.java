package WIPTEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddingSources {

	public WebDriver driver;
	public String baseURL;
	////// add the report dash
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforetest() {
		baseURL = "https://wip.staging.ijetcorp.com";
		////// add the report dash and where you going to save the file on Desktop
		report = new ExtentReports("C:\\Users\\rassools\\Documents\\wiplogintest.html");
		// add the report logs
		test = report.startTest("Wip_Test enter Duo and add source");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		// add the report logs
		test.log(LogStatus.INFO, "browser started...");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add the report logs
		test.log(LogStatus.INFO, "browser maximized");
		driver.manage().window().maximize();
		driver.get(baseURL);
		// add the report logs
		test.log(LogStatus.INFO, "enter into wip browser application");
		
	}

	@Test
	public void DUO_Auth() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys(new String[] { "rassools" });
		test.log(LogStatus.INFO, "enter username");
		
		driver.findElement(By.id("password")).sendKeys(new String[] { "ilikephotosandcars" });
		test.log(LogStatus.INFO, "enter password");
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(7000);
		driver.switchTo().frame(driver.findElement(By.id("duo_iframe")));
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement button = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".positive.auth-button[type='submit']")));
		button.click();
		// System.out.println("error");
		Thread.sleep(7000);
		// driver.switchTo().parentFrame();
		test.log(LogStatus.INFO, "click login");
		test.log(LogStatus.INFO, "send push");
		test.log(LogStatus.INFO, "Duo Passed");
		
		Thread.sleep(8000);
		driver.findElement(By.linkText("Sources")).click();
		test.log(LogStatus.INFO, "click source");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("New source")).click();
		Thread.sleep(2000);
	
		test.log(LogStatus.INFO, "add new source");
		
		test.log(LogStatus.PASS, "Verified login successful");
		
		
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		//add the report logs to end test
		report.endTest(test);
		//add the report logs to flush out test
		report.flush();
	}
}