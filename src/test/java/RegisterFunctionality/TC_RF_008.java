package RegisterFunctionality;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_008 extends BaseClass{
  @Test
  public void ValidateRegisteringAnAccountByEnteringDifferentPasswordsIntoPasswordAndPasswordConfirmFields() {
	  
	 

	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
	  getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
	  getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
	  getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
	  getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
	  getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
	  getDriver().findElement(By.name("confirm")).sendKeys("Mukesh100");
	  getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
	  
		Assert.assertEquals("Password confirmation does not match password!", getDriver().findElement(By.xpath("//div[@class='text-danger']")).getText());
		
  }
 
}
