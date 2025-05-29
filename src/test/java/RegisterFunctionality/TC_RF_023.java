package RegisterFunctionality;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_023 extends BaseClass {
  @Test
  public void VerifyNavigatingToOtherPagesUsingTheOptionsOrLinksProvidedOnTheRegisterAccountpage() {
	  
	  getDriver().findElement(By.xpath("//span[text()='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
	  
	  getDriver().findElement(By.xpath("//a/i[@class='fa fa-phone']")).click();
	  Assert.assertTrue(getDriver().findElement(By.linkText("Contact Us")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//a/i[@class='fa fa-phone']")).click();
	  Assert.assertTrue(getDriver().findElement(By.linkText("Contact Us")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//li//a[@title='Shopping Cart']")).click();
	  Assert.assertTrue(getDriver().findElement(By.linkText("Shopping Cart")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Login']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Register']")).click();
	  Assert.assertTrue(getDriver().findElement(By.linkText("Register")).isDisplayed());
	  // getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Forgotten Password']")).click();
	  Assert.assertTrue(getDriver().findElement(By.linkText("Forgotten Password")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='My Account']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();

	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Address Book']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Wish List']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Order History']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Downloads']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Recurring payments']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Reward Points']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Returns']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Transactions']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//aside[@id='column-right']//div//a[text()='Newsletter']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//input[@type='submit']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.linkText("About Us")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='About Us']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.linkText("Delivery Information")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Delivery Information']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Privacy Policy']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Privacy Policy']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.linkText("Terms & Conditions")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Terms & Conditions']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.linkText("Contact Us")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//li//a[text()='Contact Us']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Returns']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//li//a[text()='Product Returns']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.xpath("//ul[@class='list-unstyled']//a[text()='Site Map']")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//li//a[text()='Site Map']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.linkText("Brands")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Brand']")).isDisplayed());
	  getDriver().navigate().back();
	  
	  getDriver().findElement(By.linkText("Specials")).click();
	  Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Special Offers']")).isDisplayed());
	  getDriver().navigate().back();
  }
}
