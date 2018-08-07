package extendedreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumLoginTest2 {
	
	private WebDriver driver;
	private String baseURL;
	//////add the report dash
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforetest(){
		baseURL = "https://letskodeit.teachable.com/";
	//////add the report dash and where you going to save the file on Desktop
		report = new ExtentReports("C:\\Users\\rassools\\Desktop\\logintest.html");
		//add the report logs
		test =report.startTest("Verify welcome test");
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		//add the report logs
		 test.log(LogStatus.INFO, "browser started...");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//add the report logs
		test.log(LogStatus.INFO, "browser maximized");
		driver.manage().window().maximize();
		driver.get(baseURL);
		//add the report logs
		test.log(LogStatus.INFO, "web app opened");
	}

	@Test
	public void testlogin() throws InterruptedException {

		driver.get(baseURL);
		driver.findElement(
				
			By.xpath("//div[@id='navbar']//ul[@class='nav navbar-nav navbar-right']//a[@href='/sign_in']")).click();
		//add the report logs
		test.log(LogStatus.INFO, "login link");
		
		driver.findElement(By.id("user_email")).sendKeys("rassools@ijet.com");
		//add the report logs
		test.log(LogStatus.INFO, "enter email");
		
		driver.findElement(By.id("user_password")).sendKeys("shamras21");
		//add the report logs
		test.log(LogStatus.INFO, "password");
		
		driver.findElement(By.name("commit")).click();
		//add the report logs
		test.log(LogStatus.INFO, "login button");
		
		//add the report log at the end add a PASS if your original automation is successful
		test.log(LogStatus.PASS, "Verified login successful");
		
		}
		
		@AfterClass
		public void afterClass() {
			driver.quit();
			//add the report logs to end test
			report.endTest(test);
			//add the report logs to flush out test
			report.flush();
		}
}
