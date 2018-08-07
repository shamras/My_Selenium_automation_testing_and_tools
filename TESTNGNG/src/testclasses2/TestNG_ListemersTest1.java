package testclasses2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(CustomListener1.class)
public class TestNG_ListemersTest1 {
	
	@BeforeClass
	public void setup() {
		System.out.println("code in before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("code in after class");
		
	}

	@Test
	public void testMethod1() {
		System.out.println("code in testMethod1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("code in testMethod2");
		Assert.assertTrue(true);
	
}}


