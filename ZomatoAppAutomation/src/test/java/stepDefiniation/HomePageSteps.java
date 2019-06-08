package stepDefiniation;

import cucumber.api.java.en.Given;

public class HomePageSteps {
	
	@Given("^Launch application$")
	public void launchApplication(){
		System.out.println("We are launching Application");
	}
	
	@Given("^Verify app is laucnhed successfully$")
	public void appLauncedSuccessfully(){
		System.out.println("############## App is Launched Successfully ################## ");
	}

}
