package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private WebDriver deriver;
	
	@FindBy (id = "CompanyName")
	private WebElement Name;
	
	@FindBy (id = "CompanyContactPerson")
	private WebElement CompanyContactPerson;
	
	@FindBy (id = "CompanyContactPhone")
	private WebElement CompanyContactPhone;
	
	@FindBy (id = "EmailAddress")
	private WebElement EmailAddress;
	
	@FindBy (id = "IdentificationType")
	private WebElement IdentificationType; 
	
	@FindBy (id = "IdNumber")
	private WebElement IdNumber; 
	
	@FindBy (id = "kt_datepicker_3")
	private WebElement kt_datepicker_3; 
	
	@FindBy (id = "Password")
	private WebElement Password; 
	
	@FindBy (id = "ConfirmPassword")
	private WebElement ConfirmPassword; 
	
	@FindBy (id = "AddressLine1")
	private WebElement AddressLine1; 
	
	@FindBy (id = "AddressLine2")
	private WebElement AddressLine2; 
	
	@FindBy (id = "AddressLine3")
	private WebElement AddressLine3;
	
	@FindBy (id = "AddressLinePostalCode")
	private WebElement AddressLinePostalCode;
	
	@FindBy (xpath = ".//label[@class = 'kt-checkbox kt-checkbox--tick kt-checkbox--danger']//span")
	private WebElement AcceptTerms;
	
	@FindBy (id = "submitbtn")
	private WebElement submitbtn;
	
	public RegisterPage(WebDriver driver) {
		this.deriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterName(String name) {
		Name.sendKeys(name);
	}
	
	public void enterSurname(String surname) {
		CompanyContactPerson.sendKeys(surname);
	}
	
	public void enterPhone(String phone) {
		CompanyContactPhone.sendKeys(phone);
	}
	
	public void enterEmeilAddress(String email) {
		EmailAddress.sendKeys(email);
	}
	
	public WebElement getIdentificationType() {
		return IdentificationType;
	}
	
	public void enterIdNumber(String IdNumber) {
		this.IdNumber.sendKeys(IdNumber);
	}
	
	public void enterDOB(String kt_datepicker_3) {
		this.kt_datepicker_3.sendKeys(kt_datepicker_3);
	}
	
	public void enterPassword(String Password) {
		this.Password.click();
		this.Password.sendKeys(Password);
	}
	
	public void enterConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.sendKeys(ConfirmPassword);
	}
	
	public void enterAddressLine1(String AddressLine1) {
		this.AddressLine1.sendKeys(AddressLine1);
	}
	
	public void enterAddressLine2(String AddressLine2) {
		this.AddressLine2.sendKeys(AddressLine2);
	}
	
	public void enterAddressLine3(String AddressLine3) {
		this.AddressLine3.sendKeys(AddressLine3);
	}
	
	public void enterAddressLinePostalCode(String AddressLinePostalCode) {
		this.AddressLinePostalCode.sendKeys(AddressLinePostalCode);
	}
	
	public void clickAcceptTerms() {
		AcceptTerms.click();;
	}
	
	public void clickSubmitbtn() {
		submitbtn.click();;
	}
}
