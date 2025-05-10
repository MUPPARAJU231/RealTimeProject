package testClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.RecordPatientDetailsPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
import utilities.RetryAnalyzer;

@Listeners(ListenerImplementation.class)
public class AddPatVitalsTest extends BaseClass
{
	@Test(priority=3, groups = {"sanity"}, retryAnalyzer = RetryAnalyzer.class)
	public void addPatVitals() 
	{
		LoginTest.executeLoginTest();
		addExplicitWait(RecordPatientDetailsPage.clickPatName());
		driver.findElement(RecordPatientDetailsPage.clickPatName()).click();
		
		addExplicitWait(RecordPatientDetailsPage.recordVitals());
		driver.findElement(RecordPatientDetailsPage.recordVitals()).click();
		
		addExplicitWait(RecordPatientDetailsPage.temprature());
		driver.findElement(RecordPatientDetailsPage.temprature()).sendKeys("26");;
		addExplicitWait(RecordPatientDetailsPage.systolic());
		driver.findElement(RecordPatientDetailsPage.systolic()).sendKeys("120");
		addExplicitWait(RecordPatientDetailsPage.diastolic());
		driver.findElement(RecordPatientDetailsPage.diastolic()).sendKeys("80");
//		addExplicitWait(RecordPatientDetailsPage.heartRate());
//		driver.findElement(RecordPatientDetailsPage.heartRate()).sendKeys("78");
		addExplicitWait(RecordPatientDetailsPage.respirationRate());
		driver.findElement(RecordPatientDetailsPage.respirationRate()).sendKeys("12");
		addExplicitWait(RecordPatientDetailsPage.spo2());
		driver.findElement(RecordPatientDetailsPage.spo2()).sendKeys("99");
		addExplicitWait(RecordPatientDetailsPage.PatWeight());
		driver.findElement(RecordPatientDetailsPage.PatWeight()).sendKeys("85");
		addExplicitWait(RecordPatientDetailsPage.patHeight());
		driver.findElement(RecordPatientDetailsPage.patHeight()).sendKeys("173");
		addExplicitWait(RecordPatientDetailsPage.muac());
		driver.findElement(RecordPatientDetailsPage.muac()).sendKeys("110");
		addExplicitWait(RecordPatientDetailsPage.submitDetails());
		driver.findElement(RecordPatientDetailsPage.submitDetails()).click();
		addExplicitWait(RecordPatientDetailsPage.validatePatVitals());
		boolean val=	driver.findElement(RecordPatientDetailsPage.validatePatVitals()).isDisplayed();
		Assert.assertEquals(val, true);
	}
}
