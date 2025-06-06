package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(id = "SouthAfricanIdNo")
	private WebElement SouthAfricanIdNo;
	
	@FindBy(id = "Userpassword")
	private WebElement Userpassword;
	
	@FindBy(xpath = ".//button [@type = 'submit']")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterIDandPassword(String saID, String Password) {
		SouthAfricanIdNo.sendKeys(saID);
		Userpassword.sendKeys(Password);
	} 
	
	public void clickLoginButton() {
		LoginButton.click();
	}
}
