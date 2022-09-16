package Assignment1.Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Assignment1.ReUse.ReUsableMethod;

public class SetUrlResolution extends ReUsableMethod{
	WebDriver driver;
	
	public SetUrlResolution(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setResolution(String resolutionValue)
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("resolution", resolutionValue);
	}
	
}
