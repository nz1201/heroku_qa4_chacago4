package com.heroku.steps_definitions;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.google.common.base.CharMatcher;
import com.heroku.pages.HuntPage;
import com.heroku.pages.MapPage;
import com.heroku.pages.SchedulePage;
import com.heroku.pages.SignInPage;
import com.heroku.utilities.BrowserUtils;
import com.heroku.utilities.Driver;
import cucumber.api.PendingException;
import com.heroku.pages.MapPage;
import com.heroku.pages.SelfPage;
import com.heroku.pages.SignInPage;
import com.heroku.pages.TeamPage;
import com.heroku.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class Verifications_steps {
	
	
	@Then("the user should see just study rooms are clickable")
	public void the_user_should_see_just_study_rooms_are_clickable() {
		
		SignInPage signInPage = new SignInPage();
		SchedulePage schePage=new SchedulePage();
		BrowserUtils.waitFor(2);
		MapPage mapPage=new MapPage();
		mapPage.googleRoom.click();
		BrowserUtils.waitFor(2);
		String actualRoomG=schePage.googleRoomTitle.getText();
		String expectedRoomG="google";
		Assert.assertEquals(expectedRoomG, actualRoomG);
	
		
		BrowserUtils.waitFor(2);
		mapPage.goToMap();
		mapPage.appleRoom.click();
		BrowserUtils.waitFor(2);
		String actualRoomA=schePage.googleRoomTitle.getText();
		String expectedRoomA="apple";
		Assert.assertEquals(expectedRoomA, actualRoomA);
	
		BrowserUtils.waitFor(2);
		mapPage.goToMap();
		mapPage.microsoftRoom.click();
		BrowserUtils.waitFor(2);
		String actualRoomM=schePage.googleRoomTitle.getText();
		String expectedRoomM="microsoft";
		Assert.assertEquals(expectedRoomM, actualRoomM);
		
		BrowserUtils.waitFor(2);
		mapPage.goToMap();
		mapPage.amazonRoom.click();
		BrowserUtils.waitFor(2);
		String actualRoomAM=schePage.googleRoomTitle.getText();
		String expectedRoomAM="amazon";
		Assert.assertEquals(expectedRoomAM, actualRoomAM);
		
		BrowserUtils.waitFor(2);
		mapPage.goToMap();
		mapPage.teslaRoom.click();
		BrowserUtils.waitFor(2);
		String actualRoomT=schePage.googleRoomTitle.getText();
		String expectedRoomT="tesla";
		Assert.assertEquals(expectedRoomT, actualRoomT);
		
		BrowserUtils.waitFor(2);
		mapPage.goToMap();
		mapPage.facebookRoom.click();
		BrowserUtils.waitFor(2);
		String actualRoomF=schePage.googleRoomTitle.getText();
		String expectedRoomF="facebook";
		Assert.assertEquals(expectedRoomF, actualRoomF);
		
		
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
	   SignInPage signInPage = new SignInPage();
	   signInPage.signInButton.click();
	   MapPage mapPage=new MapPage();
	   mapPage.goToMap();
	  
	   for(int i=0;i<dataTable.size();i++) {
		   if(mapPage.mapModule.getText().equals(dataTable.get(i)));
		   Assert.assertTrue(true);
			   
	   }
	   for(int i=0;i<dataTable.size();i++) {
		   if(mapPage.scheduleModule.getText().equals(dataTable.get(i)));
		   Assert.assertTrue(true);
			   
	   }
	   
	   for(int i=0;i<dataTable.size();i++) {
		   if(mapPage.huntModule.getText().equals(dataTable.get(i)));
		   Assert.assertTrue(true);
			   
	   }
	   
	   
	   for(int i=0;i<dataTable.size();i++) {
		   if(mapPage.myModule.getText().equals(dataTable.get(i)));
		   Assert.assertTrue(true);
			   
	   }
		
		
	}

	@Then("the user should be able to {string} time : {string}")
	public void the_user_should_be_able_to_time(String choose, String expected) {
	HuntPage hunt = new HuntPage();
	int first = hunt.firstTimeToInt();
	int c;
	if(choose.equals("min"))
		c=0;
	else c=3;
	int second = hunt.secondTimeToInt(c);
	String actual = (second-first)+"";
	Assert.assertEquals(expected, actual);
		
	}
}
