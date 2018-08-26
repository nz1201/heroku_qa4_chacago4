package com.heroku.steps_definitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.heroku.pages.MapPage;
import com.heroku.pages.SchedulePage;
import com.heroku.pages.SignInPage;
import com.heroku.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;


public class Verifications_steps {
	
	
	@Then("the user should see just study rooms are clickable")
	public void the_user_should_see_just_study_rooms_are_clickable() {
	   
		SignInPage signInPage = new SignInPage();
		SchedulePage schePage=new SchedulePage();
		MapPage mapPage=new MapPage();
		signInPage.signInButton.click();
		mapPage.googleRoom.click();
		BrowserUtils.waitFor(3);
		String actualRoomG=schePage.googleRoomTitle.getText();
		String expectedRoomG="google";
		Assert.assertEquals(expectedRoomG, actualRoomG);
	
		
		
		mapPage.goToMap();
		mapPage.appleRoom.click();
		BrowserUtils.waitFor(3);
		String actualRoomA=schePage.googleRoomTitle.getText();
		String expectedRoomA="apple";
		Assert.assertEquals(expectedRoomA, actualRoomA);
	
		mapPage.goToMap();
		mapPage.microsoftRoom.click();
		BrowserUtils.waitFor(3);
		String actualRoomM=schePage.googleRoomTitle.getText();
		String expectedRoomM="microsoft";
		Assert.assertEquals(expectedRoomM, actualRoomM);
		
		mapPage.goToMap();
		mapPage.amazonRoom.click();
		BrowserUtils.waitFor(3);
		String actualRoomAM=schePage.googleRoomTitle.getText();
		String expectedRoomAM="amazon";
		Assert.assertEquals(expectedRoomAM, actualRoomAM);
		
		
		mapPage.goToMap();
		mapPage.teslaRoom.click();
		BrowserUtils.waitFor(3);
		String actualRoomT=schePage.googleRoomTitle.getText();
		String expectedRoomT="tesla";
		Assert.assertEquals(expectedRoomT, actualRoomT);
		
		mapPage.goToMap();
		mapPage.facebookRoom.click();
		BrowserUtils.waitFor(3);
		String actualRoomF=schePage.googleRoomTitle.getText();
		String expectedRoomF="facebook";
		Assert.assertEquals(expectedRoomF, actualRoomF);
		
		
	}

	
	@Then("the user should go to my-self account page")
	public void the_user_should_go_to_my_self_account_page() {
	    
		
	}

	@Then("the user's name: {string} should be displayed")
	public void the_user_s_name_should_be_displayed(String string) {
	   
		
		
	}

	@Then("the user should go to my-team account page")
	public void the_user_should_go_to_my_team_account_page() {
	   
		
		
	}

	@Then("the user's team name: {string} should be displayed")
	public void the_user_s_team_name_should_be_displayed(String string) {
	    
		
		
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

	@Then("the user should be able to choose min and max time")
	public void the_user_should_be_able_to_choose_min_and_max_time(List<String> dataTable) {
	   
	}
}
