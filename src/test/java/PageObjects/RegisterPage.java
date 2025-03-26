package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver driver;

	
	@FindBy(xpath="//li//a[@title='My Account']")
	WebElement Myaccount;
	
	@FindBy(linkText = "Register")
	WebElement Register;
	
	@FindBy(id = "input-firstname")
	WebElement FirstName;
	
	@FindBy(id = "input-lastname")
	WebElement LastName;
	
	@FindBy(id = "input-email")
	WebElement Email;
	
	@FindBy(id = "input-telephone")
	WebElement Telephone;
	
	@FindBy(id = "input-password")
	WebElement InputPassword;
	
	@FindBy(name = "confirm")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement CheckBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;
	
	public static void EnterTheFields(String EnterFirstName, String EnterLastName, String EnterEmail, int EnterTelephone, String EnterInputPassword, String EnterConfirmPassword) {
	
		
	}
	

}
