package RegisterFunctionality;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_020 extends BaseClass{
  @Test
  public void VerifyWhetherThePrivacyPolicyCheckboxOptionIsNotSelectedByDefault() {
	  
	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
	  boolean CheckBox = getDriver().findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	  Assert.assertFalse(CheckBox);
  }
}
