package RegisterFunctionality;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;


public class TC_RF_018 extends BaseClass{
  @Test
  public void VerifyWhetherTheFieldsInTheRegisterAccountPageAreAccordingTheClientRequirements () throws Throwable {
  
  driver.findElement(By.xpath("//span[text()='My Account']")).click();
  driver.findElement(By.linkText("Register")).click();
  
  String ExpectedHeight = "34px";
  String ExpectedWidth = "701.25px";
  
  WebElement FirstNameField = driver.findElement(By.id("input-firstname"));
  String ActualHeight = FirstNameField.getCssValue("height");
  String ActualWidth = FirstNameField.getCssValue("width");  
  Assert.assertEquals(ActualHeight, ExpectedHeight);
  Assert.assertEquals(ActualWidth, ExpectedWidth);
  
  
  FirstNameField.sendKeys("");
  WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  continueButton.click();
  String ExpActualMessage = "First Name must be between 1 and 32 characters!";
  String ActualErrorMsg= driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
  Assert.assertEquals(ActualErrorMsg, ExpActualMessage);
  
  FirstNameField = driver.findElement(By.id("input-firstname"));
  FirstNameField.sendKeys("abjabjbakjbnk");  
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  continueButton.click();  
  try {
  Assert.assertEquals(ExpActualMessage, ActualErrorMsg);
  }
  catch(NoSuchElementException e) {
	 Assert.assertTrue(true); 
  }
  
 
  FirstNameField = driver.findElement(By.id("input-firstname")); 
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  FirstNameField.clear();
  FirstNameField.sendKeys("abjabjbakjbnksnksndknasdnsakndksndksaksaknsakkasknsaksa"); 
  continueButton.click();  
  Assert.assertEquals(ExpActualMessage, ActualErrorMsg);
  
  
  
  //--------------------------------------------------------------------------
  
  WebElement LastNameField = driver.findElement(By.id("input-lastname"));
  String ActualLHeight = LastNameField.getCssValue("height");
  String ActualLWidth = LastNameField.getCssValue("width");  
  Assert.assertEquals(ActualLHeight, ExpectedHeight);
  Assert.assertEquals(ActualLWidth, ExpectedWidth);
  
  LastNameField.sendKeys("");  
  String ExpectedLastnameErrorMsg = "Last Name must be between 1 and 32 characters!";
  String ActualLastNameErrorMsg = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  continueButton.click();   
  Assert.assertEquals(ExpectedLastnameErrorMsg, ActualLastNameErrorMsg);
    
  LastNameField = driver.findElement(By.id("input-lastname"));
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  Thread.sleep(1000);
  LastNameField.clear();
  LastNameField.sendKeys("abjllla");   
  continueButton.click();  
  try {
  Assert.assertEquals(ActualLastNameErrorMsg, ExpectedLastnameErrorMsg);
  }
  catch(NoSuchElementException e) {
	 Assert.assertTrue(true); 
  }
  
  LastNameField = driver.findElement(By.id("input-lastname"));
  Thread.sleep(2000);
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  
  LastNameField.clear();
  LastNameField.sendKeys("abjCKLASDJFCLASJKFLASJKFLSAKJFLKASLFASFALFLAMKLMFASMLFSAa"); 
  continueButton.click();   
  Assert.assertEquals(ActualLastNameErrorMsg, ExpectedLastnameErrorMsg);
  
  
  //----------------------------------------------------------------------
  
  WebElement EmailField = driver.findElement(By.id("input-email"));
  Thread.sleep(2000);
  String ActualEHeight = EmailField.getCssValue("height");
  String ActualEWidth = EmailField.getCssValue("width");  
  Assert.assertEquals(ActualEHeight, ExpectedHeight);
  Assert.assertEquals(ActualEWidth, ExpectedWidth);
  
  EmailField = driver.findElement(By.id("input-email"));
  String ExpectedEmailErrorMsg = "E-Mail Address does not appear to be valid!";
  String ActualEmailErrorMsg = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
  EmailField.sendKeys("abjCKLASDJFCLASJKFLASJKFLSAKJddFLKASLFASFALFLAMKLMFASMLFSAa@gmail.com");  
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  continueButton.click();   
  Assert.assertEquals(ActualEmailErrorMsg, ExpectedEmailErrorMsg);
  
  //----------------------------------------------------------------------
  
  WebElement TelephoneField = driver.findElement(By.id("input-telephone"));
  Thread.sleep(2000);
  String ActualTHeight = TelephoneField.getCssValue("height");
  String ActualTWidth = TelephoneField.getCssValue("width");  
  Assert.assertEquals(ActualTHeight, ExpectedHeight);
  Assert.assertEquals(ActualTWidth, ExpectedWidth);
  
  TelephoneField = driver.findElement(By.id("input-telephone"));
  String ExpectedTelephoneErrorMsg = "Telephone must be between 3 and 32 characters!";
  String ActualTelephoneErrorMsg = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
  TelephoneField.sendKeys("abjCKLASDJFCLASJKFLASJKFLSAKJddFLKASLFASFALFLAMKLMFASMLFSAa");  
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  continueButton.click();   
  Assert.assertEquals(ActualTelephoneErrorMsg, ExpectedTelephoneErrorMsg);
  
  //--------------------------------------------------------------------------------
  
  WebElement PasswordField = driver.findElement(By.id("input-password"));
  String ActualPHeight = PasswordField.getCssValue("height");
  String ActualPWidth = PasswordField.getCssValue("width");  
  Assert.assertEquals(ActualPHeight, ExpectedHeight);
  Assert.assertEquals(ActualPWidth, ExpectedWidth);
  
  PasswordField = driver.findElement(By.id("input-telephone"));
  String ExpectedPasswordErrorMsg = "Telephone must be between 3 and 32 characters!";
  String ActualPasswordErrorMsg = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
  PasswordField.sendKeys("abjCKLASDJFCLASJKFLASJKFLSAKJddFLKASLFASFALFLAMKLMFASMLFSAa");  
  continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
  continueButton.click();   
  Assert.assertEquals(ActualPasswordErrorMsg, ExpectedPasswordErrorMsg);
  
  
  }
}
