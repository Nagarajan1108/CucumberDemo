package com.AddCustomerField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TariffPlan 
{
	static WebDriver driver;
	@Given("user launches Telecom Application")
	public void user_launches_Telecom_Application() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
	}

	@Given("user select Add Tariff Plan Details")
	public void user_select_Add_Tariff_Plan_Details() 
	{
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user need to fill the tariff details {string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_fill_the_tariff_details(String MR, String FLM, String FIM, String FSP, String LPMC, String IPMC, String SPC) 
	{
	    driver.findElement(By.id("rental1")).sendKeys(MR);
	    driver.findElement(By.id("local_minutes")).sendKeys(FLM);
	    driver.findElement(By.id("inter_minutes")).sendKeys(FIM);
	    driver.findElement(By.id("sms_pack")).sendKeys(FSP);
	    driver.findElement(By.id("minutes_charges")).sendKeys(LPMC);
	    driver.findElement(By.id("inter_charges")).sendKeys(IPMC);
	    driver.findElement(By.id("sms_charges")).sendKeys(SPC);
	  
	}

	@When("User click the submit button")
	public void user_click_the_submit_button() 
	{
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input")).click();
	}

	@Then("user verify congratulation message")
	public void user_verify_congratulation_message() 
	{
	  String text = driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).getText();
	  Assert.assertEquals("Congratulation you add Tariff Plan", text);
	   
	}
}
