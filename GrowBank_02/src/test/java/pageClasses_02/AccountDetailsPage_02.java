package pageClasses_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities_02.BaseClass_02;

public class AccountDetailsPage_02 extends BaseClass_02
{

	WebDriver driver;

	public AccountDetailsPage_02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@class='t-menu__link-item'])[7]")
	WebElement accountDetails;

	@FindBy(xpath="//select[@id='collection_comp-m8swuunx']")
	WebElement accDropDown;

	@FindBy(xpath="//div[@id='menuitem-0']")
	WebElement accOne;

	@FindBy(xpath="//button[.='Login']")
	WebElement loginButton;

	@FindBy(xpath = "//div[@id='tab-comp-m8szwsxa']")      //morelocaters//div[@id='tab-comp-m8szwsxa']  //span[text()='Deposit']  
	WebElement depositTab;

	@FindBy(xpath = "//input[@id='input_comp-m8t00o79']")
	WebElement depositAmount;

	@FindBy(xpath="//div[@id='comp-m8t0270q']")
	WebElement depositButton;

	@FindBy(xpath = "//div[@id='tab-comp-m8szwsx41']")
	WebElement WithdrawlTab;

	@FindBy(xpath = "//input[@id='input_comp-m8t03jwk']")
	WebElement WithdrawlAmount;

	@FindBy(xpath="//div[@id='comp-m8t03jwx']")
	WebElement WithdrawButton;

	public void clickAccountDetails()
	{
		accountDetails.click();
	}
	public void selectAccount() throws  InterruptedException
	{
		addHardcodedWait();
		accDropDown.click();
		addExplicitWait(By.xpath("//div[@id='menuitem-0']"));
		accOne.click();

	}

	public void clickonLogin()
	{
		loginButton.click();
	}

	public void clickonDepositTab()
	{
		depositTab.click();
	}

	public void enterDepositAmount(String amountToBeDeposit)
	{
		depositAmount.sendKeys(amountToBeDeposit);
	}
	
	public void clickonDepositButton()
	{
		depositButton.click();
	}
	
	public void clickonWithdrawlTab()
	{
		WithdrawlTab.click();
	}

	public void enterWithdrawAmount(String amountToBeWithdraw)
	{
		WithdrawlAmount.sendKeys(amountToBeWithdraw);
	}
	
	public void clickonWithdrawlButton()
	{
		WithdrawButton.click();
	}
	
	
}
