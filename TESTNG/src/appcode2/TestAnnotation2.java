package appcode2;

import org.testng.annotations.Test;
import appcode2.SomeClassToTest;

public class TestAnnotation2 {
	
	@Test
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}