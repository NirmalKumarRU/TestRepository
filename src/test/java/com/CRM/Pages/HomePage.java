package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//encapsulation=data+Method
	
	private WebDriver d;
	
	public HomePage(WebDriver d)//base class
	{
		this.d=d;  //local d is initialized to instance variable
		
	}
	
	//By locator
	private By signIn= By.id("SignIn");
	
	public String getAppUrl()
	{
		return d.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return d.getTitle();
	}
	
	public void getSignIn()
	{
		d.findElement(signIn).click();
	}
	

}
