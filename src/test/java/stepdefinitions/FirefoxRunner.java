package stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class FirefoxRunner {
	
	@Given("^I launch google page in Firefox$")
	public void i_launch_google_page_in_Firefox() throws Throwable {
		System.out.println("I launch Chrome Browser in firefox");
	}

	@When("^I open google homepage in Firefox$")
	public void i_open_google_homepage_in_Firefox() throws Throwable {
		System.out.println("I open google homepage in firefox");
	}

	@Then("^I verfiy that the page display search textbox in Firefox$")
	public void i_verfiy_that_the_page_display_search_textbox_in_Firefox() throws Throwable {
		System.out.println("I verify that the page display search textbox in firefox");
	}

	@Then("^The page displays Google Search button in Firefox$")
	public void the_page_displays_Google_Search_button_in_Firefox() throws Throwable {
	   
	}

	@Then("^The page displays Im Feeling Lucky button in Firefox$")
	public void the_page_displays_Im_Feeling_Lucky_button_in_Firefox() throws Throwable {
	   
	}


}
