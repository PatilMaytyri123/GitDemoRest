package StepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {
	
	@Given("^User is Net Banking landing page$")
	public  void Netbanking_landing_page()throws Throwable
	{
		
		// code to user navigate to landing page
		System.out.println("Navigated to longin URL");
	}
	
	@When("^User login into application with username & password$")
	public  void Username_password()throws Throwable
	{
		// code to User name & password
		System.out.println("Logged in Succes");
		
	}
	
	
	@When("^User login into application with \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_login_into_application_with_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
	  
	    
	}


	@Then("^Home page Populated$")
	public  void Home_Page()throws Throwable
	{
		System.out.println("Validate the Home Page");
	}
	
	
	@And("^Cards Displayed are \"([^\"]*)\"$")
	public void cards_Displayed_are(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	    
	}
	
}

