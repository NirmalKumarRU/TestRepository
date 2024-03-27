package com.CRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.*;

public class BaseClass {
	public WebDriver d;
	public HomePage hp;
	
	@BeforeTest
	public void setUp()
	{
		d=new ChromeDriver();
		d.get("https://automationplayground.com/crm/");
		
		hp=new HomePage(d);
	}

}
