package com.indianmoney.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public abstract class Basetest
{
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void preCondition(String browser)throws Exception
	 {
		if(browser.equalsIgnoreCase("Firefox"))
		{
	       System.setProperty("webdriver.gecko.driver","F:\\MyWorkSpace\\Indian_Money\\Driver\\geckodriver.exe");
	       driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Chrome"))
		{
		   System.setProperty("webdriver.chrome.driver","F:\\MyWorkSpace\\Indian_Money\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		}
		
		else
		{
			System.out.println("Driver not found");
		}
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

