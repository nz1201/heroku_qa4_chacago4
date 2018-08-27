package com.heroku.steps_definitions;

import org.openqa.selenium.support.ui.Select;

import com.heroku.pages.HuntPage;
import com.heroku.pages.SchedulePage;
import com.heroku.pages.SignInPage;
import com.heroku.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Cancelations_steps {

	@Then("the user click cancel and message will displayed")
	public void the_user_click_cancel_and_message_will_displayed() throws Exception {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		BrowserUtils.waitForVisibility(signInPage.email, 3);
		signInPage.email.sendKeys("htwinbrowb4@blogspot.com");
		signInPage.password.sendKeys("kanyabang");
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();
		BrowserUtils.waitFor(1);
		Assert.assertTrue(schedule.cancelMessage.isDisplayed());


//		//button[.='cancel conference']
		
		
	}
}