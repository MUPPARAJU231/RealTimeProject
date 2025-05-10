package testClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.AddConditionsPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
import utilities.RetryAnalyzer;

@Listeners(ListenerImplementation.class)
public class AddConditionsTest extends BaseClass
{
	@Test(priority=4,groups= {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
	public static void recordConditions()
	{
		LoginTest.executeLoginTest();
		addExplicitWait(AddConditionsPage.clickOnPatient());
		driver.findElement(AddConditionsPage.clickOnPatient()).click();
		
		addExplicitWait(AddConditionsPage.clickOnRecordConditions());
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search=	wait.until(ExpectedConditions.visibilityOfElementLocated(AddConditionsPage.clickOnRecordConditions()));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", search);

//		element click intercepted: Element is not clickable at point (604, 894)
//		driver.findElement(AddConditionsPage.clickOnRecordConditions()).click();
	
		addExplicitWait(AddConditionsPage.get_condition_Search());
		driver.findElement(AddConditionsPage.get_condition_Search()).sendKeys("liver");
		addExplicitWait(AddConditionsPage.selectDisease());
		driver.findElement(AddConditionsPage.selectDisease()).click();
		addExplicitWait(AddConditionsPage.selectClinicalStatus());
		driver.findElement(AddConditionsPage.selectClinicalStatus()).click();
		addExplicitWait(AddConditionsPage.clickOnSave());
		driver.findElement(AddConditionsPage.clickOnSave()).click();
		addExplicitWait(AddConditionsPage.validateConditions());
		boolean verify=	driver.findElement(AddConditionsPage.validateConditions()).isDisplayed();
		Assert.assertEquals(verify, true);
		
	}
}
