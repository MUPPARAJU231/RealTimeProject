package testClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.LoginPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
import utilities.RetryAnalyzer;

@Listeners(ListenerImplementation.class)

public class LoginTest extends BaseClass
{
	@Test(priority=0, groups= {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
	public static void executeLoginTest()
	{
		addExplicitWait(LoginPage.getUserName());
		driver.findElement(LoginPage.getUserName()).sendKeys("Admin");
		addExplicitWait(LoginPage.getContinueButton());
		driver.findElement(LoginPage.getContinueButton()).click();
		addExplicitWait(LoginPage.getPassword());
		driver.findElement(LoginPage.getPassword()).sendKeys("Admin123");
		addExplicitWait(LoginPage.clickOnSumit());
		driver.findElement(LoginPage.clickOnSumit()).click();
	
	}
}
