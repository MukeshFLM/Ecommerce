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

		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(" ");
		driver.findElement(By.id("input-email")).sendKeys(" ");
		driver.findElement(By.id("input-lastname")).sendKeys(" ");
		driver.findElement(By.id("input-telephone")).sendKeys(" ");
		driver.findElement(By.id("input-password")).sendKeys(" ");
		driver.findElement(By.name("confirm")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String ExpFirstNameWarning = "First Name must be between 1 and 32 characters!";
		String ExpLastNameWarning = "Last Name must be between 1 and 32 characters!";
		String ExpEmailWarning = "E-Mail Address does not appear to be valid!";
		String ExpTelephoneWarning = "Telephone must be between 3 and 32 characters!";
		String ExpPasswordWarning = "Password must be between 4 and 20 characters!";

		Assert.assertEquals(driver.findElement(By.xpath("//div[starts-with(text(),'First Name')]")).getText() , ExpFirstNameWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//div[starts-with(text(),'Last Name')]")).getText() , ExpLastNameWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//div[starts-with(text(),'E-Mail Address')]")).getText() , ExpEmailWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//div[starts-with(text(),'Telephone')]")).getText() , ExpTelephoneWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//div[starts-with(text(),'Password')]")).getText() , ExpPasswordWarning);
		
		
	}
}
