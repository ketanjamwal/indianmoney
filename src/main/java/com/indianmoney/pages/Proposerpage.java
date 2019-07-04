package com.indianmoney.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.Strings;
import com.indianmoney.test.Healthtest;

public class Proposerpage extends BasePage
{

	@FindBy(xpath="//input[contains(@id,'firstname')]")
	private WebElement fisrtname;
	
	@FindBy(xpath="//input[@id='middlename']")
	private WebElement middlename;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//select[@id='idtypeadhar']")
	private WebElement IdType;
	
	@FindBy(xpath="//input[@id='adharNoadithya']")
	private WebElement Adharno;
	
	@FindBy(xpath="//input[@id='pannumber']")
	private WebElement Panno;
	
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@id='permanentAddressLine1']")
	private WebElement PermAdd1;
	
	@FindBy(xpath="//div[@id='proposerdetails']//a[@name='next'][contains(text(),'Next')]")
	private WebElement Next_btn;
		
	
	public Proposerpage(WebDriver driver)
	{
     super(driver);
     PageFactory.initElements(driver, this);
	}
	
	public void firstname()
	{
		fisrtname.sendKeys("Ketan");
	}
	
	public void middlename()
	{
		middlename.sendKeys("Deep");
	}
	
	public void lasttname()
	{
		lastname.sendKeys("Jamwal");
	}
	
	public void Addharno()
	{
		Adharno.sendKeys("987654321098");
	}
	
	public void Panno()
	{
		Panno.sendKeys("AQHPJ6238M");
	}
	
	public void EmailAdd()
	{
		emailid.sendKeys("ketan14@gmail.com");
	}
	
	public void Permanentadd()
	{
		PermAdd1.sendKeys("11th cross 1st main");
	}
	
	public void next_btn()
	{
		Next_btn.click();
	}
	
	public void getAllData() throws InterruptedException
	{
		
		String FN=fisrtname.getAttribute("value");
		String MN=middlename.getAttribute("value");
		String LN=lastname.getAttribute("value");
		String Adhno=Adharno.getAttribute("value");
		String pno=Panno.getAttribute("value");
		String EId=emailid.getAttribute("value");
		String PAdd1=PermAdd1.getAttribute("value");
		
		if(Strings.isStringEmpty(FN)){
			Healthpage healthpage=new Healthpage(driver);
			Healthtest ht=new Healthtest();
			driver.navigate().to("https://indianmoneyinsurance.com");
			Thread.sleep(4000);
			driver.manage().deleteAllCookies();
			ht.healthdetail();
		}
		
		// Same thing we will do for remaining string
		
		System.out.println(FN);
		System.out.println(MN);
		System.out.println(LN);
		System.out.println(Adhno);
		System.out.println(pno);
		System.out.println(EId);
		System.out.println(PAdd1);
		
	}
}
