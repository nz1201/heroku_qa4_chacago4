package com.heroku.steps_definitions;


import cucumber.api.java.en.Given;
import org.openqa.selenium.interactions.Action;
import org.junit.Assert;
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
	@Then("the user should select avaliable time for db")
	public void the_user_should_select_avaliable_time_for_db() {
		 HuntPage hunt = new HuntPage();
		  Select select = new Select(hunt.timeStart);
		  select.selectByValue("0: Object");
		  Select select2 = new Select(hunt.timeFinish);
		  select2.selectByValue("2: Object");
		  hunt.searchRoom.click();
	}

	@Then("the user should select available room teamLEad user {string} and {string}")
	public void the_user_should_select_available_room_teamLEad_user_and(String string, String string2) {
		 try { 
			  HuntPage hunt = new HuntPage();
			  hunt.bookGoogleRoom.click();
			  hunt.confirmRoom.click();
				
			} catch (Exception e) {
				SignInPage signInPage = new SignInPage();
				signInPage.signOut();
				signInPage.email.sendKeys(string);
				signInPage.password.sendKeys(string2);
				signInPage.signInButton.click();
				SchedulePage schedule = new SchedulePage();
				schedule.goToSchedule();
				BrowserUtils.waitFor(2);
				schedule.checkRoom.click();
				BrowserUtils.waitFor(2);
				schedule.cancelSchedule.click();
				BrowserUtils.waitFor(2);
				 HuntPage hunt = new HuntPage();
				 signInPage.signOut();
				 signInPage.email.sendKeys(string);
					signInPage.password.sendKeys(string2);
					signInPage.signInButton.click();
				  hunt.goToHunt();
				  hunt.dateClick.click();
				  hunt.dateClick.sendKeys(new HuntPage().dayOfNextWeek());	
				  Select select = new Select(hunt.timeStart);
				  select.selectByValue("0: Object");
				  Select select2 = new Select(hunt.timeFinish);
				  select2.selectByValue("2: Object");
				  hunt.searchRoom.click();
				  hunt.bookGoogleRoom.click();
				  hunt.confirmRoom.click();
			}
			
		}
	

	@Then("the user should select available room")
	public void the_user_should_select_available_room() {
		 try { 
		  HuntPage hunt = new HuntPage();
		  hunt.bookGoogleRoom.click();
		  hunt.confirmRoom.click();
			
		} catch (Exception e) {
			SignInPage signInPage = new SignInPage();
			signInPage.signOut();
			signInPage.email.sendKeys("teacheriljanettebaskett@gmail.com");
			signInPage.password.sendKeys("janettebaskett");
			signInPage.signInButton.click();
			SchedulePage schedule = new SchedulePage();
			schedule.goToSchedule();
			BrowserUtils.waitFor(3);
			schedule.checkRoom.click();
			BrowserUtils.waitFor(3);
			schedule.cancelSchedule.click();
			BrowserUtils.waitFor(3);
			 HuntPage hunt = new HuntPage();
			 signInPage.signOut();
				signInPage.email.sendKeys("teacheriljanettebaskett@gmail.com");
				signInPage.password.sendKeys("janettebaskett");
				signInPage.signInButton.click();
			  hunt.goToHunt();
			  hunt.dateClick.click();
			  hunt.dateClick.sendKeys(new HuntPage().dayOfNextWeek());	
			  Select select = new Select(hunt.timeStart);
			  select.selectByValue("0: Object");
			  Select select2 = new Select(hunt.timeFinish);
			  select2.selectByValue("2: Object");
			  hunt.searchRoom.click();
			  hunt.bookGoogleRoom.click();
			  hunt.confirmRoom.click();
		}
		
	}
	@Then("the user should not select available room")
	public void the_user_should_not_select_available_room() {
		HuntPage hunt = new HuntPage();
		 try {hunt.bookGoogleRoom.click();
		 BrowserUtils.waitFor(2);
		 Assert.assertTrue(false);
		} catch (Exception e) {
			Assert.assertTrue(true);
		} 
		  try {hunt.confirmRoom.click();
		  Assert.assertTrue(false);
			} catch (Exception e) {
				Assert.assertTrue(true);
			} 
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
		 BrowserUtils.waitFor(2);
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
		 BrowserUtils.waitFor(2);
		 String expected = "conference";
		 String actual = schedule.checkRoom.getAttribute("class");
		Assert.assertEquals(expected, actual);
		
	}

	@Then("the student from different group check if it was reserved or not")
	public void the_student_from_different_group_check_if_it_was_reserved_or_not() {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		signInPage.email.sendKeys("hcranfieldbx@blinklist.com");
		signInPage.password.sendKeys("belviaizzatt");
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		BrowserUtils.waitFor(3);
		try {
			schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();
		BrowserUtils.waitFor(3);
		signInPage.signOut();
			
		} catch (Exception e) {
			signInPage.signOut();
		}
		
		BrowserUtils.waitFor(2);
		signInPage.email.sendKeys("nguerrinbu@indiegogo.com");
		signInPage.password.sendKeys("ellenunworth");
		signInPage.signInButton.click();
		 schedule.goToSchedule();
		 String expected = "conference";
		 BrowserUtils.waitFor(2);
		 String actual = schedule.checkRoom.getAttribute("class");
		 Assert.assertEquals(expected, actual);
		
		
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
		BrowserUtils.waitFor(2);
		schedule.cancelSchedule.click();
		BrowserUtils.waitFor(2);
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
		BrowserUtils.waitFor(2);
		schedule.cancelSchedule.click();
		BrowserUtils.waitFor(2);
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
		BrowserUtils.waitFor(2);
		schedule.cancelSchedule.click();
		BrowserUtils.waitFor(2);
		signInPage.signOut();
	}









}
