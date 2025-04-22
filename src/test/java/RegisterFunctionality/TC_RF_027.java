package RegisterFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_027 {
	@Test(dataProvider = "CrossBrowserTesting")
	public void VerifyRegisterAccountFunctionalityInAllTheSupportedEnvironments(String env) {
		
		String browsername = env;
		WebDriver driver = null;
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();			
		}
		if(browsername.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
		if(browsername.equals("edge")) {
			driver = new EdgeDriver();
			
		}
		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Mukesh");
		driver.findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
		driver.findElement(By.id("input-lastname")).sendKeys("Ganivada");
		driver.findElement(By.id("input-telephone")).sendKeys("6300476285");
		driver.findElement(By.id("input-password")).sendKeys("Mukesh1000");
		driver.findElement(By.name("confirm")).sendKeys("Mukesh1000");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertEquals("Congratulations! Your new account has been successfully created!", driver.findElement(By.xpath("//div//p[starts-with(text(),'Congratulations!')]")).getText());


	}
	
	@DataProvider(name = "CrossBrowserTesting")
    public Object[][] passTestEnvironments() {
        // Return environments for cross-browser testing
        return new Object[][] { { "chrome" }, { "firefox" }, { "edge" } };
    }
}
