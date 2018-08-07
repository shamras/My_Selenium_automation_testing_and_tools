package extendedreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
		public static ExtentReports getInstance() {
			ExtentReports extent;
			String Path = "C:\\Users\\rassools\\Desktop\\report-demo.html";
			extent = new ExtentReports(Path, false);
			extent
			.addSystemInfo("Selenium Version", "2.25")
			.addSystemInfo("Platform", "Windows");
			return extent;
			
		}

}
