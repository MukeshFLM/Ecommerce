package RegisterFunctionality;



import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_009 extends BaseClass{
	
	@Test
	public void ValidateRegisteringAnAccountByProvidingTheExistingEmail() {
		getDriver().navigate().to("https://tutorialsninja.com/demo/");

		getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
		getDriver().findElement(By.linkText("Register")).click();
		getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
		getDriver().findElement(By.id("input-email")).sendKeys("ganivadamukesh555@gmail.com");
		getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
		getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
		getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
		getDriver().findElement(By.name("confirm")).sendKeys("Mukesh1000");
		getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		
		String ExpectedErrorMessage = getDriver().findElement(By.xpath("//div[starts-with(text(), 'Warning')]")).getText();
		System.out.println(ExpectedErrorMessage);
		Assert.assertEquals("Warning: E-Mail Address is already registered!", ExpectedErrorMessage);
	}
}