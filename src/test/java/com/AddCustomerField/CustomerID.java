package com.AddCustomerField;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerID 
{
	

	@Given("user Select Add Customer Field")
	public void user_Select_Add_Customer_Field() 
	{
	    Hooks.driver.findElement(By.xpath("//a[text()='Add Customer'] [1]")).click();
	}

	//Normal Entry
	
	@When("user need to fill up the customer details")
	public void user_need_to_fill_up_the_customer_details() 
	{
	   Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	   Hooks.driver.findElement(By.id("fname")).sendKeys("NaGarajan");
	   Hooks.driver.findElement(By.id("lname")).sendKeys("P");
	   Hooks.driver.findElement(By.id("email")).sendKeys("gvpnagarajan@gmail.com");
	   Hooks.driver.findElement(By.name("addr")).sendKeys("No 10 Ambalpuram 3rd Street Pudukkottai");
	   Hooks.driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("8526825456");
	}
	
	//One Dimensional List
	
	@When("user need to fill up the customer details by onedim list")
	public void user_need_to_fill_up_the_customer_details_by_onedim_list(io.cucumber.datatable.DataTable dataTable) {
	    List<String> asList = dataTable.asList(String.class);
	    Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		   Hooks.driver.findElement(By.id("fname")).sendKeys(asList.get(0));
		   Hooks.driver.findElement(By.id("lname")).sendKeys(asList.get(1));
		   Hooks.driver.findElement(By.id("email")).sendKeys(asList.get(2));
		   Hooks.driver.findElement(By.name("addr")).sendKeys(asList.get(3));
		   Hooks.driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(asList.get(4));
	    
	}

	//One Dimensional Map
	
	@When("user need to fill up the customer details by onedim Map")
	public void user_need_to_fill_up_the_customer_details_by_onedim_Map(DataTable datamap) 
	{
	Map<String, String> asd = datamap.asMap(String.class,String.class);
	
	 Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	   Hooks.driver.findElement(By.id("fname")).sendKeys(asd.get("Fname"));
	   Hooks.driver.findElement(By.id("lname")).sendKeys(asd.get("Lname"));
	   Hooks.driver.findElement(By.id("email")).sendKeys(asd.get("mail"));
	   Hooks.driver.findElement(By.name("addr")).sendKeys(asd.get("Address"));
	   Hooks.driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(asd.get("Mobile"));
	
	}

	//Two Dimensional List
	@When("user need to fill up the customer details by Twodim list")
	public void user_need_to_fill_up_the_customer_details_by_Twodim_list(DataTable datamap) 
	{
List<List<String>> asd = datamap.asLists(String.class);
	
	 Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	   Hooks.driver.findElement(By.id("fname")).sendKeys(asd.get(2).get(0));
	   Hooks.driver.findElement(By.id("lname")).sendKeys(asd.get(3).get(1));
	   Hooks.driver.findElement(By.id("email")).sendKeys(asd.get(0).get(2));
	   Hooks.driver.findElement(By.name("addr")).sendKeys(asd.get(3).get(3));
	   Hooks.driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(asd.get(1).get(4));
	
	}
	
	
	//Two Dimensional Map
	@When("user need to fill up the customer details by Twodim Map")
	public void user_need_to_fill_up_the_customer_details_by_Twodim_Map(DataTable datamap) 
	{
	List<Map<String, String>> asd = datamap.asMaps(String.class,String.class);
	
	 Hooks.driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	   Hooks.driver.findElement(By.id("fname")).sendKeys(asd.get(1).get("Fname"));
	   Hooks.driver.findElement(By.id("lname")).sendKeys(asd.get(2).get("Lname"));
	   Hooks.driver.findElement(By.id("email")).sendKeys(asd.get(2).get("mail"));
	   Hooks.driver.findElement(By.name("addr")).sendKeys(asd.get(0).get("Address"));
	   Hooks.driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(asd.get(1).get("Mobile"));
	
	}
	
	@When("User Click the Submit button")
	public void user_Click_the_Submit_button() 
	{
	    Hooks.driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

	@Then("User fetch the Customer id when it is Generated")
	public void user_fetch_the_Customer_id_when_it_is_Generated() 
	{
	   WebElement userid = Hooks.driver.findElement(By.xpath("//td[normalize-space()='Customer ID']//following::td[1]"));
	   String str=userid.getText();
	   System.out.println("Your Customer id is " +str);
	}

}
