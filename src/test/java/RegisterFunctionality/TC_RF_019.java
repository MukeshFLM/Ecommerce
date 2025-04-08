package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_019 extends BaseClass {
  @Test
  public void VerifyWhetherTheLeadingAndTrailingSpacesEnteredIntoTheRegisterAccountFieldsAreTrimmed() throws Throwable {
  
	  	driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		String FirstName = "  Mukesh  ";
		driver.findElement(By.id("input-firstname")).sendKeys(FirstName);
		String LastName = "  Ganivada  ";
		String EnteredGmail = "  "+ RandomGmailCreation.GmailCreation();
		driver.findElement(By.id("input-email")).sendKeys(EnteredGmail);
		driver.findElement(By.id("input-lastname")).sendKeys(LastName);
		String EnteredTelephone = "  6300471285  ";
		driver.findElement(By.id("input-telephone")).sendKeys(EnteredTelephone);
		driver.findElement(By.id("input-password")).sendKeys("Mukesh1000");
		driver.findElement(By.name("confirm")).sendKeys("Mukesh1000");		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		driver.findElement(By.linkText("Edit Account")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.id("input-firstname")).getAttribute("value") , FirstName.trim());
		Assert.assertEquals(driver.findElement(By.id("input-lastname")).getAttribute("value") , LastName.trim());
		Assert.assertEquals(driver.findElement(By.id("input-email")).getAttribute("value") , EnteredGmail.trim());
		Assert.assertEquals(driver.findElement(By.id("input-telephone")).getAttribute("value") , EnteredTelephone.trim());
		
  }
}
