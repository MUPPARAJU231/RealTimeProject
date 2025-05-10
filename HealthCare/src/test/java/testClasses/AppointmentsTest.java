package testClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.AppointmentsPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
import utilities.RetryAnalyzer;

@Listeners(ListenerImplementation.class)
public class AppointmentsTest extends BaseClass
{
	@Test(priority=2,retryAnalyzer = RetryAnalyzer.class, groups= {"smoke"})
	public void createNewAppointment()
	{
		LoginTest.executeLoginTest();
		addExplicitWait(AppointmentsPage.clickOnAppointments());
		driver.findElement(AppointmentsPage.clickOnAppointments()).click();
		addExplicitWait(AppointmentsPage.clickOnNewAppBtn());
		driver.findElement(AppointmentsPage.clickOnNewAppBtn()).click();
		addExplicitWait(AppointmentsPage.get_Pat_Search());
		driver.findElement(AppointmentsPage.get_Pat_Search()).sendKeys("Surya");
		addExplicitWait(AppointmentsPage.clickOnStartVisit());
		driver.findElement(AppointmentsPage.clickOnStartVisit()).click();
		addExplicitWait(AppointmentsPage.clickOnOPDVisit());
		driver.findElement(AppointmentsPage.clickOnOPDVisit()).click();
		addExplicitWait(AppointmentsPage.clickOnSubmit());
		driver.findElement(AppointmentsPage.clickOnSubmit()).submit();
		addExplicitWait(AppointmentsPage.clickOnHome());
		driver.findElement(AppointmentsPage.clickOnHome()).click();
		addExplicitWait(AppointmentsPage.getPatID());
		boolean patID= driver.findElement(AppointmentsPage.getPatID()).isEnabled();
		Assert.assertEquals(patID, true);
		System.out.println("New Appointment Created");
	}
	
}
