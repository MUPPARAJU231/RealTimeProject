package pageClasses;

import org.openqa.selenium.By;

public class RecordPatientDetailsPage 
{
	public static By clickPatName()
	{		
	return	By.xpath("//a[.='Surya Bhai']");
	}
	
	public static By recordVitals()
	{
		return	By.xpath("//button[contains(@class,'recordVitalsButton')]");
	}
	
	public static By temprature()
	{
		return	By.xpath("//input[@name='Temperature']");
	}
	
	public static By systolic()
	{
		return	By.xpath("//input[@name='systolic']");
	}
	
	public static By diastolic()
	{
		return	By.xpath("//input[@name='diastolic']");
	}
	
	public static By heartRate()
	{
		return	By.xpath("//input[@name='pulse']");             //input[@id=':rpv:-pulse']
	}
	public static By respirationRate()
	{
		return	By.xpath("//input[@name='Respiration rate']");
	}
	
	public static By spo2()
	{
		return	By.xpath("//input[@name='Oxygen saturation']");
	}
	public static By PatWeight()
	{
		return	By.xpath("//input[@name='Weight']");
	}
	public static By patHeight()
	{
		return	By.xpath("//input[@name='Height']");
	}
	public static By muac()
	{
		return	By.xpath("//input[@name='MUAC']");
	}
	
	public static By submitDetails()
	{
		return	By.xpath("//button[@type='submit']");
	}
	
	public static By validatePatVitals()
	{
		return	By.xpath("//span[.='Vitals and biometrics']");
	}

}
