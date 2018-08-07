package testclasses2;

/*import org.testng.annotations.DataProvider;*/
import org.testng.annotations.Test;

public class TestNG_DataProviders2 {
	
/*	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object [][] {
			{"bmw","m3"},
			{"Audi","A6"},
			{"Benz","c300"}
		};
		
	}*/
	
	
	@Test(dataProvider = "inputs",dataProviderClass = TestData.class)
	public void testMethod1(String input1,String input2) {
		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
	}

}
