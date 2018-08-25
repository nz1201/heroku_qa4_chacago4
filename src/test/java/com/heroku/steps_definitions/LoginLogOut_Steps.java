package com.heroku.steps_definitions;


import com.heroku.pages.MapPage;
import com.heroku.pages.SignInPage;
import com.heroku.utilities.BrowserUtils;
import com.heroku.utilities.ConfigurationReader;
import com.heroku.utilities.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginLogOut_Steps {
	
	@Given("the user {string} and {string}")
	public void the_user_and(String username, String password) {
	   
		SignInPage signInPage = new SignInPage();
		signInPage.email.sendKeys(username);
		signInPage.password.sendKeys(password);
		signInPage.signInButton.click();
		
	}
	
	@And("the user should click signin button")
	public void the_user_should_click_signin_button() {
		SignInPage signInPage = new SignInPage();
		signInPage.signInButton.click();

	
	
	}

	
	@Then("IL text should be displayed")
	public void il_text_should_be_displayed() {
		MapPage map = new MapPage();
		BrowserUtils.waitFor(5);
		String actual = map.iLTitile.getText();
		String expected = "IL";
		Assert.assertEquals(expected, actual);

	}

	@Then("the user should click log out on My module")
	public void the_user_should_click_log_out_on_My_module() {
	 SignInPage signout = new SignInPage();
	 signout.signOut();
		
	
	}

	@Then("the user should be landed sign in page")
	public void the_user_should_be_landed_sign_in_page() {
		SignInPage signout = new SignInPage();
		String actual = signout.signInTitle.getText();
		String expected = "sign in";
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Then("actualTitle should match expectedTitle: {string}")
	public void actualtitle_should_match_expectedTitle(String string) {
	   
		
	}
	
}
