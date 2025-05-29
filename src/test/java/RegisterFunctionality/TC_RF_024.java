package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_024 extends BaseClass {
	@Test
	public void VerifyRegistringAnAccountByFillingPasswordFieldAndNotFillingPasswordConfirmField() {

		getDriver().findElement(By.xpath("//span[text()='My Account']")).click();
		getDriver().findElement(By.linkText("Register")).click();
		getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
		getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
		getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
		getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
		getDriver().findElement(By.id("input-password")).sendKeys("1123444");
		getDriver().findElement(By.name("confirm")).sendKeys("");

		getDriver().findElement(By.xpath("//input[@type='submit']")).click();

		String ExpWarningMessage = "Password confirmation does not match password!";
		Assert.assertEquals(getDriver().findElement(By.xpath("//input[@id='input-confirm']/following-sibling::div")).getText(), ExpWarningMessage);
	}
}
