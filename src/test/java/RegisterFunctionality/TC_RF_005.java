package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import CommonUtils.RandomGmailCreation;

public class TC_RF_005 extends BaseClass {

    @Test
    public void ValidateRegisteringAnAccountWhenYesOptionIsSelected() {
        getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
        getDriver().findElement(By.linkText("Register")).click();

        getDriver().findElement(By.id("input-firstname")).sendKeys("Mukesh");
        getDriver().findElement(By.id("input-lastname")).sendKeys("Ganivada");
        getDriver().findElement(By.id("input-email")).sendKeys(RandomGmailCreation.GmailCreation());
        getDriver().findElement(By.id("input-telephone")).sendKeys("6300476285");
        getDriver().findElement(By.id("input-password")).sendKeys("Mukesh1000");
        getDriver().findElement(By.name("confirm")).sendKeys("Mukesh1000");

        // Select 'Yes' for newsletter
        getDriver().findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();

        // Agree to Privacy Policy
        getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();

        // Submit the form
        getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        // Validate registration success message
        String actualSuccessText = getDriver().findElement(By.xpath("//div//p[starts-with(text(),'Congratulations!')]")).getText();
        Assert.assertEquals(actualSuccessText, "Congratulations! Your new account has been successfully created!");

        // Click Continue
        getDriver().findElement(By.linkText("Continue")).click();

        // Validate Account page is shown
        Assert.assertTrue(getDriver().findElement(By.linkText("Account")).isDisplayed());

        // Go to newsletter preferences
        getDriver().findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();

        // Validate 'Yes' is selected
        Assert.assertTrue(getDriver().findElement(By.xpath("//input[@name='newsletter'][@value='1']")).isSelected());

        // Optional cleanup (e.g., logout or delete account logic, if available)
    }
}
