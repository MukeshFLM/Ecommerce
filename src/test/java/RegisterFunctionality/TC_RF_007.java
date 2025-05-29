package RegisterFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_007 extends BaseClass {
	WebDriver driver;
	@Test
	public void ValidateDifferentWaysOfNavigatingToRegisterAccountPage() {

	
		
		getDriver().manage().window().maximize();
		
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		getDriver().navigate().to("https://tutorialsninja.com/demo/");
		getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
		getDriver().findElement(By.linkText("Register")).click();
		Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());

		getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
		getDriver().findElement(By.linkText("Login")).click();
		getDriver().findElement(By.linkText("Continue")).click();
		Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());

		getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
		getDriver().findElement(By.linkText("Login")).click();
		getDriver().findElement(By.xpath("//a[@class='list-group-item'][text()='Register']")).click();
		Assert.assertTrue(getDriver().findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());

		getDriver().quit();
	}

}
