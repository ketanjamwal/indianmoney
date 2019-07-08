package com.indianmoney.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result+"Result Start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result+"Result pass");
	}

	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts = (TakesScreenshot)Basetest.driver;
		  
		  File srcFile = ts.getScreenshotAs(OutputType.FILE);
		  
		  try {
		   FileUtils.copyFile(srcFile, new File("F:\\MyWorkSpace\\Indian_Money\\Screenshot"+result.getName()+".jpg"));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result+"Result Skiped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context+"Result Finish");
	}

}
