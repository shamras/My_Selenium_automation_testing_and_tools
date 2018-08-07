package tutorialselenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPage;
import page.classes.SearchPageFactory;

public class FindLinks {
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
	public void testFindLinks() {
		driver.get(baseUrl);
		SearchPage.navigateToFlightsTab(driver);
		
		List<WebElement> linksList = clickableLinks(driver);
		for (WebElement link : linksList) {
			String href = link.getAttribute("href");
			try {
				System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
	public static List<WebElement> clickableLinks(WebDriver driver) {
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		
		
		///you can change the tag names to suite your element
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for (WebElement e : elements) {
			if (e.getAttribute("href") != null) {
				linksToClick.add(e);
			}
		}
		return linksToClick;
	}
	
	public static String linkStatus(URL url) {
		// http://download.java.net/jdk7/archive/b123/docs/api/java/net/HttpURLConnection.html#getResponseMessage%28%29
		try {
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			String responseMessage = http.getResponseMessage();
			http.disconnect();
			return responseMessage;
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@After
	public void tearDown() throws Exception {
	}
}
