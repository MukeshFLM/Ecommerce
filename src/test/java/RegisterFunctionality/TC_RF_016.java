package RegisterFunctionality;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;



import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;
import ru.yandex.qatools.ashot.Screenshot;

public class TC_RF_016 extends BaseClass{
	@Test
	public void VerifyWhetherTheMandatoryFieldsInTheRegisterAccountPageAreNotAcceptingOnlySpaces() {

		getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
		getDriver().findElement(By.linkText("Register")).click();
		getDriver().findElement(By.id("input-firstname")).sendKeys(" ");
		getDriver().findElement(By.id("input-email")).sendKeys(" ");
		getDriver().findElement(By.id("input-lastname")).sendKeys(" ");
		getDriver().findElement(By.id("input-telephone")).sendKeys(" ");
		getDriver().findElement(By.id("input-password")).sendKeys(" ");
		getDriver().findElement(By.name("confirm")).sendKeys(" ");
		getDriver().findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();

		String ExpFirstNameWarning = "First Name must be between 1 and 32 characters!";
		String ExpLastNameWarning = "Last Name must be between 1 and 32 characters!";
		String ExpEmailWarning = "E-Mail Address does not appear to be valid!";
		String ExpTelephoneWarning = "Telephone must be between 3 and 32 characters!";
		String ExpPasswordWarning = "Password must be between 4 and 20 characters!";

		Assert.assertEquals(getDriver().findElement(By.xpath("//div[starts-with(text(),'First Name')]")).getText() , ExpFirstNameWarning);
		Assert.assertEquals(getDriver().findElement(By.xpath("//div[starts-with(text(),'Last Name')]")).getText() , ExpLastNameWarning);
		Assert.assertEquals(getDriver().findElement(By.xpath("//div[starts-with(text(),'E-Mail Address')]")).getText() , ExpEmailWarning);
		Assert.assertEquals(getDriver().findElement(By.xpath("//div[starts-with(text(),'Telephone')]")).getText() , ExpTelephoneWarning);
		Assert.assertEquals(getDriver().findElement(By.xpath("//div[starts-with(text(),'Password')]")).getText() , ExpPasswordWarning);
		
		
	}
}
