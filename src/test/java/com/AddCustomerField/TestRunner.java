package com.AddCustomerField;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src//test//resources//Features//AddTariffPlan.feature" , 
				glue = "com.AddCustomerField" ,
				plugin = "html:target" ,
				monochrome = true ,
				dryRun = false )

public class TestRunner 
{

}
