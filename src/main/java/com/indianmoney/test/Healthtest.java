package com.indianmoney.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.indianmoney.pages.Healthpage;
import com.indianmoney.pages.Proposerpage;

public class Healthtest extends Basetest {

	@Test(priority = 1)
	public void healthdetail() throws InterruptedException {
		Healthpage h = new Healthpage(driver);
		Thread.sleep(3000);
		h.entergender();
		h.selectsecurer();
		h.selectotherfields();
		h.buyplan();
		Thread.sleep(5000);

		Proposerpage p = new Proposerpage(driver);
	
		p.firstname();
		p.middlename();
		p.lasttname();
		p.Addharno();
		p.Panno();
		p.EmailAdd();
		p.Permanentadd();
		Thread.sleep(2000);
		p.getAllData();
		Thread.sleep(3000);
		p.next_btn();
	}
	
/*	@Test(priority = 2)
	public void verify_FN()
	{
		Proposerpage p = new Proposerpage(driver);
	}*/
	
	
	
	
}
