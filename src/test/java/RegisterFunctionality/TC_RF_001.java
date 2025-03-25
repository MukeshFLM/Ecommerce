package RegisterFunctionality;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_001 {
	@Test
	public void ValidateRegisteringAnAccoiuntByFillingMandatoryFields() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\mukesh.ganivada\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");

		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//li//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Mukesh");
		driver.findElement(By.id("input-email")).sendKeys(RandomGmailCreation());
		driver.findElement(By.id("input-lastname")).sendKeys("Ganivada");
		driver.findElement(By.id("input-telephone")).sendKeys("6300476285");
		driver.findElement(By.id("input-password")).sendKeys("Mukesh1000");
		driver.findElement(By.name("confirm")).sendKeys("Mukesh1000");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

		String ExpectedHeading = "Your Account Has Been Created!";

		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//h1")).getText(), ExpectedHeading);

		String ActualProperDetailsOne = "Congratulations! Your new account has been successfully created!";
		String ActualProperDetailsTwo = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String ActualProperDetailsThree = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String ActualProperDetailsFour = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please ";

		String ExpectedProperDetails = driver.findElement(By.id("content")).getText();

		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsOne));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsTwo));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsThree));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsFour));

		driver.findElement(By.linkText("Continue")).click();

		Assert.assertTrue(driver.findElement(By.linkText("Account")).isDisplayed());

		driver.quit();
	}
	public String RandomGmailCreation() {
		return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
	}


}
