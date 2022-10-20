package ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

// Reffered from this link : https://www.youtube.com/watch?v=WdenIgyGDyw
public class ExtentReportsDemo {

	@Test

	public void LoginTest() {

		System.out.println("Login to amazon");

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/test_report.html");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		ExtentTest logger = extent.createTest("LoginTest");

		logger.log(Status.INFO, "Login to Amazon");

		logger.log(Status.PASS, "Title Verified");

		extent.flush();

		ExtentTest logger1 = extent.createTest("LogoffTest");

		logger1.log(Status.FAIL, "Title Verified");

		extent.flush();

	}

}
