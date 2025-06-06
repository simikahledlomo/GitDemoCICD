package stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import utils.PublicFunctions;

public class LearningThePortal{
	private LandingPage LandingPage;
	private PublicFunctions PublicFunctions;
	private JavascriptExecutor js;
	
	@Then("The user scroll down to FAQs")
	public void the_user_scroll_down_to_fa_qs() throws InterruptedException {
		LandingPage = new LandingPage(TestBase.driver);
		WebElement element = LandingPage.getFQA();
		js = (JavascriptExecutor) TestBase.driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
	}

	@When("The user clicks on how to register")
	public void the_user_clicks_on_how_to_register() throws InterruptedException {
		LandingPage.clickHTR();
	}

	@Then("The user clicks on Formas of trading")
	public void the_user_clicks_on_formas_of_trading() throws InterruptedException {
		LandingPage.clickFOT();
	}

	@When("The user clicks on requirements to trade")
	public void the_user_clicks_on_requirements_to_trade() throws InterruptedException {
		LandingPage.clickRTT();
	}

	@Then("The user clicks on how do i register for lease agreement")
	public void the_user_clicks_on_how_do_i_register_for_lease_agreement() throws InterruptedException {
		LandingPage.clickHDIRFLA();
	}

	@When("The user clicks on how much is the cost for the tarding permit")
	public void the_user_clicks_on_how_much_is_the_cost_for_the_tarding_permit() throws InterruptedException {
		LandingPage.clickHMITCFTP();
	}

	@Then("The user clicks on how to reset password")
	public void the_user_clicks_on_how_to_reset_password() throws InterruptedException {
		LandingPage.clickHTRP();
	}

}
