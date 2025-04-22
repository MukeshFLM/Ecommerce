package RegisterFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_022 extends BaseClass {
  @Test
  public void VerifyThePasswordTextEnteredIntoThePasswordAndPasswordConfirmFieldOfRegisterAccountFunctionalityIsToggledToHideItsVisibility() {
  
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.linkText("Register")).click();
	
		
		Assert.assertEquals(driver.findElement(By.id("input-password")).getAttribute("type"),"password" );
		Assert.assertEquals(driver.findElement(By.id("input-confirm")).getAttribute("type"),"password" );
		
		
  }
}
