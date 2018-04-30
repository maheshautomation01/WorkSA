package ExtentReports;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportClass {
	
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void setupp(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Mahesh_ExtentReport.html",true);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		extent.addSystemInfo("Host Name", "Local Host")
		.addSystemInfo("Environment","Automation Test")
		.addSystemInfo("User Name", "Maheshwaran")
		.addSystemInfo("Date", date1);
		
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}

	
	@Test
	public void passTest(){
		logger = extent.startTest("Pass Test");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Testcase passed is Passed");
	}
	
	@Test
	public void failTest(){
		logger = extent.startTest("Fail Test");
		Assert.assertTrue(false);
		logger.log(LogStatus.FAIL, "Testcase (failTest) is Passed");
	}
	
	
	@Test
	public void skipTest(){
		logger = extent.startTest("Skip Test");
		throw new SkipException("Skipping - This is not ready for Testing");
	}
	
	
	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test Case   :"+ result.getName()+"  is Failed");
			logger.log(LogStatus.FAIL, "Failure Reason is :"+ result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS){
			logger.log(LogStatus.PASS, "Test Case   :"+ result.getName()+"  is Passed");
		}else if(result.getStatus()==ITestResult.SKIP){
			logger.log(LogStatus.SKIP, "Test Case   :"+ result.getName()+"  is Skipped");
		}
		extent.endTest(logger);
			
	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
	
	
}
