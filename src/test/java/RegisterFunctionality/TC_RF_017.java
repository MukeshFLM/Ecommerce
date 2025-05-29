package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_017 extends BaseClass{
	
	@AfterMethod
	public void teardown() {
		getDriver().quit();
	}
  @Test(dataProvider = "MultiplePasswords")
  public void VerifyWhetherThePasswordFieldsInTheRegisterAccountPageAreFollowingPasswordComplexityStandards(String EnterPassword) {
  
	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
	  getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
	  getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
	  getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
	  getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
	  getDriver().findElement(By.id("input-password")).sendKeys(EnterPassword);
	  getDriver().findElement(By.name("confirm")).sendKeys(EnterPassword);
	  getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
	  getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		
		String ExpWarningMessage = "Password entered is not matching the Complexity standards";
		
		Assert.assertEquals(getDriver().findElement(By.xpath("//input[@id='input-password]/following-sibling::div")).getText(), ExpWarningMessage);
		Assert.assertFalse(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Success']")).isDisplayed());
  }
  @DataProvider(name = "MultiplePasswords")
	public Object[][] supplyPasswords()  {
	  Object[][] data = {{"12345"},{"ASSSS@"},{"SNSKJNK@"},{"OAJOOJ&"}};
	  return data;
  }
  
}
