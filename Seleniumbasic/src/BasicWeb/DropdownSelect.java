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
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
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

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl1);
		String title = driver.getTitle();
		driver.findElement(By.linkText("Practice")).click();
		Thread.sleep(2000);
		
		WebElement dropdownElement = driver.findElement(By.id("carselect"));
		Select dropdown = new Select(dropdownElement);
		
		Thread.sleep(2000);
		System.out.println("Select Bens by value");
		dropdown.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("Select Bens by index");
		dropdown.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select Bens by visiable text");
		dropdown.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");////this part doesnt work quite correctly
		List<WebElement> options = dropdown.getOptions();
		int size = options.size();
		
		for (int i=0; i<size; i++) {
			String optionName = options.get(i).getText();
		}
		
	}

}
