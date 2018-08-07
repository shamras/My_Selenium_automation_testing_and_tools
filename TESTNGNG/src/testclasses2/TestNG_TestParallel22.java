package testclasses2;

import org.testng.annotations.Test;

public class TestNG_TestParallel22 {
	
	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("TestNG_TestParallel22 -> testMethod1");
		Thread.sleep(6000);
		System.out.println("TestNG_TestParallel22 -> testMethod1 -> more steps");
	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_TestParallel22 -> testMethod2");
		Thread.sleep(6000);
		System.out.println("TestNG_TestParallel22 -> testMethod2 -> more steps");
	}
}

