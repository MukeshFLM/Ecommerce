package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_021 extends BaseClass{
  @Test
  public void VerifyRegisteringTheAccountWithoutSelectingThePrivacyPolicyCheckboxOption() {
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.linkText("Register")).click();
	  driver.findElement(By.id("input-firstname")).sendKeys("Mukesh");
		driver.findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
		driver.findElement(By.id("input-lastname")).sendKeys("Ganivada");
		driver.findElement(By.id("input-telephone")).sendKeys("6300476285");
		driver.findElement(By.id("input-password")).sendKeys("1123444");
		driver.findElement(By.name("confirm")).sendKeys("1123444");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String ExpWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(ExpWarningMessage, driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
	  
  }
}
