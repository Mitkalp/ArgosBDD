package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.ArgosHomePageAction;
import utill.SeleniumDriver;

public class ArgosHomePAgeSteps {

	ArgosHomePageAction action;

	@Given("go to url{string}")
	public void gotoUrl(String url) {
	
		SeleniumDriver.openPage(url);
		
	}

	@And("enter {String}in search text box")
	public void enterData(String text) {
		
		 action=new ArgosHomePageAction(); 
		 
		 action.enterText(text);
	}
	
	@When("click on search button")
	public void searchIcon() {
		action.serarchButton();
		
	}
	
	
	@Then("Redirect to catagory  page")
	public void nextPage() {
		System.out.println("page redirected");
	}
	
}




