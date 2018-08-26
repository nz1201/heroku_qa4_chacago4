package com.heroku.steps_definitions;

import java.time.LocalDate;

import org.junit.Assert;

import com.heroku.pages.HuntPage;
import com.heroku.pages.MapPage;
import com.heroku.pages.SignInPage;
import com.heroku.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Veiws_steps {
	
	// tests by Aizada
	@Then("the user should see all daily view on all classes")
	public void the_user_should_see_all_daily_view_on_all_classes() {
		
	    MapPage mapPage = new MapPage();
	    mapPage.amazonRoom.click();
	    Assert.assertEquals("7:00AM", mapPage.dailyView.getText());
	    
	    mapPage.goToMap();
	    mapPage.googleRoom.click();
	    Assert.assertEquals("7:00AM", mapPage.dailyView.getText());
	    
	    mapPage.goToMap();
	    mapPage.appleRoom.click();
	    Assert.assertEquals("7:00AM", mapPage.dailyView.getText());
	    
	    mapPage.goToMap();
	    mapPage.facebookRoom.click();   
	    Assert.assertEquals("7:00AM", mapPage.dailyView.getText());
	    
	    mapPage.goToMap();
	    mapPage.googleRoom.click();
	    Assert.assertEquals("7:00AM", mapPage.dailyView.getText());
	    
	    mapPage.goToMap();
	    mapPage.microsoftRoom.click();
	    Assert.assertEquals("7:00AM", mapPage.dailyView.getText());

		
	}
	

	@Given("the user should see weekly view on all classes")
	public void the_user_should_see_weekly_view_on_all_classes() {
		 MapPage mapPage = new MapPage();
		 mapPage.goToMap();
		 mapPage.googleRoom.click();
		 Assert.assertTrue(mapPage.weeklyView.isDisplayed());
		 
		 mapPage.goToMap();
		 mapPage.appleRoom.click();
		 Assert.assertTrue(mapPage.weeklyView.isDisplayed());
		 
		 mapPage.goToMap();
		 mapPage.microsoftRoom.click();
		 Assert.assertTrue(mapPage.weeklyView.isDisplayed());		 
		
		 mapPage.goToMap();
		 mapPage.amazonRoom.click();
		 Assert.assertTrue(mapPage.weeklyView.isDisplayed());
		 
		 mapPage.goToMap();
		 mapPage.teslaRoom.click();
		 Assert.assertTrue(mapPage.weeklyView.isDisplayed());
		 
		 mapPage.goToMap();
		 mapPage.facebookRoom.click();
		 Assert.assertTrue(mapPage.weeklyView.isDisplayed());		 
		 
		 
		 
		
	}

	@Then("the user should click date box")
	public void the_user_should_click_date_box() {
		 MapPage mapPage = new MapPage();
		 mapPage.goToHunt();
	 
		
	}

	@Then("the user should see calendar")
	public void the_user_should_see_calendar() {
		HuntPage huntpage = new HuntPage();
		String actualMinDate = huntpage.clickDateBoxMin.getAttribute("min");
		
		String actualMaxDate = huntpage.clickDateBoxMax.getAttribute("max");
		LocalDate date = LocalDate.now();
		String yearExpected = date.toString().split("-")[0];
		String yearActual = actualMinDate.split("-")[0];
		Assert.assertEquals(yearExpected, yearActual);
		
		
		
		 
	  
	}



}
