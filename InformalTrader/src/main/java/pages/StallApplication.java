package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StallApplication {
	private WebDriver driver;
	
	@FindBy(id = "btnPartialSave")
	private WebElement btnPartialSave;
	
	
	
	@FindBy(id = "MemberOfTradersAssociation")
	private WebElement MemberOfTradersAssociation;
	
	@FindBy(id = "NameOfTradersAssociation")
	private WebElement NameOfTradersAssociation;
	
	@FindBy(id = "OtherNameOfTradersAssociation")
	private WebElement OtherNameOfTradersAssociation;
	
	@FindBy(id = "Region")
	private WebElement Region;
	
	@FindBy(id = "Location")
	private WebElement Location;
	
	@FindBy(id = "StreetName")
	private WebElement StreetName;
	
	@FindBy(id = "BlockName")
	private WebElement BlockName;
	
	@FindBy(id = "HasStallNumber")
	private WebElement HasStallNumber;
	
	@FindBy(id = "StallNumber")
	private WebElement StallNumber;
	
	@FindBy(id = "HasSmartCard")
	private WebElement HasSmartCard;
	
	@FindBy(id = "SmartCardNumber")
	private WebElement SmartCardNumber;
	
	@FindBy(id = "NumberofDependants")
	private WebElement NumberofDependants;
	
	@FindBy(id = "HeadOfHousehold")
	private WebElement HeadOfHousehold;
	
	@FindBy(id = "YearsTradingInSpot")
	private WebElement YearsTradingInSpot;
	
	@FindBy(id = "YearsTradingInMarket")
	private WebElement YearsTradingInMarket;
	
	@FindBy(id = "EstimatedIncomeMonthly")
	private WebElement EstimatedIncomeMonthly;
	
	
	
	
	@FindBy(id = "Assistance_Has")
	private WebElement Assistance_Has;
	
	@FindBy(id = "Assistance_FirstName")
	private WebElement Assistance_FirstName;
	
	@FindBy(id = "Assistance_Surname")
	private WebElement Assistance_Surname;
	
	@FindBy(id = "Assistance_Emailddress")
	private WebElement Assistance_Emailddress;
	
	@FindBy(id = "Assistance_ContactNumber")
	private WebElement Assistance_ContactNumber;
	
	@FindBy(id = "Assistance_IdentityPassport")
	private WebElement Assistance_IdentityPassport;
	
	
	
	
	
	@FindBy(linkText = "Street Trading")
	private WebElement StreetTrading;
	
	@FindBy(id = "ProductsSold")
	private WebElement ProductsSold;
	
	@FindBy(id = "OtherProductsSold")
	private WebElement OtherProductsSold;
	
	@FindBy(id = "ServicesRendered")
	private WebElement ServicesRendered;
	
	@FindBy(id = "OtherServicesRendered")
	private WebElement OtherServicesRendered;
	
	@FindBy(id = "CookedFood")
	private WebElement CookedFood;
	
	@FindBy(id = "CertificateOfAcceptability")
	private WebElement CertificateOfAcceptability;
	
	@FindBy(id = "GasCylinder")
	private WebElement GasCylinder;
	
	@FindBy(id = "FireExtinguisher")
	private WebElement FireExtinguisher;
	
	@FindBy(id = "kt_datepicker_4_1")
	private WebElement kt_datepicker_4_1;
	
	
	
	
	@FindBy(id = "StallId")
	private WebElement StallId;
	
	@FindBy(id = "btnSave")
	private WebElement btnSave;
	
	
	
	
	
	
	
	public StallApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
