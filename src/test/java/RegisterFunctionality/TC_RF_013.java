package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_013 extends BaseClass{
  @Test
  public void VerifyAllTheFieldsInTheRegisterAccountPageHaveTheProperPlaceholders() {
	  

	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
		
		String ExpectedFirstNamePlaceHolderValue = "First Name";
		Assert.assertEquals( getDriver().findElement(By.id("input-firstname")).getAttribute("placeholder"), ExpectedFirstNamePlaceHolderValue);
		
		String ExpectedLastNamePlaceHolderValue = "Last Name";
		Assert.assertEquals( getDriver().findElement(By.id("input-lastname")).getAttribute("placeholder"), ExpectedLastNamePlaceHolderValue);
		
		String ExpectedEMailPlaceHolderValue = "E-Mail";
		Assert.assertEquals( getDriver().findElement(By.id("input-email")).getAttribute("placeholder"), ExpectedEMailPlaceHolderValue);
		
		String ExpectedTelephonePlaceHolderValue = "Telephone";
		Assert.assertEquals( getDriver().findElement(By.id("input-telephone")).getAttribute("placeholder"), ExpectedTelephonePlaceHolderValue);
		
		String ExpectedPasswordPlaceHolderValue = "Password";
		Assert.assertEquals( getDriver().findElement(By.id("input-password")).getAttribute("placeholder"), ExpectedPasswordPlaceHolderValue);
		
		String ExpectedConfirmPasswordPlaceHolderValue = "Password Confirm";
		Assert.assertEquals( getDriver().findElement(By.id("input-confirm")).getAttribute("placeholder"), ExpectedConfirmPasswordPlaceHolderValue);
		
		
		
  }
}
