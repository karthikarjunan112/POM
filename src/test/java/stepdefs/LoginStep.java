package stepdefs;

import base.Login;
import commonUtils.Initialize;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends Initialize{
	   Login log= new Login();
	@Given("user already in login page")
	public void user_already_in_login_page() {
	    initializeWebDriver();
	}

	@When("credentials are entered")
	public void credentials_are_entered() {
	
	   log.EnterLoginCredentials("corpdevops@gmail.com", "CrmPro123");;
	}

	@Then("user is iin home page")
	public void user_is_iin_home_page() {
	  log.verifyhomePage();  
	}

	@Then("close browser")
	public void close_browser() {
	   closedriver();
	}

}
