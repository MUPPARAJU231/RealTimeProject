package pageClasses_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities_02.BaseClass_02;

public class ForgotPwdPage_02 extends BaseClass_02
{

	WebDriver driver;
	
	public ForgotPwdPage_02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[6]")
	WebElement forgotPassword;

	@FindBy(xpath="//input[@id='input_7539084004150']")
	WebElement eMail;

	@FindBy(xpath="//input[@id='input_7539084004151']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;

	
	public void clickOnForgotpwd()
	{
		forgotPassword.click();
	}
	public void enterUserEmail(String email)
	{
		eMail.sendKeys(email);
	}
	
	public void enterMobile(String mobileNum)
	{
		mobileNumber.sendKeys(mobileNum);
	}
	
	public void clickonSubmit()
	{
		submitButton.submit();
	}
	
}
