package com.heroku.steps_definitions;


import org.junit.Assert;
import cucumber.api.java.en.Given;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import com.heroku.pages.HuntPage;
import com.heroku.pages.SchedulePage;
import com.heroku.pages.SignInPage;
import com.heroku.pages.TopNavigationBar;
import com.heroku.utilities.BrowserUtils;
import com.heroku.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;


public class Reservations_Steps {
	
	
	@Then("the user should click hunt button")
	public void the_user_should_click_hunt_button() {
	  HuntPage hunt = new HuntPage();
	  hunt.goToHunt();
		
		
	}

	@Then("the user should select available date")
	public void the_user_should_select_available_date() {
		  HuntPage hunt = new HuntPage();
		  hunt.dateClick.click();
		  hunt.dateClick.sendKeys(new HuntPage().dayOfNextWeek());
		  

	
	}

	@Then("the user should select avaliable time")
	public void the_user_should_select_avaliable_time() {
		  HuntPage hunt = new HuntPage();
		  Select select = new Select(hunt.timeStart);
		  select.selectByValue("0: Object");
		  Select select2 = new Select(hunt.timeFinish);
		  select2.selectByValue("2: Object");
		  hunt.searchRoom.click();
		
	}

	@Then("the user should select available room")
	public void the_user_should_select_available_room() {
		  HuntPage hunt = new HuntPage();
		  hunt.bookGoogleRoom.click();
		  hunt.confirmRoom.click();
		
	}

	@Then("the user should go schedule page")
	public void the_user_should_go_schedule_page() {
	 SchedulePage schedule = new SchedulePage();
	 schedule.goToSchedule();
		
		
	}

	@Then("the user check if it was reserved or not")
	public void the_user_check_if_it_was_reserved_or_not() {
		 SchedulePage schedule = new SchedulePage();
		 String expected = "conference ng-star-inserted";
		 String actual = schedule.checkRoom.getAttribute("class");
		 System.out.println(expected + actual);
		Assert.assertEquals(expected, actual);
		
	}

	@Then("the student from same group check if it was reserved or not")
	public void the_student_from_same_group_check_if_it_was_reserved_or_not() {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		signInPage.email.sendKeys("vferrieric2@state.tx.us");
		signInPage.password.sendKeys("quentinambler");
		signInPage.signInButton.click();
		 SchedulePage schedule = new SchedulePage();
		 schedule.goToSchedule();
		 String expected = "conference";
		 String actual = schedule.checkRoom.getAttribute("class");
		Assert.assertEquals(expected, actual);
		
	}

	@Then("the student from different group check if it was reserved or not")
	public void the_student_from_different_group_check_if_it_was_reserved_or_not() {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		signInPage.email.sendKeys("nguerrinbu@indiegogo.com");
		signInPage.password.sendKeys("ellenunworth");
		signInPage.signInButton.click();
		 SchedulePage schedule = new SchedulePage();
		 schedule.goToSchedule();
		 String expected = "conference ng-star-inserted";
		 String actual = schedule.checkRoom.getAttribute("class");
//		 Assert.assertEquals(expected, actual);
		
		
	}
	
	@Then("cancel reservation of end to end")
	public void cancel_reservation_of_end_to_end() {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		signInPage.email.sendKeys("abowfinc1@ning.com");
		signInPage.password.sendKeys("emeryvassar");
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();
	   
	}
	@Then("cancelation of room reservation")
	public void cancelation_of_room_reservation() {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		signInPage.email.sendKeys("abowfinc1@ning.com");
		signInPage.password.sendKeys("emeryvassar");
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();
	}

	
	
	
	

	// TeamLead reservation
	@Then("cancel of Teamlead {string} {string}")
	public void cancel_of_Teamlead(String string, String string2) {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		signInPage.email.sendKeys(string);
		signInPage.password.sendKeys(string2);
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();
		signInPage.signOut();
	}









}
