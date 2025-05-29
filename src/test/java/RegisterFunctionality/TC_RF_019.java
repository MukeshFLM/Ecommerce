package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_019 extends BaseClass {
  @Test
  public void VerifyWhetherTheLeadingAndTrailingSpacesEnteredIntoTheRegisterAccountFieldsAreTrimmed() throws Throwable {
  
	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
		String FirstName = "  Mukesh  ";
		getDriver().findElement(By.id("input-firstname")).sendKeys(FirstName);
		String LastName = "  Ganivada  ";
		String EnteredGmail = "  "+ RandomGmailCreation.GmailCreation();
		getDriver().findElement(By.id("input-email")).sendKeys(EnteredGmail);
		getDriver().findElement(By.id("input-lastname")).sendKeys(LastName);
		String EnteredTelephone = "  6300471285  ";
		getDriver().findElement(By.id("input-telephone")).sendKeys(EnteredTelephone);
		getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
		getDriver().findElement(By.name("confirm")).sendKeys("Mukesh1000");		
		getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();		
		getDriver().findElement(By.linkText("Edit Account")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(getDriver().findElement(By.id("input-firstname")).getAttribute("value") , FirstName.trim());
		Assert.assertEquals(getDriver().findElement(By.id("input-lastname")).getAttribute("value") , LastName.trim());
		Assert.assertEquals(getDriver().findElement(By.id("input-email")).getAttribute("value") , EnteredGmail.trim());
		Assert.assertEquals(getDriver().findElement(By.id("input-telephone")).getAttribute("value") , EnteredTelephone.trim());
		
  }
}
