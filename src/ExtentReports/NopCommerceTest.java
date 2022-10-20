package ExtentReports;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

// Reffered from this link : https://www.youtube.com/watch?v=tovz1q5Unxs
public class NopCommerceTest {

	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setExtent() {
		// specify location of the report
		htmlReporter = new ExtentHtmlReporter("./Reports/second_report.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
	}

	// Test1
	@Test
	public void noCommerceTitleTest() {
		test = extent.createTest("noCommerceTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store");
		test.log(Status.PASS, "Title Verified");
	}
	// Test2

	@Test
	public void noCommerceLogoTest() {
		test = extent.createTest("noCommerceLogoTest");
		boolean b = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		driver.quit();
	}
}
