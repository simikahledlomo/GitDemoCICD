package stepdefinitions;

import io.cucumber.java.en.*;
import base.TestBase;
import pages.LandingPage;
import pages.LoginPage;
import pages.HomePage;

public class ViewCurrentApplication
extends TestBase {
	protected LandingPage LandingPage;
	private LoginPage LoginPage;
	private HomePage HomePage;
	
	@Given("IMS baseURL {string} browser {string}")
	public void ims_base_url_browser(String url, String browser) {
		driver = setup();
        driver.get(url);
	}

	@Then("The user clicks Login button")
	public void the_user_clicks_login_button() {
		LandingPage = new LandingPage(driver);
		LandingPage.clickLoginButton();
	}

	@Then("The user enter {string} and {string}")
	public void the_user_enter_and(String saIDnumber, String Password) {
		LoginPage = new LoginPage(driver);
		LoginPage.enterIDandPassword(saIDnumber, Password);
	}

	@Then("The user clicks sign in button")
	public void the_user_clicks_sign_in_button() {
	    LoginPage.clickLoginButton();
	}
	
	@Then("The user will click View Application Status button")
	public void the_user_will_click_view_application_status_button() {
		HomePage = new HomePage(driver);
		HomePage.clickViewApplicationStatus();
	}
    
}