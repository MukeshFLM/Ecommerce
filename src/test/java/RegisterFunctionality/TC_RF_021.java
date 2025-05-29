package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_021 extends BaseClass{
  @Test
  public void VerifyRegisteringTheAccountWithoutSelectingThePrivacyPolicyCheckboxOption() {
	  getDriver().findElement(By.xpath("//span[text()='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
	  getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
	  getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
	  getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
	  getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
	  getDriver().findElement(By.id("input-password")).sendKeys("1123444");
	  getDriver().findElement(By.name("confirm")).sendKeys("1123444");
		
	  getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		String ExpWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(ExpWarningMessage, getDriver().findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
	  
  }
}
