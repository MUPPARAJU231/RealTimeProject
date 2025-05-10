package testClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageClasses.EndVisitPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
import utilities.RetryAnalyzer;

@Listeners(ListenerImplementation.class)

public class EndVisitTest extends BaseClass
{
	@Test(priority=5, groups= {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
	public static void executeLoginTest()
	{
		LoginTest.executeLoginTest();
		addExplicitWait(EndVisitPage.clickPatName());
		driver.findElement(EndVisitPage.clickPatName()).click();
		addExplicitWait(EndVisitPage.clickEndVisit());
		driver.findElement(EndVisitPage.clickEndVisit()).click();
		addExplicitWait(EndVisitPage.selecetEndVisit());
		driver.findElement(EndVisitPage.selecetEndVisit()).click();
		addExplicitWait(EndVisitPage.validateEndVisit());
		boolean verify=driver.findElement(EndVisitPage.validateEndVisit()).isDisplayed();
		Assert.assertEquals(verify, true);
	}
}
