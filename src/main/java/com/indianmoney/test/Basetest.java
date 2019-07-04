package com.indianmoney.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest
{
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
		{
	System.setProperty("webdriver.chrome.driver","F:\\MyWorkSpace\\Indian_Money\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://indianmoneyinsurance.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}

	@AfterMethod
	public void postConditon()
		{
	driver.close();
		}
		}

