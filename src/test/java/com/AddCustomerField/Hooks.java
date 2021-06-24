package com.AddCustomerField;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resource.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonActions
{	
	public static WebDriver driver;	
	@Before
	public void launch() 
	{
		launch("http://www.demo.guru99.com/telecom/");
	}
	
	
	@After
	public void afterScenario(Scenario scenario)
	{
		System.out.println("After Scenario");
		try
		{
			if(scenario.isFailed())
			{
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			}
			else
			{
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			}
		}
		catch(Exception e)
		{
		
		}

	driver.quit();
	}
	
	
}
