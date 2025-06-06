package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	private WebDriver deriver;
	
	@FindBy (id = "FirstName")
	private WebElement FirstName;
	
	@FindBy (id = "Surname")
	private WebElement Surname;
	
	@FindBy (id = "EmailAddress")
	private WebElement EmailAddress;
	
	@FindBy (id = "Message")
	private WebElement Message;
	
	@FindBy (id = "ContactNumber")
	private WebElement ContactNumber; 
	
	@FindBy (linkText = "Submit")
	private WebElement Submit; 
	
	
	public ContactUsPage(WebDriver driver) {
		this.deriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterName(String name) {
		FirstName.sendKeys(name);
	}
	
	public void enterSurname(String surname) {
		Surname.sendKeys(surname);
	}
	
	public void enterEmail(String email) {
		EmailAddress.sendKeys(email);
	}
	
	public void enterMessage(String message) {
		Message.sendKeys(message);
	}
	
	public void enterContactNumber(String phone) {
		ContactNumber.sendKeys(phone);
	}
	
	public void clickSubmit(String IdNumber) {
		Submit.click();
	}

}
