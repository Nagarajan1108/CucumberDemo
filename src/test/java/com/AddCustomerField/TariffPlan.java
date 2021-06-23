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

	@Given("user select Add Tariff Plan Details")
	public void user_select_Add_Tariff_Plan_Details() 
	{
	    Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user need to fill the tariff details {string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_fill_the_tariff_details(String MR, String FLM, String FIM, String FSP, String LPMC, String IPMC, String SPC) 
	{
	    Hooks.driver.findElement(By.id("rental1")).sendKeys(MR);
	    Hooks.driver.findElement(By.id("local_minutes")).sendKeys(FLM);
	    Hooks.driver.findElement(By.id("inter_minutes")).sendKeys(FIM);
	    Hooks.driver.findElement(By.id("sms_pack")).sendKeys(FSP);
	    Hooks.driver.findElement(By.id("minutes_charges")).sendKeys(LPMC);
	    Hooks.driver.findElement(By.id("inter_charges")).sendKeys(IPMC);
	    Hooks.driver.findElement(By.id("sms_charges")).sendKeys(SPC);
	  
	}

	@When("User click the submit button")
	public void user_click_the_submit_button() 
	{
	    Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input")).click();
	}

	@Then("user verify congratulation message")
	public void user_verify_congratulation_message() 
	{
	  String text = Hooks.driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).getText();
	  Assert.assertEquals("Congratulation you add Tariff Plan", text);
	   
	}
}
