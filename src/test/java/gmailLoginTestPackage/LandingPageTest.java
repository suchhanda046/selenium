package gmailLoginTestPackage;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.Test;

public class LandingPageTest {
	//public ITestResult result;
	public ExtentHtmlReporter reporter;
	public ExtentReports report;
	public ExtentTest test;
	
	@BeforeTest
	public void beforeTest() {
		reporter=new ExtentHtmlReporter("./test-output/ExtentReport.html");
		report=new ExtentReports();
		report.attachReporter(reporter);
		
	}
	
	@Test
	public void test1() {
		test=report.createTest("testing test1");
		System.out.print("test1");
	}
	
	@Test
	public void test2() {
		test=report.createTest("testing test2");
		System.out.print("test2");
	}
	
	@Test
	public void test3() {
		test=report.createTest("testing test3");
		System.out.print("test3");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test4() {
		test=report.createTest("testing test4");
		System.out.print("test4");
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void afterTest(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.fail("failed");
			report.flush();
			
		}
		
	}
	

}
