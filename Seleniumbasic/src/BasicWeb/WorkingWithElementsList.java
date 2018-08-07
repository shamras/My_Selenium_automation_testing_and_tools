package BasicWeb;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithElementsList {
	public String baseUrl1 = ("http://letskodeit.teachable.com/");
	String driverPath = "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe";
    public WebDriver driver ;
    
    
	@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rassools\\Desktop\\ChromeD\\chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl1 = "http://letskodeit.teachable.com/";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl1);
		String title = driver.getTitle();
		driver.findElement(By.linkText("Practice")).click();
		Thread.sleep(2000);
		boolean isChecked = false;
		
		List<WebElement> radioButtons = driver.findElements(
				By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		
		//////when selection all 3 with name
		/*List<WebElement> radioButtons = driver.findElements(By.name("cars"));*/
		int size = radioButtons.size();
		System.out.println("Size of the list: " + size);
		for (int i=0; i<size; i++) {
			isChecked = radioButtons.get(i).isSelected();
			
			if (!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}}}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
