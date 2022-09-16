package Assignment1.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment1.ReUse.ReUsableMethod;

public class LoginPage extends ReUsableMethod{

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailID;

	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement nextButton;

	@FindBy(css="input[type='password']")
	WebElement enterPassword;
	By appearPassword=By.cssSelector("input[type='password']");

	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement nextLoginButton;
	
	public void goToPage()
	{
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S268502654%3A1663164178442979&checkedDomains=youtube&continue=https%3A%2F%2Faccounts.google.com%2F&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Faccounts.google.com%2F&hl=en_US&ifkv=AQDHYWq-38pOWDs8oFdxMuOxu8VxPBB9CYRM05QzDLoabbM5qv12YrH2sL_GoxpxUq8Qcvo7AjVHeQ&pstMsg=1");
	}
	
	public void logIn(String emailId)
	{
		emailID.sendKeys(emailId);
		nextButton.click();
	}
	
	public ForgotPasswordPage enterPassword(String password)
	{
		waitForElementToAppear(appearPassword);
		enterPassword.sendKeys(password);
		nextLoginButton.click();
		ForgotPasswordPage forgotpasswordofpage=new  ForgotPasswordPage(driver);
		return forgotpasswordofpage;
	}

}
