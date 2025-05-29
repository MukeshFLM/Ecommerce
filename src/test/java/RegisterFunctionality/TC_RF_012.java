package RegisterFunctionality;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_012 extends BaseClass{
  @Test
  public void VerifyRegisteringAnAccountByUsingTheKeyboardKeys() {
	  getDriver().navigate().to("https://tutorialsninja.com/demo/");

	  getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
	  getDriver().findElement(By.linkText("Register")).click();
		Actions action = new Actions(getDriver());
		for(int i=1; i<= 23; i++) {
			action.sendKeys(Keys.TAB).perform();
		}
		action.sendKeys("Mukesh").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("ganivada").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys(RandomGmailCreation.GmailCreation()).pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("6300288129").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Mukesh1234").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Mukesh1234").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys(Keys.LEFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.ENTER).build().perform();
		
		
		
		Assert.assertTrue(getDriver().findElement(By.linkText("Logout")).isDisplayed());

		String ExpectedHeading = "Your Account Has Been Created!";

		Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='content']//h1")).getText(), ExpectedHeading);

		String ActualProperDetailsOne = "Congratulations! Your new account has been successfully created!";
		String ActualProperDetailsTwo = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String ActualProperDetailsThree = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String ActualProperDetailsFour = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please ";

		String ExpectedProperDetails = getDriver().findElement(By.id("content")).getText();

		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsOne));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsTwo));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsThree));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsFour));

		getDriver().findElement(By.linkText("Continue")).click();

		Assert.assertTrue(getDriver().findElement(By.linkText("Account")).isDisplayed());

		
	}
	
}
