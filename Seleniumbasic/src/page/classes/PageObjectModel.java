package page.classes;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import page.classes.SearchPage;

public class PageObjectModel {
	public String baseUrl = ("https://www.expedia.com");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception {
	driver.get(baseUrl);
	SearchPage.fillOriginTextBox(driver,"NewYork");
	SearchPage.destinationTextBox(driver).sendKeys("Chicago");
	SearchPage.departureDateTextBox(driver).sendKeys("12/25/2018");
	SearchPage.returnDateTextBox(driver).sendKeys("12/31/2018");
	SearchPage.clickOnSearchButton(driver);
	}
	

@After
public void afterClass() {
}
}