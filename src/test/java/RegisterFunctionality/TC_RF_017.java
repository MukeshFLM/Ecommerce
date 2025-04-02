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
		driver.quit();
	}
  @Test(dataProvider = "MultiplePasswords")
  public void VerifyWhetherThePasswordFieldsInTheRegisterAccountPageAreFollowingPasswordComplexityStandards(String EnterPassword) {
  
	  driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Mukesh");
		driver.findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
		driver.findElement(By.id("input-lastname")).sendKeys("Ganivada");
		driver.findElement(By.id("input-telephone")).sendKeys("6300476285");
		driver.findElement(By.id("input-password")).sendKeys(EnterPassword);
		driver.findElement(By.name("confirm")).sendKeys(EnterPassword);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String ExpWarningMessage = "Password entered is not matching the Complexity standards";
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-password]/following-sibling::div")).getText(), ExpWarningMessage);
		Assert.assertFalse(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Success']")).isDisplayed());
  }
  @DataProvider(name = "MultiplePasswords")
	public Object[][] supplyPasswords()  {
	  Object[][] data = {{"12345"},{"ASSSS@"},{"SNSKJNK@"},{"OAJOOJ&"}};
	  return data;
  }
  
}
