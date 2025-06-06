package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.ContactUsPage;

public class ContactDED {
	protected LandingPage LandingPage;
	private ContactUsPage ContactUsPage;
	
	@Then("The user clicks Contact us button")
	public void the_user_clicks_contact_us_button() {
		LandingPage = new LandingPage(TestBase.driver);
		LandingPage.clickContactUsButton();
	}

	@When("The user enter first name {string} in step")
	public void the_user_enter_first_name_in_step(String string) {
		ContactUsPage = new ContactUsPage(TestBase.driver);
		ContactUsPage.enterName(string);
	}

	@Then("The user enter last surname {string} in step")
	public void the_user_enter_last_surname_in_step(String string) {
		ContactUsPage.enterSurname(string);
	}

	@When("The user enter cellphone {string} in step")
	public void the_user_enter_cellphone_in_step(String string) {
		ContactUsPage.enterContactNumber(string);
	}

	@Then("The user enter email address {string} in step")
	public void the_user_enter_email_address_in_step(String string) {
		ContactUsPage.enterEmail(string);
	}

	@When("The user enter message {string} in step")
	public void the_user_enter_message_in_step(String string) {
		ContactUsPage.enterMessage(string);
	}

	@Then("The user clicks submit buuton in step")
	public void the_user_clicks_submit_buuton_in_step() {
		(TestBase.driver).quit();
	}

}
