package testClasses;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentManager;

public class ExtentReport 
{
	 ExtentReports extent;
	    ExtentTest test;

	    @BeforeSuite(alwaysRun=true)
	    public void setup() {
	   
	     extent = ExtentManager.getInstance();
	    }

	    @Test(priority=6, groups = {"sanity"})
	    public void demoTest() {
	        test = extent.createTest("LoginTest");
	        test = extent.createTest("RegisterPatientTest");
	        test = extent.createTest("AppointmentsTest");
	        test = extent.createTest("AddPatVitalsTest");
	        test = extent.createTest("AddConditionsTest");
	        test = extent.createTest("EndVisitTest");
	        test.pass("Test case passed successfully!");
	        Reporter.log("All scenarios passed");
	    }

	    @AfterSuite(alwaysRun=true)
	    public void tearDown() {
	        extent.flush(); // Important to write the report!
	    }

}
