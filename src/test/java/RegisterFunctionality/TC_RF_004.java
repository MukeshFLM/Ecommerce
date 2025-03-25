package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;


public class TC_RF_004 extends BaseClass{
  @Test
  public void ValidateProperErrorMsgDisplayedForEmptyFields() {
	  
	  driver.navigate().to("https://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String ExpectedWarningForFirstName = "First Name must be between 1 and 32 characters!";
		String ExpectedWarningForLastName = "Last Name must be between 1 and 32 characters!";
		String ExpectedWarningForEmail = "E-Mail Address does not appear to be valid!";
		String ExpectedWarningForTelephone = "Telephone must be between 3 and 32 characters!";
		String ExpectedWarningForPassword = "Password must be between 4 and 20 characters!";
		String ExpectedWarningForPrivacyPolicy = "Warning: You must agree to the Privacy Policy!";
		
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'First Name')]")).getText(), ExpectedWarningForFirstName);
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'Last Name')]")).getText(), ExpectedWarningForLastName);
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'E-Mail Address')]")).getText(), ExpectedWarningForEmail);
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'Telephone')]")).getText(), ExpectedWarningForTelephone);
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'Password')]")).getText(), ExpectedWarningForPassword);
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'Warning:')]")).getText(), ExpectedWarningForPrivacyPolicy);
			
		
  }
}
