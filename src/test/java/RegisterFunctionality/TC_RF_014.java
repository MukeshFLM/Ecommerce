package RegisterFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



import BaseTest.BaseClass;

public class TC_RF_014 extends BaseClass {
  @Test
  public void VerifyAllTheMandatoryFieldsInTheRegisterAccountPageAreMarkedWithRedColorSymbol() {
  
		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		String ExpectedContent = "\"* \"";
		String ExpectedColor = "rgb(255, 0, 0)";
		
		WebElement FirstNameLabel = driver.findElement(By.cssSelector("label[for='input-firstname']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		String fnContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", FirstNameLabel);
		String fncolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", FirstNameLabel);
		Assert.assertEquals(fnContent,ExpectedContent);
		Assert.assertEquals(fncolour,ExpectedColor);
		
		WebElement LastNameLabel = driver.findElement(By.cssSelector("label[for='input-lastname']"));		
		String lnContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", LastNameLabel);
		String lncolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", LastNameLabel);
		Assert.assertEquals(lnContent,ExpectedContent);
		Assert.assertEquals(lncolour,ExpectedColor);
		
		
		WebElement EmailLabel = driver.findElement(By.cssSelector("label[for='input-email']"));
		String EContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", EmailLabel);
		String Ecolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", EmailLabel);
		Assert.assertEquals(EContent,ExpectedContent);
		Assert.assertEquals(Ecolour,ExpectedColor);
		
		
		WebElement TelephoneLabel = driver.findElement(By.cssSelector("label[for='input-telephone']"));
		String TContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", TelephoneLabel);
		String Tcolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", TelephoneLabel);
		Assert.assertEquals(TContent,ExpectedContent);
		Assert.assertEquals(Tcolour,ExpectedColor);
		
		WebElement PasswordLabel = driver.findElement(By.cssSelector("label[for='input-password']")); 
		String PContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", PasswordLabel);
		String Pcolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", PasswordLabel);
		Assert.assertEquals(PContent,ExpectedContent);
		Assert.assertEquals(Pcolour,ExpectedColor);
		
		WebElement ConfirmPasswordLabel = driver.findElement(By.cssSelector("label[for='input-confirm']")); 
		String CPContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", ConfirmPasswordLabel);
		String CPcolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", ConfirmPasswordLabel);
		Assert.assertEquals(CPContent,ExpectedContent);
		Assert.assertEquals(CPcolour,ExpectedColor);
		
		WebElement PrivacyPolicyLabel = driver.findElement(By.cssSelector("[class='pull-right']")); 
		String 	PPContent = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", PrivacyPolicyLabel);
		String PPcolour = (String)jse.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", PrivacyPolicyLabel);
		Assert.assertEquals(PPContent,ExpectedContent);
		Assert.assertEquals(PPcolour,ExpectedColor);
		
	
  }
		
}
			
