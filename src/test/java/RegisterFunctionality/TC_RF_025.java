package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_025 extends BaseClass{
	@Test
	public void VerifyTheBreadcrumbPageHeadingPageURLPageTitleOfRegisterAccountPage() {
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());  
		
		String ExpectedHeading = "Register Account";
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"content\"]//h1")).getText(), ExpectedHeading);
		
		String ExpectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/register";
		Assert.assertEquals(driver.getCurrentUrl(), ExpectedUrl);
		
		String expectedTitle = "Register Account";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}
}
