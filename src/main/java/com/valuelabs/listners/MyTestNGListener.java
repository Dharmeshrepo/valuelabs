package com.valuelabs.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.valuelabs.base.BaseClass;
import com.valueslabs.utils.TestUtil;

public class MyTestNGListener extends TestUtil implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("-------"+result.getName() + " test method is started"+"-------");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("-------"+result.getName() + " test method is Passed" + "-------");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("-------"+ result.getName() + "test method is Failed" + "-------");
		String testName =result.getName();
		TestUtil.captureScreenshot(testName,getCurrentTime());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("-------"+ result.getName() + "test method is skipped"+"-------");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context.);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onFinish(context);
		log.info("-------"+"Test Execution is over"+"-------");
	}

}
