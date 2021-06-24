package com.AddCustomerField;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.cache.Cache;
import com.object.repository.AddTariffPage;
import com.telecom.resource.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TariffPlan extends CommonActions
{
	
	CommonActions ca  = new CommonActions();
	AddTariffPage at = new AddTariffPage();

	@Given("user select Add Tariff Plan Details")
	public void user_select_Add_Tariff_Plan_Details() 
	{
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user need to fill the tariff details {string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_fill_the_tariff_details(String MR, String FLM, String FIM, String FSP, String LPMC, String IPMC, String SPC) 
	{
		ca.insertText(at.getRen(),MR);
		ca.insertText(at.getLm(), FLM);
		ca.insertText(at.getIm(), FIM);
		ca.insertText(at.getSp(),FSP);
		ca.insertText(at.getMc(), LPMC);
		ca.insertText(at.getIc(), IPMC);
		ca.insertText(at.getSc(), SPC);
	}

	@When("User click the submit button")
	public void user_click_the_submit_button() 
	{
	
		ca.button(at.getSubmitButton());
	}
	

	@Then("user verify congratulation message")
	public void user_verify_congratulation_message() 
	{
	 ca.textCopy(at.getText());
	}
}
