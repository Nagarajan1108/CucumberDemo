package com.object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resource.CommonActions;

public class AddCustomerPage extends CommonActions
{
	public AddCustomerPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Add Customer'] [1]")
	private WebElement AddCustomerButton;
	

	@FindBy(xpath =  "(//label[@for='done']) [1]" ) 
	private WebElement doneButton;
	
	@FindBy(id = "fname")
	private WebElement fname;
	
	@FindBy(id ="lname" )
	private WebElement lname;
	
	@FindBy(id ="email" )
	private WebElement mail;
	
	@FindBy(name ="addr" )
	private WebElement addr;
	
	@FindBy(xpath ="//input[@id='telephoneno']" )
	private WebElement phone;
	
	@FindBy(xpath = "//input[@name='submit']" )
	private WebElement submitButton;
	
	@FindBy(xpath = "//td[normalize-space()='Customer ID']//following::td[1]")
	private WebElement text;
	
	public WebElement getText() {
		String str = text.getText();
		System.out.println(str);
		return text;
	}

	public WebElement getAddCustomerButton() {
		return AddCustomerButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}	
	}
