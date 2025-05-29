package RegisterFunctionality;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_011 extends BaseClass{
	
	@AfterMethod 
	public void teardown() {
		
		getDriver().quit();
		
	}
  @Test
  public void RegisteringAnAccountByProvidingInvalidPhoneNumber() {
	  
	  getDriver().navigate().to("https://tutorialsninja.com/demo/");

	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
	  getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
	  getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
	  getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
	  getDriver().findElement(By.id("input-telephone")).sendKeys("abcde");
	  getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
	  getDriver().findElement(By.name("confirm")).sendKeys("Mukesh1000");
	  getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
	  getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		
		SoftAssert sa1 = new SoftAssert();
		sa1.assertEquals("Telephone number does not appear to be valid", getDriver().findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText() );
		
		sa1.assertAll();
  }
 
}
