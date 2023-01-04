package com.valuelabs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.valueslabs.utils.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {
	public static WebDriver driver;
	public static Logger log;
	
	
	public static Properties prop;
	
	
	public BaseClass() {
		
			prop = new Properties();
			FileInputStream inputfile;
			try {
				inputfile = new FileInputStream("D:\\Selenium\\valuelabs\\src\\main\\java\\com\\valuelabs\\propfiles\\config.properties");
				prop.load(inputfile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}
	
	public static void initialise() {
		log=Logger.getLogger("Valuelabs");
		PropertyConfigurator.configure("log4j.properties");
		
		String browserName= prop.getProperty("browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log.info("Invoked chrome browser");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		//driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
		
		
		
		
		
	}
	


}
