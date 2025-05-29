package RegisterFunctionality;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseTest.BaseClass;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TC_RF_010 extends BaseClass{
	@Test
	public void ValidateRegisteringByProvidingInvalidEmailAddress() throws IOException, Throwable {

		getDriver().navigate().to("https://tutorialsninja.com/demo/");
		getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
		getDriver().findElement(By.linkText("Register")).click();
		getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
		getDriver().findElement(By.id("input-email")).sendKeys("ganivada");
		getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
		getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
		getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
		getDriver().findElement(By.name("confirm")).sendKeys("Mukesh1000");
		getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		File screenshot1 = getDriver().findElement(By.xpath("//form[@class='form-horizontal']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1,new File(System.getProperty("user.dir")+"\\Screenshots\\Sc1Actual.png"));
		
		SoftAssert sa1 =new SoftAssert();
		sa1.assertFalse(CompareTwoScreenShots(System.getProperty("user.dir")+"\\Screenshots\\Sc1Actual.png", System.getProperty("user.dir")+"\\Screenshots\\Sc1Expected.png"));
		Thread.sleep(3000);
		
		getDriver().findElement(By.id("input-email")).clear();
		getDriver().findElement(By.id("input-email")).sendKeys("ganivada@");
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		File screenshot2 = getDriver().findElement(By.xpath("//form[@class='form-horizontal']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(System.getProperty("user.dir")+"\\Screenshots\\Sc2Actual.png"));
		SoftAssert sa2 =new SoftAssert();
		sa2.assertFalse(CompareTwoScreenShots(System.getProperty("user.dir")+"\\Screenshots\\Sc2Actual.png", System.getProperty("user.dir")+"\\Screenshots\\Sc2Expected.png"));
		Thread.sleep(3000);
		
		getDriver().findElement(By.id("input-email")).clear();
		getDriver().findElement(By.id("input-email")).sendKeys("ganivada@gmail");
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		String Expected = "E-Mail Address does not appear to be valid!";
		String Actual = getDriver().findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
		Assert.assertEquals(Actual, Expected);
		Thread.sleep(3000);
		
		getDriver().findElement(By.id("input-email")).clear();
		getDriver().findElement(By.id("input-email")).sendKeys("ganivada@gmail.");
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		File screenshot3 = getDriver().findElement(By.xpath("//form[@class='form-horizontal']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot3, new File(System.getProperty("user.dir")+"\\Screenshots\\Sc3Actual.png"));
		SoftAssert sa3 =new SoftAssert();
		sa3.assertFalse(CompareTwoScreenShots(System.getProperty("user.dir")+"\\Screenshots\\Sc3Actual.png", System.getProperty("user.dir")+"\\Screenshots\\Sc3Expected.png"));
		Thread.sleep(3000);
		
		sa1.assertAll();
		sa2.assertAll();
		sa3.assertAll();
	}
	
	public boolean CompareTwoScreenShots (String actualScreeShot, String ExpectedScreenshot) throws IOException {
		
		BufferedImage ActualImg = ImageIO.read(new File(actualScreeShot)); 
		BufferedImage ExpectedImg = ImageIO.read(new File(ExpectedScreenshot));

		ImageDiffer imgdiff = new ImageDiffer();
		
		ImageDiff imgdifferance = imgdiff.makeDiff(ExpectedImg, ActualImg);
		
		return imgdifferance.hasDiff();
		
	}
}
