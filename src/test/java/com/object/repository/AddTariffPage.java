package com.object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resource.CommonActions;

import junit.framework.Assert;

public class AddTariffPage extends CommonActions
{
public AddTariffPage()
{
	PageFactory.initElements(driver, this);	
}

@FindBy(id = "rental1")
private WebElement ren;

@FindBy(id ="local_minutes" )
private WebElement lm;

@FindBy(id ="inter_minutes" )
private WebElement im;

@FindBy(id ="sms_pack" )
private WebElement sp;

@FindBy(id ="minutes_charges" )
private WebElement mc;

@FindBy(id ="inter_charges" )
private WebElement ic;

@FindBy(id ="sms_charges" )
private WebElement sc;

@FindBy(xpath = "//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input")
private WebElement SubmitButton;

@FindBy(xpath = "//h2[contains(text(),'Congratulation')]")
private WebElement Text;	

public WebElement getSubmitButton() {
	return SubmitButton;
}

public WebElement getText() {
	String text = Text.getText();
	 Assert.assertEquals("Congratulation you add Tariff Plan", text);
	return Text;
}

public WebElement getRen() {
	return ren;
}

public WebElement getLm() {
	return lm;
}

public WebElement getIm() {
	return im;
}

public WebElement getSp() {
	return sp;
}

public WebElement getMc() {
	return mc;
}

public WebElement getIc() {
	return ic;
}

public WebElement getSc() {
	return sc;
}



	
}
