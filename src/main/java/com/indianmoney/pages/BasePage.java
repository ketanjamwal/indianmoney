package com.indianmoney.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public abstract class BasePage {

public WebDriver driver;
	
public BasePage(WebDriver driver)
	{
this.driver=driver;
	}
	
/*public void verifyTitle(String eTitle)
	{
String title = driver.getTitle();
Assert.assertEquals(title, eTitle);
	}*/
	}
