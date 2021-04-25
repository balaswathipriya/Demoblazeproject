package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	static ExtentReports extent;
	static ExtentSparkReporter Spark;
	static ExtentTest test;
	
	public static void setup() {
		 extent = new ExtentReports();
		 Spark=new ExtentSparkReporter("target/Spark.html");
		 extent.attachReporter(Spark);
	     test=extent.createTest("demotest");
		
	}
	
	public static void repopass() {
		
		test.pass("test is pass");
		extent.flush();
		
	}
	public static void repofail() {
		
		test.fail("test is fail");
		test.addScreenCaptureFromPath("C:\\Users\\prave\\eclipse-workspace\\demoblaze\\src\\test\\java\\uitesting.png");
		extent.flush();
	}

}
