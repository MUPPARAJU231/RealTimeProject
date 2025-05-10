package pageClasses;

import org.openqa.selenium.By;

public class EndVisitPage 
{	
	public static By clickPatName()
	{		
	return	By.xpath("//a[.='Surya Bhai']");
	}
	public static By clickEndVisit()
	{		
	return	By.xpath("(//button[.='End visit'])[1]");
	}
	public static By selecetEndVisit()
	{		
	return	By.xpath("//button[@class='cds--btn cds--btn--danger']");
	}
	public static By validateEndVisit()
	{
		return By.xpath("//button[.='Start a visit']");
	}
}
