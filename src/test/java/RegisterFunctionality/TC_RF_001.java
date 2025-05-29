package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_001 extends BaseClass {

    @Test
    public void ValidateRegisteringAnAccountByFillingMandatoryFields() {

        getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
        getDriver().findElement(By.linkText("Register")).click();
        getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
        getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
        getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
        getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
        getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
        getDriver().findElement(By.name("confirm")).sendKeys("Mukesh1000");
        getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
        getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        Assert.assertTrue(getDriver().findElement(By.linkText("Logout")).isDisplayed());

        String expectedHeading = "Your Account Has Been Created!";
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='content']//h1")).getText(), expectedHeading);

        String expectedContent = getDriver().findElement(By.id("content")).getText();

        Assert.assertTrue(expectedContent.contains("Congratulations! Your new account has been successfully created!"));
        Assert.assertTrue(expectedContent.contains("You can now take advantage of member privileges to enhance your online shopping experience with us."));
        Assert.assertTrue(expectedContent.contains("If you have ANY questions about the operation of this online shop, please e-mail the store owner."));
        Assert.assertTrue(expectedContent.contains("A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please "));

        getDriver().findElement(By.linkText("Continue")).click();

        Assert.assertTrue(getDriver().findElement(By.linkText("Account")).isDisplayed());

       
    }
}
