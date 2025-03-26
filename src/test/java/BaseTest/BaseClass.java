package BaseTest;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseClass {
		
	//TOKEN = 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
	
		public static WebDriver driver;
		public static FileInputStream fis1;
		public static Properties configProp;
		public static FileInputStream fis2;
		public static Properties locatorsProp;
		public static ExtentReports reports;
		public static ExtentTest test;
		
		@BeforeMethod
		public void setUp(Method method)
		{
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\mukesh.ganivada\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
			 
			driver=new EdgeDriver();	
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
			
			driver.navigate().to("https://tutorialsninja.com/demo/");
		}
		
		@AfterMethod
		public void teardown()
		{
			
			driver.close();
			
		}
		
	}