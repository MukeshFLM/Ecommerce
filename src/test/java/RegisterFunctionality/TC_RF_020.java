package RegisterFunctionality;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_020 extends BaseClass{
  @Test
  public void VerifyWhetherThePrivacyPolicyCheckboxOptionIsNotSelectedByDefault() {
	  
	  driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
	  driver.findElement(By.linkText("Register")).click();
	  boolean CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	  Assert.assertFalse(CheckBox);
  }
}
