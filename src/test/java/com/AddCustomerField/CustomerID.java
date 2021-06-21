package com.AddCustomerField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerID 
{
	static WebDriver driver;
	@Given("user launch Telecom Application")
	public void user_launch_Telecom_Application() 
	{
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/telecom/index.html");
	  driver.manage().window().maximize();
	}

	@Given("user Select Add Customer Field")
	public void user_Select_Add_Customer_Field() 
	{
	    driver.findElement(By.xpath("//a[text()='Add Customer'] [1]")).click();
	}

	@When("user need to fill up the customer details")
	public void user_need_to_fill_up_the_customer_details() 
	{
	   driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	   driver.findElement(By.id("fname")).sendKeys("NaGarajan");
	   driver.findElement(By.id("lname")).sendKeys("P");
	   driver.findElement(By.id("email")).sendKeys("gvpnagarajan@gmail.com");
	   driver.findElement(By.name("addr")).sendKeys("No 10 Ambalpuram 3rd Street Pudukkottai");
	   driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("8526825456");
	}

	@When("User Click the Submit button")
	public void user_Click_the_Submit_button() 
	{
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

	@Then("User fetch the Customer id when it is Generated")
	public void user_fetch_the_Customer_id_when_it_is_Generated() 
	{
	   WebElement userid = driver.findElement(By.xpath("//td[normalize-space()='Customer ID']//following::td[1]"));
	   String str=userid.getText();
	   System.out.println("Your Customer id is " +str);
	}

}
