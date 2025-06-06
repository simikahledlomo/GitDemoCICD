package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	private WebDriver driver;
	
	@FindBy(linkText = "Login")
	private WebElement LoginButton;
	
	@FindBy(xpath = ".//a[contains(@href,'/Register/Register')]")
	private WebElement Register;
	
	@FindBy(xpath = ".//a[contains(@href,'/Register/CreateContact')]")
	private WebElement ContactUs;
	
	@FindBy(xpath = ".//strong [text() = 'Frequently Asked Questions']")
	private WebElement FAQ;
	
	@FindBy(xpath = ".//div[@id= 'headingTwo000']")
	private WebElement HTR;
	
	@FindBy(xpath = ".//div[@id= 'headingTwo00000']")
	private WebElement FOT;
	
	@FindBy(xpath = ".//div[@id= 'headingTwo00']")
	private WebElement RTT;
	
	@FindBy(xpath = ".//div[@id= 'headingThree']")
	private WebElement HDIRFLA;
	
	@FindBy(xpath = ".//div[@id= 'headingSix']")
	private WebElement HMITCFTP;
	
	@FindBy(xpath = ".//div[@id= 'headingSeven']")
	private WebElement HTRP;
	
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void clickRegister() {
		Register.click();
	}
	
	public void clickLoginButton() {
		LoginButton.click();
	}
	
	public void clickContactUsButton() {
		ContactUs.click();
	}
	
	public WebElement getFQA(){
		return FAQ;
	}
	
	public void clickHTR() throws InterruptedException{
		HTR.click();
		Thread.sleep(500);
	}
	
	public void clickFOT() throws InterruptedException{
		FOT.click();
		Thread.sleep(500);
	}
	
	public void clickRTT() throws InterruptedException{
		RTT.click();
		Thread.sleep(500);
	}
	
	public void clickHDIRFLA() throws InterruptedException{
		HDIRFLA.click();
		Thread.sleep(500);
	}
	
	public void clickHMITCFTP() throws InterruptedException{
		HMITCFTP.click();
		Thread.sleep(500);
	}
	
	public void clickHTRP() throws InterruptedException{
		HTRP.click();
		Thread.sleep(500);
	}
}
