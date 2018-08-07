package extendedreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

public class HomePage {
	ExtentTest test;
	WebDriver driver = null;
	
	public HomePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	public void clickonloginLink() {
		driver.findElement(
				
		By.xpath("//div[@id='navbar']//ul[@class='nav navbar-nav navbar-right']//a[@href='/sign_in']")).click();
		test.log(LogStatus.INFO, "click log in");	
		//add the report logs
	}
	
	public void enterEmailaddress (String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
		//add the report logs
		test.log(LogStatus.INFO, "enter email");
	}
	
	public void enterpassword (String password) {

		driver.findElement(By.id("user_password")).sendKeys(password);
		//add the report logs
		test.log(LogStatus.INFO, "password");
	}
	
	public void clickcommit() {
		driver.findElement(By.name("commit")).click();
		//add the report logs
		test.log(LogStatus.INFO, "login button");
		
		
	}
	
	
	
}
