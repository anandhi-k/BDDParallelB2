package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChromeStepDef {
	@Given("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
		System.out.println("I launch Chrome Browser");
	}

	@When("^I open google homepage$")
	public void i_open_google_homepage() throws Throwable {
		System.out.println("I open google homepage");
	}

	@Then("^I verfiy that the page display search textbox$")
	public void i_verfiy_that_the_page_display_search_textbox() throws Throwable {
		System.out.println("I verify that the page display search textbox");
	}

	@Then("^The page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Throwable {
		System.out.println("The page displays Google Search button");
	}

	@Then("^The page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Throwable {
		System.out.println("The page displays Im Feeling Lucky button");
	}

}
