package testclasses2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass12 extends BaseTestSuite{
	
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_TestClass1 -> This runs once before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_TestClass1 -> This runs once after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNG_TestClass1 -> This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNG_TestClass1 -> This runs after every method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Running Test -> TestNG_TestClass1 -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> TestNG_TestClass1 -> testMethod2");
	}
}