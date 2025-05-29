package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_025 extends BaseClass {
	@Test
	public void VerifyTheBreadcrumbPageHeadingPageURLPageTitleOfRegisterAccountPage() {
		
		getDriver().findElement(By.xpath("//span[text()='My Account']")).click();
		getDriver().findElement(By.linkText("Register")).click();
		Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());  
		
		String ExpectedHeading = "Register Account";
		Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='content']//h1")).getText(), ExpectedHeading);
		
		String ExpectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/register";
		Assert.assertEquals(getDriver().getCurrentUrl(), ExpectedUrl);
		
		String expectedTitle = "Register Account";
		Assert.assertEquals(getDriver().getTitle(), expectedTitle);
	}
}
