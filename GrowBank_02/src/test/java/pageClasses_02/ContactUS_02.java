package pageClasses_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUS_02 
{

	WebDriver driver;
	
	public ContactUS_02(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[2]")
	WebElement contactus;
	
	@FindBy(xpath="//input[@id='input_1496238250184']")
	WebElement yourName;
	
	@FindBy(xpath="//input[@id='input_1496238230199']")
	WebElement yorEmail;
	
	@FindBy(xpath="//input[@id='input_1496238259342']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='input_1742714856123']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='input_1742714886366']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='input_1742714901821']")
	WebElement zipCode;

	@FindBy(xpath="//button[@class='t-submit']")
	WebElement contactUsSubmitButton;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textMessage;
	
	
	public void clickOnContactUS()
	{
		contactus.click();
	}
	
	
	public void enterYourName(String yName)
	{
		yourName.sendKeys(yName);
	}
	
	
	public void enterEmail(String yMail)
	{
		yorEmail.sendKeys(yMail);
	}
	
	public void enterPhone(String phonenum)
	{
		phone.sendKeys(phonenum);
	}
	
	public void enterAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	public void enterCountry(String countryname)
	{
		country.sendKeys(countryname);
	}
	
	public void enterZipCode(String zip)
	{
		zipCode.sendKeys(zip);
	}
	
	public void clickonSubmit()
	{
		contactUsSubmitButton.submit();
	}
	
	public String validateMessage()
	{
		String message=textMessage.getText();
		return message;
	}

}
