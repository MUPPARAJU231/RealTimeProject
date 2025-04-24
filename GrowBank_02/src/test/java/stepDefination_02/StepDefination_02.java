package stepDefination_02;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses_02.AccountDetailsPage_02;
import pageClasses_02.ContactUS_02;
import pageClasses_02.ForgotPwdPage_02;
import pageClasses_02.LoginPage_02;
import pageClasses_02.SignUpPage_02;
import utilities_02.BaseClass_02;

public class StepDefination_02 extends BaseClass_02
{
//	----------------SignUp-------------------
	
	WebDriver driver=BaseClass_02.initializeDriver();
	SignUpPage_02 signup=new SignUpPage_02(driver);
	String ActualMessage="Thank you! Your data has been submitted.";
	
	@After 
	public void tearDown() throws InterruptedException
	{
		addHardcodedWait();
		driver.quit();
	}
	
	@Given("user open the url for banking application")
	public void user_open_the_url_for_banking_application() 
	{
		   System.out.println("Application launched");
		    System.out.println(getPageTitle());
	}
	@Given("user clicks on SignUp button in WebPage")
	public void user_clicks_on_sign_up_button_in_web_page()
	{
		signup.clickOnSignUp();
	}
	@Given("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String firstname) 
	{
		signup.enterFirstName(firstname);
	}
	@Given("user enters the lastname as {string}")
	public void user_enters_the_lastname_as(String lastname) {
		signup.enterLastName(lastname);
	}
	@Given("user enters the phonenumber as {string}")
	public void user_enters_the_phonenumber_as(String phonenumber) {
		signup.enterPhone(phonenumber);
		scrollDown();
	}
	@Given("user enters the dateofBirth as {string}")
	public void user_enters_the_dateof_birth_as(String DOB) throws InterruptedException {
		addHardcodedWait();
		signup.enterDOB(DOB);
	}
	@Given("user selects the gender")
	public void user_selects_the_gender() {
		signup.selectGender(1);
	}
	@Given("user enters the cityname as {string}")
	public void user_enters_the_cityname_as(String city) {
		   signup.enterCity(city);
	}
	@Given("user enters the userid as {string}")
	public void user_enters_the_userid_as(String uid) {
		  signup.enterUserID(uid);
	}
	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		  signup.enterPassword(password);
	}
	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
		scrollDown();
		signup.clickonSubmit();
	}
	@Then("validate that user is getting proper response from site")
	public void validate_that_user_is_getting_proper_response_from_site() throws InterruptedException 
	{
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		String msg=	signup.validateMessage();
		Assert.assertEquals(ActualMessage, msg);

	}
	@Then("also verify that the Title of the page is showing correct value")
	public void also_verify_that_the_title_of_the_page_is_showing_correct_value() 
	{
		String expected=getPageTitle();
		Assert.assertEquals(getPageTitle(), expected);
	}

// ------------------Login-------------
	LoginPage_02 login=new LoginPage_02(driver);
	
	@Given("user clicks on Login button in WebPage")
	public void user_clicks_on_login_button_in_web_page() {
		login.clickOnLogin();
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String uid) {
		login.enterPassword(uid);
	}

	@Given("user enters the pwd as {string}")
	public void user_enters_the_pwd_as(String pwd) {
		login.enterPassword(pwd);
	}

//	----------------ForgotPassword-------------
	ForgotPwdPage_02 forgotpwd=new ForgotPwdPage_02(driver);
	
	@Given("user clicks on ForgotPassword button in WebPage")
	public void user_clicks_on_forgot_password_button_in_web_page() {
		forgotpwd.clickOnForgotpwd();
	}

	@Given("user enters the e-mail as {string}")
	public void user_enters_the_e_mail_as(String email) {
		forgotpwd.enterUserEmail(email);
	}

	@Given("user enters the mobilenumber as {string}")
	public void user_enters_the_mobilenumber_as(String mobileNo) {
		forgotpwd.enterMobile(mobileNo);
	}

//----------------------ContactUS---------------------------
	ContactUS_02 contactus=new ContactUS_02(driver);
	
	@Given("user clicks on ContactUs button in WebPage")
	public void user_clicks_on_contact_us_button_in_web_page() {
		contactus.clickOnContactUS();
	}

	@Given("user enters the yourname as {string}")
	public void user_enters_the_yourname_as(String yourname) {
		contactus.enterYourName(yourname);
	}

	@Given("user enters the youre-mail as {string}")
	public void user_enters_the_youre_mail_as(String yourEmail) {
		contactus.enterEmail(yourEmail);
	}

	@Given("user enters the phoneNumber as {string}")
	public void user_enters_the_phone_number_as(String phoneNumber) {
		contactus.enterPhone(phoneNumber);
	}

	@Given("user enters the address as {string}")
	public void user_enters_the_address_as(String address) {
		contactus.enterAddress(address);
	}

	@Given("user enters the country as {string}")
	public void user_enters_the_country_as(String country) {
		contactus.enterCountry(country);
	}

	@Given("user enters the zipcode as {string}")
	public void user_enters_the_zipcode_as(String zipcode) {
		contactus.enterZipCode(zipcode);
	}

//	--------------AccountDetails-------------------
	AccountDetailsPage_02 accdetails=new AccountDetailsPage_02(driver);
	
	@Given("user clicks on AccountDetail button in WebPage")
	public void user_clicks_on_account_detail_button_in_web_page() {
		accdetails.clickAccountDetails();
	}

	@Given("user navigated to the AccountDetails Page")
	public void user_navigated_to_the_account_details_page() {
		getWindowHandle();
		System.out.println(getPageTitle());
	}

	@Given("Select Account  from DropDown")
	public void select_account_from_drop_down() throws InterruptedException, AWTException {
//		addExplicitWait(By.xpath("//div[@id='menuitem-0']"));
		accdetails.selectAccount();
	}

	@Given("click on Login button")
	public void click_on_login_button() {
		accdetails.clickonLogin();
	}

	@Given("click on Deposit")
	public void click_on_deposit() throws InterruptedException {
		addHardcodedWait();
		accdetails.clickonDepositTab();
	}

	@Given("enter the amount to be deposited as {string}")
	public void enter_the_amount_to_be_deposited_as(String depositAmount) {
		accdetails.enterDepositAmount(depositAmount);
	}

	@When("click on Deposit button")
	public void click_on_deposit_button() {
		accdetails.clickonDepositButton();
	}

	@Then("balance is updated")
	public void balance_is_updated() {
		
	}

	@Then("click on withdrawl")
	public void click_on_withdrawl() throws InterruptedException {
		addHardcodedWait();
		accdetails.clickonWithdrawlTab();
	}

	@Then("enter amount to be withdrawn as {string}")
	public void enter_amount_to_be_withdrawn_as(String withdrawlAmount) {
		accdetails.enterWithdrawAmount(withdrawlAmount);
	}

	@When("click on withdraw button")
	public void click_on_withdraw_button() {
		accdetails.clickonWithdrawlButton();
	}

	@Then("balance will be updated")
	public void balance_will_be_updated() {
		
	}
	

}
