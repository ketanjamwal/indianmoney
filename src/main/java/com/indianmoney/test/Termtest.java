package com.indianmoney.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.indianmoney.pages.Termpage;

public class Termtest extends Basetest
{
	@Test(priority=1)
	public void termdetail() throws InterruptedException, InvalidFormatException, IOException
	{
		Termpage l=new Termpage(driver);
		 l.clickonTerm();
		 Thread.sleep(5000);
		 l.clickonGenderF();
		 Thread.sleep(2000);
		 l.selectDOB();
		 Thread.sleep(3000);
		 l.selectincome();
		 Thread.sleep(3000);
		 l.selectcover();
		 Thread.sleep(3000);
		 l.enterMob();
		 Thread.sleep(3000);
		 l.enteremail();
		 Thread.sleep(3000);
		 l.ClickQuote();
		 Thread.sleep(3000);
		 l.enterpincode();
		 Thread.sleep(3000);
		 l.smokeoption();
		 Thread.sleep(3000);
		 l.agecover();
		 Thread.sleep(3000);
	}
	
	
	


}
