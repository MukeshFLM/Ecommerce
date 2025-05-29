package RegisterFunctionality;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class TC_RF_004 extends BaseClass {

    @Test
    public void ValidateProperErrorMsgDisplayedForEmptyFields() {
        getDriver().findElement(By.xpath("//li//a[@title='My Account']")).click();
        getDriver().findElement(By.linkText("Register")).click();
        getDriver().findElement(By.xpath("//input[@type='submit']")).click();

        String expectedWarningForFirstName = "First Name must be between 1 and 32 characters!";
        String expectedWarningForLastName = "Last Name must be between 1 and 32 characters!";
        String expectedWarningForEmail = "E-Mail Address does not appear to be valid!";
        String expectedWarningForTelephone = "Telephone must be between 3 and 32 characters!";
        String expectedWarningForPassword = "Password must be between 4 and 20 characters!";
        String expectedWarningForPrivacyPolicy = "Warning: You must agree to the Privacy Policy!";

        Assert.assertEquals(getDriver().findElement(By.xpath("//div[contains(text(), 'First Name')]")).getText(), expectedWarningForFirstName);
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[contains(text(), 'Last Name')]")).getText(), expectedWarningForLastName);
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[contains(text(), 'E-Mail Address')]")).getText(), expectedWarningForEmail);
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[contains(text(), 'Telephone')]")).getText(), expectedWarningForTelephone);
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[contains(text(), 'Password')]")).getText(), expectedWarningForPassword);
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[contains(text(), 'Warning:')]")).getText(), expectedWarningForPrivacyPolicy);
    }
}
