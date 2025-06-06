package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.RegisterPage;
import utils.PublicFunctions;

public class RegisterNewUser extends TestBase{
	protected LandingPage LandingPage;
	private RegisterPage RegisterPage;
	private PublicFunctions PublicFunctions;
	
	@Then("The user clicks register button")
	public void the_user_clicks_register_button() {
		LandingPage = new LandingPage(TestBase.driver);
		LandingPage.clickRegister();
	}

	@When("The user enter name {string} in step")
	public void the_user_enter_name_in_step(String name) {
		RegisterPage = new RegisterPage(TestBase.driver);
		RegisterPage.enterName(name);
	}

	@Then("The user enter surname {string} in step")
	public void the_user_enter_surname_in_step(String string) {
	    RegisterPage.enterSurname(string);
	}

	@When("The user enter phone {string} in step")
	public void the_user_enter_phone_in_step(String string) {
		RegisterPage.enterPhone(string);
	}

	@Then("The user enter email {string} in step")
	public void the_user_enter_email_in_step(String string) {
		RegisterPage.enterEmeilAddress(string);
	}

	@When("The user select IDtype {string} in step")
	public void the_user_select_i_dtype_in_step(String string) {
		PublicFunctions = new PublicFunctions(TestBase.driver);
		
		PublicFunctions.selectByVisibleText(string, RegisterPage.getIdentificationType());
	}

	@Then("The user enter IDNumber {string} in step")
	public void the_user_enter_id_number_in_step(String string) {
		RegisterPage.enterIdNumber(string);
	}

	@When("The user enter DOB {string} in step")
	public void the_user_enter_dob_in_step(String string) {
		RegisterPage.enterDOB(string);	}

	@Then("The user enter password {string} in step")
	public void the_user_enter_password_in_step(String string) {
		RegisterPage.enterPassword(string);
	}

	@When("The user enter ConfrimPassword {string} in step")
	public void the_user_enter_confrim_password_in_step(String string) {
		RegisterPage.enterConfirmPassword(string);
	}

	@Then("The user enter address1 {string} in step")
	public void the_user_enter_address1_in_step(String string) {
		RegisterPage.enterAddressLine1(string);
	}

	@When("The user enter address2 {string} in step")
	public void the_user_enter_address2_in_step(String string) {
		RegisterPage.enterAddressLine2(string);
	}

	@Then("The user enter address3 {string} in step")
	public void the_user_enter_address3_in_step(String string) {
		RegisterPage.enterAddressLine3(string);
	}

	@When("The user enter post code {string} in step")
	public void the_user_enter_post_code_in_step(String string) {
		RegisterPage.enterAddressLinePostalCode(string);
	}
	
	@Then("The user click accept terms")
	public void the_user_click_accept_terms() {
		RegisterPage.clickAcceptTerms();
	}

	@Then("The user click submit button")
	public void the_user_click_submit_button() {
		(TestBase.driver).quit();
	}

}
