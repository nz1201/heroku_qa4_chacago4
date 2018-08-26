package com.heroku.steps_definitions;

import java.util.List;

import com.heroku.pages.MapPage;
import com.heroku.pages.SelfPage;
import com.heroku.pages.SignInPage;
import com.heroku.pages.TeamPage;
import com.heroku.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import org.junit.Assert;

public class Verifications_steps {
	
	@Then("the user should see just study rooms: {string} are clickable")
	public void the_user_should_see_just_study_rooms_are_clickable(String string) {
	   
		
	}

	
	@Then("the user should go to my-self account page")
	public void the_user_should_go_to_my_self_account_page() {

		MapPage mp = new MapPage();
		mp.goToSelf();
		BrowserUtils.waitFor(2);
	}

	@Then("the user's name: {string} should be displayed")
	public void the_user_s_name_should_be_displayed(String username) {
		Assert.assertEquals(username, new SelfPage().username.getText());
		SignInPage signout = new SignInPage();
		signout.signOut();
		BrowserUtils.waitFor(2);
		
		
	}

	@Then("the user should go to my-team account page")
	public void the_user_should_go_to_my_team_account_page() {

		MapPage mp = new MapPage();
		mp.goToTeam();
		BrowserUtils.waitFor(2);
	}

	@Then("the user's team name: {string} should be displayed")
	public void the_user_s_team_name_should_be_displayed(String team) {
		String acctual =new TeamPage().teamName.getText();

		Assert.assertEquals(team, acctual);
		SignInPage signout = new SignInPage();
		signout.signOut();
		BrowserUtils.waitFor(2);

	}

	@Then("the user should see all modules:")
	public void the_user_should_see_all_modules(List<String> dataTable) {
	   
		
		
	}

	@Then("the user should be able to choose min and max time")
	public void the_user_should_be_able_to_choose_min_and_max_time(List<String> dataTable) {
	   
	}
}
