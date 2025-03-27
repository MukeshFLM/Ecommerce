package RegisterFunctionality;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseTest.BaseClass;

public class TC_RF_011 extends BaseClass{
	
	@AfterMethod 
	public void teardown() {
		
		driver.quit();
		
	}
  @Test
  public void RegisteringAnAccountByProvidingInvalidPhoneNumber() {
	  
	  driver.navigate().to("https://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Mukesh");
		driver.findElement(By.id("input-email")).sendKeys(RandomGmailCreation());
		driver.findElement(By.id("input-lastname")).sendKeys("Ganivada");
		driver.findElement(By.id("input-telephone")).sendKeys("abcde");
		driver.findElement(By.id("input-password")).sendKeys("Mukesh1000");
		driver.findElement(By.name("confirm")).sendKeys("Mukesh1000");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		SoftAssert sa1 = new SoftAssert();
		sa1.assertEquals("Telephone number does not appear to be valid", driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText() );
		
		sa1.assertAll();
  }
  public String RandomGmailCreation() {
		return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
	}
}
