package com.AddCustomerField;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.object.repository.AddCustomerPage;
import com.telecom.resource.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerID extends CommonActions
{
	
CommonActions ca = new CommonActions();
AddCustomerPage ac = new AddCustomerPage();

	
	@Given("user Select Add Customer Field")
	public void user_Select_Add_Customer_Field() 
	{
	ca.button(ac.getAddCustomerButton());
	}

	//Normal Entry
	
	@When("user need to fill up the customer details")
	public void user_need_to_fill_up_the_customer_details() 
	{
	    ca.button(ac.getDoneButton());
	    ca.insertText(ac.getFname(), "NaGarajan");
	    ca.insertText(ac.getLname(), "P");
	    ca.insertText(ac.getMail(), "gvpnagarajan@gmail.com");
    	ca.insertText(ac.getAddr(), "No 10 Ambalpuram 3rd Street Pudukkottai");
        ca.insertText(ac.getPhone(), "8462829374");
	}
	
	//One Dimensional List
	
	@When("user need to fill up the customer details by onedim list")
	public void user_need_to_fill_up_the_customer_details_by_onedim_list(io.cucumber.datatable.DataTable dataTable) 
	{
	    List<String> asList = dataTable.asList(String.class);
	    ca.button(ac.getDoneButton());
	    
	    ca.insertText(ac.getFname(), asList.get(0));
	    ca.insertText(ac.getLname(), asList.get(1));
	    ca.insertText(ac.getMail(), asList.get(2));
    	ca.insertText(ac.getAddr(), asList.get(3));
        ca.insertText(ac.getPhone(), asList.get(4));  
	}

	//One Dimensional Map
	
	@When("user need to fill up the customer details by onedim Map")
	public void user_need_to_fill_up_the_customer_details_by_onedim_Map(DataTable datamap) 
	{
	Map<String, String> asd = datamap.asMap(String.class,String.class);
	
	ca.button(ac.getDoneButton());
    
    ca.insertText(ac.getFname(), asd.get("Fname"));
    ca.insertText(ac.getLname(), asd.get("Lname"));
    ca.insertText(ac.getMail(), asd.get("mail"));
	ca.insertText(ac.getAddr(), asd.get("Address"));
    ca.insertText(ac.getPhone(), asd.get("Mobile"));
	
	}

	//Two Dimensional List
	@When("user need to fill up the customer details by Twodim list")
	public void user_need_to_fill_up_the_customer_details_by_Twodim_list(DataTable datamap) 
	{
    List<List<String>> asd = datamap.asLists(String.class);
    ca.button(ac.getDoneButton());
    
    ca.insertText(ac.getFname(), asd.get(2).get(0));
    ca.insertText(ac.getLname(), asd.get(3).get(1));
    ca.insertText(ac.getMail(), asd.get(0).get(2));
	ca.insertText(ac.getAddr(), asd.get(3).get(3));
    ca.insertText(ac.getPhone(), asd.get(1).get(4));
   
	}
	
	
	//Two Dimensional Map
	@When("user need to fill up the customer details by Twodim Map")
	public void user_need_to_fill_up_the_customer_details_by_Twodim_Map(DataTable datamap) 
	{
	List<Map<String, String>> asd = datamap.asMaps(String.class,String.class);
	
    ca.button(ac.getDoneButton());
    
    ca.insertText(ac.getFname(), asd.get(1).get("Fname"));
    ca.insertText(ac.getLname(),asd.get(2).get("Lname"));
    ca.insertText(ac.getMail(), asd.get(2).get("mail"));
	ca.insertText(ac.getAddr(), asd.get(0).get("Address"));
    ca.insertText(ac.getPhone(), asd.get(1).get("Mobile"));
	
	}
	
	@When("User Click the Submit button")
	public void user_Click_the_Submit_button() 
	{
	    ca.button(ac.getSubmitButton());
	}

	@Then("User fetch the Customer id when it is Generated")
	public void user_fetch_the_Customer_id_when_it_is_Generated() 
	{
	
	 ca.textCopy(ac.getText());
	 
	 
	}

}
