package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(linkText = "Stall Application")
	private WebElement StallApplication;
	
	@FindBy(linkText = "View Application Status")
	private WebElement ViewApplicationStatus;
	
	@FindBy(linkText = "Attach Documents")
	private WebElement AttachDocuments;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickViewApplicationStatus() {
		ViewApplicationStatus.click();
	}
	
	public void clickStallApplication() {
		StallApplication.click();
	}
	
	public void clickAttachDocuments() {
		AttachDocuments.click();
	}
}
