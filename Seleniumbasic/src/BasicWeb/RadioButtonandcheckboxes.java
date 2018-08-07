package BasicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonandcheckboxes {

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
		
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		
		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		System.out.println("BMW Radio Button is selected? " + bmwRadioBtn.isSelected());
		System.out.println("Benz Radio Button is selected? " + benzRadioBtn.isSelected());
		System.out.println("BMW Checkbox is selected? " + bmwCheckBox.isSelected());
		System.out.println("Benz Checkbox is selected? " + benzCheckBox.isSelected());
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}
}

		
		

