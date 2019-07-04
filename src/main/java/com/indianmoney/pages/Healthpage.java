package com.indianmoney.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Healthpage extends BasePage
{

	
	@FindBy(xpath="//a[@id='health-sel']")
	private WebElement healthtab;
	
	@FindBy(xpath="//label[@class='radio-item'][contains(text(),'Male')]")
	private WebElement gen_male;
	
	@FindBy(xpath="//span[@id='preinsured']")
	private WebElement securer;
	
	@FindBy(xpath="//label[@id='insu']//span[@class='checkmark']")
	private WebElement self;
	
	@FindBy(xpath="//input[@id='insurerdob']")
	private WebElement date_picker;
	
	@FindBy(xpath="//span[@class='year focused']")
	private WebElement Year_foc;
	
	@FindBy(xpath="//span[@class='month focused']")
	private WebElement Month_foc;
	
	@FindBy(xpath="//td[@class='day'][contains(text(),'3')]")
	private WebElement Day_foc;
	
	@FindBy(xpath="//button[@id='insuredpeopel']")
	private WebElement done_btn;
	
	@FindBy(xpath="//input[@id='health_pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='healthmobile']")
	private WebElement mob_ph;
	
	@FindBy (xpath="//input[@id='healthemailaddress']")
	private WebElement emailadd;
	
	@FindBy(xpath="//button[@class='form-cta primary-form-cta health_quote']")
	private WebElement Quote_btn;
	
	@FindBy(xpath="//div[@class='tab-pane fade in active']//p[contains(text(),'BUY THIS PLAN')]")
	private WebElement buyplan_btn;
	
	
	
	public Healthpage(WebDriver driver)
	{
     super(driver);
     PageFactory.initElements(driver, this);
	}
	
	public void entergender()
	{
		healthtab.click();
		gen_male.click();
	}
	
	public void selectsecurer() throws InterruptedException
	{
		securer.click();
		Thread.sleep(3000);
		self.click();
		Thread.sleep(3000);
		date_picker.click();
		Thread.sleep(3000);
		Year_foc.click();
		Thread.sleep(3000);
		Month_foc.click();
		Thread.sleep(3000);
		Day_foc.click();
		Thread.sleep(3000);
		done_btn.click();
		Thread.sleep(3000);
	}
	public void selectotherfields() throws InterruptedException
	{
	    pincode.sendKeys("560068");
	    Thread.sleep(3000);
		mob_ph.sendKeys("8867780654");
		Thread.sleep(3000);
		emailadd.sendKeys("ketan14@gmail.com");
		Thread.sleep(3000);
		Quote_btn.click();
		Thread.sleep(10000);
	}
		
	public void buyplan()
	{
		buyplan_btn.click();
	}
	
}
