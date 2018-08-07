package testclasses2;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object [][] {
			{"bmw","m3"},
			{"Audi","A6"},
			{"Benz","c300"}
		};
		
	}

}
