package pageClasses_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities_02.BaseClass_02;

public class LoginPage_02 extends BaseClass_02
{

	WebDriver driver;
	
	public LoginPage_02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[5]")
	WebElement login;

	@FindBy(xpath="//input[@id='input_1495646567135']")
	WebElement userName;

	@FindBy(xpath="//input[@id='input_1742715919526']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;

	
	public void clickOnLogin()
	{
		login.click();
	}
	public void enterUserID(String uID)
	{
		userName.sendKeys(uID);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickonSubmit()
	{
		submitButton.submit();
	}
	
}
