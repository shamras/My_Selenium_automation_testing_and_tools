package BasicWeb;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes implements WebDriver {
	WebDriver driver;
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max:: " + timeout + " seconds for element to be available");
			
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element appeared on the web page");	
		} catch(Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
}
