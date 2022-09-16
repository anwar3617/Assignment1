package Assignment1.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Assignment1.TestComponent.BaseTest;

public class SetNewResolutionTest extends BaseTest {
	
	public ForgotPasswordPage forgotpasswordofpage;
	public SetUrlResolution setresoluation;	
	
	@Test
	public void assignment3() throws IOException, InterruptedException
	{
		launchPage();
		loginpage.logIn(emailId);
		
		forgotpasswordofpage=loginpage.enterPassword(password);
		Thread.sleep(7000);
		forgotpasswordofpage.getTitleOfPage();
		setresoluation=forgotpasswordofpage.pageValidation();
		setresoluation.setResolution(newresolutionValue);
		
		terminateTest();
	}

}
