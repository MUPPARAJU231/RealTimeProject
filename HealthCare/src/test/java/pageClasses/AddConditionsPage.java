package pageClasses;

import org.openqa.selenium.By;

public class AddConditionsPage 
{
	public static By clickOnPatient()
	{
		return By.xpath("//a[.='Surya Bhai']");
	}
	public static By clickOnRecordConditions()
	{
		return By.xpath("//button[normalize-space()='Record conditions']");
	}
	
	public static By get_condition_Search()
	{
		return By.xpath("//INPUT[@ID='conditionsSearch']");
	}
	public static By selectDisease()
	{
		return By.xpath("//li[.='Acute Alcoholic Liver Disease']");
	}
	public static By selectClinicalStatus()
	{
		return By.xpath("//span[.='Active']");
	}
	public static By clickOnSave()
	{
		return By.xpath("//span[.='Save & close']");
	}
	
	public static By validateConditions()
	{
		return By.xpath("//td[.='Acute Alcoholic Liver Disease']");
	}
	
	
}
