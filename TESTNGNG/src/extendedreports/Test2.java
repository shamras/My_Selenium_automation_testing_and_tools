package extendedreports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test2 {
	ExtentReports report;
	ExtentTest test;
	
	
		@BeforeClass
		public void beforeClass() {
			report = ExtentFactory.getInstance();
			//add the report logs
			test =report.startTest("Test2 Class -> Veriication");
			
		}
		
		@Test
		public void testMethod() {
			test.log(LogStatus.INFO, "Test2 -> testMethod started....");
			test.log(LogStatus.INFO, "Test2 -> testMethod continue....");
			test.log(LogStatus.INFO, "Test2 -> testMethod end....");
		}
		
		@AfterClass
		public void afterClass() {
			report.endTest(test);
			report.flush();
			
		}
}
