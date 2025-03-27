package RegisterFunctionality;



import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_009 extends BaseClass{
	
	@Test
	public void ValidateRegisteringAnAccountByProvidingTheExistingEmail() {
		driver.navigate().to("https://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Mukesh");
		driver.findElement(By.id("input-email")).sendKeys("ganivadamukesh555@gmail.com");
		driver.findElement(By.id("input-lastname")).sendKeys("Ganivada");
		driver.findElement(By.id("input-telephone")).sendKeys("6300476285");
		driver.findElement(By.id("input-password")).sendKeys("Mukesh1000");
		driver.findElement(By.name("confirm")).sendKeys("Mukesh1000");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String ExpectedErrorMessage = driver.findElement(By.xpath("//div[starts-with(text(), 'Warning')]")).getText();
		System.out.println(ExpectedErrorMessage);
		Assert.assertEquals("Warning: E-Mail Address is already registered!", ExpectedErrorMessage);
	}
}