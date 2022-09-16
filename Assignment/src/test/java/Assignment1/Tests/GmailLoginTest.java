package Assignment1.Tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Assignment1.TestComponent.BaseTest;
import Assignment1.Tests.ForgotPasswordPage;
import Assignment1.Tests.LoginPage;
import Assignment1.Tests.SetUrlResolution;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GmailLoginTest extends BaseTest{

	public SetUrlResolution setresoluation;
	public ForgotPasswordPage forgotpasswordofpage;
	@Test
	public void assignment1() throws IOException, InterruptedException
	{
//		String emailId="anwar20223617@gmail.com";
//		String password="Annu@1233";

		launchPage();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.logIn(emailId);
		
		forgotpasswordofpage=loginpage.enterPassword(password);


	}
	
	@Test(dependsOnMethods= {"assignment1"})
	public void assignment1Part2() throws IOException, InterruptedException
	{

		Thread.sleep(4000);
		
		forgotpasswordofpage.getTitleOfPage();
		setresoluation=forgotpasswordofpage.pageValidation();
		
		setresoluation.setResolution(resolutionValue);
		terminateTest();

	}
	
	

}
