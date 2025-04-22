package RegisterFunctionality;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_023 extends BaseClass{
  @Test
  public void VerifyNavigatingToOtherPagesUsingTheOptionsOrLinksProvidedOnTheRegisterAccountpage() {
	  
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.linkText("Register")).click();
	  
	  driver.findElement(By.xpath("//a/i[@class='fa fa-phone']")).click();
	  Assert.assertTrue(driver.findElement(By.linkText("Contact Us")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a/i[@class='fa fa-phone']")).click();
	  Assert.assertTrue(driver.findElement(By.linkText("Contact Us")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//li//a[@title='Shopping Cart']")).click();
	  Assert.assertTrue(driver.findElement(By.linkText("Shopping Cart")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Login']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Register']")).click();
	  Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
	 // driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Forgotten Password']")).click();
	  Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='My Account']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();

	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Address Book']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Wish List']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Order History']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Downloads']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Recurring payments']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Reward Points']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Returns']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Transactions']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Newsletter']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.linkText("About Us")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='About Us']")).isDisplayed());
		driver.navigate().back();
	  
	  driver.findElement(By.linkText("Delivery Information")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Delivery Information']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Privacy Policy']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Privacy Policy']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.linkText("Terms & Conditions")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Terms & Conditions']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.linkText("Contact Us")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//li//a[text()='Contact Us']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Returns']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//li//a[text()='Product Returns']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Site Map']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//li//a[text()='Site Map']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.linkText("Brands")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Brand']")).isDisplayed());
	  driver.navigate().back();
	  
	  driver.findElement(By.linkText("Specials")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Special Offers']")).isDisplayed());
	  driver.navigate().back();
	  
	  
	  
	  
	  
  }
}
