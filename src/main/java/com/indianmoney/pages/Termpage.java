package com.indianmoney.pages;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Termpage extends BasePage
{
	
	 String Annual_Income;
	 String Cover;
	 String Mobile;
	 String Email;
	 String A_pincode;
	public  void InitExcel() throws InvalidFormatException, IOException
	{
		String path="F:\\MyWorkSpace\\Indian_Money\\src\\main\\java\\com\\indianmoney\\testdata\\Indianmoney_Term.xlsx";
	    FileInputStream fis=new FileInputStream(path);
	    BufferedInputStream bin=new BufferedInputStream(fis);
	    Workbook wb=WorkbookFactory.create(bin);
	    
	    Annual_Income =wb.getSheet("Term").getRow(1).getCell(1).toString();
	    System.out.println(Annual_Income);
	    Cover=wb.getSheet("Term").getRow(2).getCell(1).toString();
	    Mobile=wb.getSheet("Term").getRow(3).getCell(1).toString();
	    Email=wb.getSheet("Term").getRow(4).getCell(1).toString();
	    A_pincode=wb.getSheet("Term").getRow(5).getCell(1).toString();
	}
	
	
	
	
	@FindBy(id="term-sel")
	private WebElement Termtab;
	
	@FindBy(xpath="//label[contains(text(),'Male')]")
	private WebElement G_Male;
	
	@FindBy(xpath="//div[@class='col-lg-4 col-md-4 col-sm-4 col-12 form-block x-m-p']//label[@class='radio-item'][contains(text(),'Female')]")
	private WebElement G_Female;
	
	@FindBy(xpath="//input[@id='termDob']")
	private WebElement Datepicker;
	
	@FindBy(xpath="//span[@class='year focused']")
	private WebElement Year_f;
	
	@FindBy(xpath="//span[@class='month focused']")
	private WebElement month_f;
	
	@FindBy (xpath="//td[@class='day'][contains(text(),'3')]")
	private WebElement day_f;
	
	@FindBy (xpath="//span[@id='select2-term_annualincome_data-container']")
	private WebElement Annual_Income_DD;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement Enter_income;
	
	@FindBy(xpath="//div[@class='col-lg-4 col-md-4 col-sm-4 col-xs-12 form-block x-m-p term_cover_list']//span[@id='select2-term_cover_data-container']")
	private WebElement cover_DD;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	private WebElement Enter_cover;
	
	@FindBy(xpath="//input[@id='term_usermobile']")
	private WebElement Mob_Phone;
	
	@FindBy(xpath="//input[@id='termemailaddress']")
	private WebElement Email_add;
	
	@FindBy(xpath="//button[@class='form-cta primary-form-cta term-quote']")
	private WebElement GetQuote_btn;
	
	@FindBy(xpath="//input[@id='termpincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//button[@id='termpincodenext-btn']")
	private WebElement next_btn;
	
	@FindBy(xpath="//input[@id='smknobtn']")
	private WebElement smokeno;
	
	@FindBy(xpath="//p[@id='termQ-age-value']")
	private WebElement coverupto;
	
	
	@FindBy(xpath="//ul[@id='termQ-age-box-dropdown']//a[contains(text(),'25 Years')]")
	private WebElement selectyear;
	
	
	public Termpage(WebDriver driver)
		{
	     super(driver);
	PageFactory.initElements(driver, this);
		}
		
	public void clickonTerm()
	{
		Termtab.click();
	}
	
	public void clickonGenderF()
	{
		G_Female.click();
	}
	
	public void selectDOB() throws InvalidFormatException, IOException
	{
		Datepicker.click();
		Year_f.click();
		month_f.click();
		day_f.click();
		this.InitExcel();
	}
	
	public void selectincome()
	{
		Annual_Income_DD.click();
		System.out.println(Annual_Income);
		Enter_income.sendKeys(Annual_Income+Keys.ENTER);
	}
	
	public void selectcover()
	{
		cover_DD.click();
		Enter_cover.sendKeys(Cover+Keys.ENTER);
	}
	
	public void enterMob()
	{
		Mob_Phone.sendKeys(Mobile);		
	}
	
	public void enteremail()
	{
		Email_add.sendKeys(Email);
	}
	
	public void ClickQuote()
	{
		GetQuote_btn.click();
	}
	
	public void enterpincode()
	{
		pincode.sendKeys(A_pincode);
		next_btn.click();
	}
	
	public void smokeoption()
	{
		smokeno.click();
	}
	
	public void agecover()
	{
		coverupto.click();
		selectyear.click();
		
	}
}

