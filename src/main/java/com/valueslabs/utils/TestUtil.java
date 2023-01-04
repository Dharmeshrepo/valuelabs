package com.valueslabs.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.valuelabs.base.BaseClass;

public class TestUtil extends BaseClass{
	public static long IMPLICIT_WAIT = 20;
	
		//Capture Screenshot
		public static void captureScreenshot (String testMethodName,String time) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src  = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Selenium\\valuelabs\\Screenshots\\" + testMethodName +"_" +time +"_Screenshot.png");
			
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Get Current Time
		public static String getCurrentTime() {
			String currentDateTime = java.time.LocalDateTime.now().toString();   
			currentDateTime = currentDateTime.substring(0,19);
			currentDateTime = currentDateTime.replace("-","_");
			currentDateTime = currentDateTime.replace(":","_");
			return currentDateTime;   
		}
}
