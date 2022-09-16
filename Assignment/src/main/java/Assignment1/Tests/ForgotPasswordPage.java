package Assignment1.Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Assignment1.ReUse.ReUsableMethod;

public class ForgotPasswordPage extends ReUsableMethod {

	WebDriver driver;
	String passwordValidationPage;
	String verificationMessage;
		
	public ForgotPasswordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Forgot password?']")
	WebElement forgotPassword;

	@FindBy(css=".PrDSKc")
	WebElement validationMassage;
	
	public void getTitleOfPage()
	{
		passwordValidationPage=driver.getTitle();
		System.out.println(passwordValidationPage);
	}

	public SetUrlResolution pageValidation()
	{
		if(passwordValidationPage.equalsIgnoreCase("Sign in - Google Accounts"))
		{
			forgotPassword.click();
			verificationMessage=validationMassage.getText();
			System.out.println(verificationMessage);
		}
		SetUrlResolution setresoluation=new SetUrlResolution(driver);
		return setresoluation;	
	}
	
	
	
}
