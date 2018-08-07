package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
	
	@FindBy(id = "primary-header-home")
	WebElement HeaderHistory;
	
	@FindBy(id = "tab-flight-tab-hp")
	WebElement FlightsTab;
	
	@FindBy(id = "flight-origin-hp-flight")
	WebElement originCity;
	
	
	@FindBy(id = "flight-destination-hp-flight")
	WebElement destinationCity;
	
	
	@FindBy(id = "flight-departing-hp-flight")
	WebElement departuredate;
	
	@FindBy(id = "flight-returning-hp-flight")
	WebElement returndate;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		HeaderHistory.click();
		FlightsTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setdeparturedate(String departure) {
		departuredate.sendKeys(departure);
	}
	public void setreturndate(String retrn) {
		returndate.sendKeys(retrn);
	
}}
	

	
/*	@FindBy(id = "flight-type-roundtrip-label-hp-flight")
	WebElement rounTrip;
	
	@FindBy(id = "flight-type-multi-dest-label-hp-flight")
	WebElement multipleDestination;
	
	public void clickFlihgtTab() {
		FlightsTab.click();
		
	}
	public void clickrounTrip() {
		rounTrip.click();
	}
	public void clickmultipleDestination() {
		multipleDestination.click();*/
	
