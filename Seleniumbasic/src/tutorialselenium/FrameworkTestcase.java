package tutorialselenium;

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
import page.classes.*;

public class FrameworkTestcase {
	private String baseUrl = ("https://www.expedia.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    private WebDriver driver ;
    SearchPageFactory searchPage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactory (driver);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test1() throws Exception {
	driver.get(baseUrl);
	searchPage.clickFlightsTab();
	searchPage.setOriginCity("New York");
	searchPage.setDestinationCity("Chicago");
	searchPage.setdeparturedate("12/12/2018");
	searchPage.setreturndate("12/25/2018");
	
	}
	@After
	public void afterClass() {
	}
}