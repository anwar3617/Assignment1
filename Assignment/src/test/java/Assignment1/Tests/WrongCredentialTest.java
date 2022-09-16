package Assignment1.Tests;

import java.io.IOException;

import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Assignment1.TestComponent.BaseTest;

public class WrongCredentialTest extends BaseTest {
	
	public ForgotPasswordPage forgotpasswordofpage;
	
	@Test
	public void assingment2() throws IOException, InterruptedException
	{
		launchPage();
		loginpage.logIn(wrongEmailId);
		
		forgotpasswordofpage=loginpage.enterPassword(wrongPassword);
		
	}
	
	@Test(dependsOnMethods= {"assingment2"})
	public void assignment2Part2() throws InterruptedException
	{
		Thread.sleep(5000);
		forgotpasswordofpage.getTitleOfPage();
		forgotpasswordofpage.pageValidation();
		terminateTest();
	}
}
