package PracticeExercise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Exercise1 {
	
	/*public String baseUrl = ("https://letskodeit.teachable.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver;*/
	WebDriver driver;
	String baseURL;
	

  @Test
  public void login() {
	  driver.get (baseURL);
	  driver.findElement(By.xpath("//div[@id='navbar']//ul[@class='nav navbar-nav navbar-right']//a[@href='/sign_in']")).click();
	  driver.findElement(By.id("user_email")).sendKeys("rassools@ijet.com");
	  driver.findElement(By.id("user_password")).sendKeys("shamras21");
	  driver.findElement(By.id("//input[@class='btn btn-primary btn-md login-button']")).click();
	  	  
  }
  @BeforeClass
  @Parameters({"browser"})
  public void setup(String browser) {
			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
			driver = new ChromeDriver();*/
			baseURL = "https://letskodeit.teachable.com/";
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\rassools\\Desktop\\GEKO\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
					
  }

  @AfterTest
  public void afterTest() {
  }

}
