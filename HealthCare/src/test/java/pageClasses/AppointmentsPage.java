package pageClasses;

import org.openqa.selenium.By;

public class AppointmentsPage 
{
	public static By clickOnAppointments()
	{
		return By.xpath("//a[@href='/openmrs/spa/home/appointments']");
	}
	public static By clickOnNewAppBtn()
	{
		return By.xpath("//button[@class='cds--btn cds--btn--sm cds--layout--size-sm cds--btn--primary']");
	}
	public static By get_Pat_Search()
	{
		return By.xpath("//input[@data-testid='patientSearchBar']");
	}
	public static By clickOnStartVisit()
	{
		return By.xpath("(//button[@class='cds--btn cds--btn--primary'])[1]");
	}
	public static By clickOnOPDVisit()
	{
		return By.xpath("//span[.='OPD Visit']");
	}
	public static By clickOnSubmit()
	{
		return By.xpath("//button[@type='submit']");
	}
	
	public static By clickOnHome()
	{
		return By.xpath("(//a[@href='/openmrs/spa/home'])[2]");
	}
	
	public static By getPatID()
	{
		return By.xpath("//tr[@data-parent-row='true']");
	}
}
