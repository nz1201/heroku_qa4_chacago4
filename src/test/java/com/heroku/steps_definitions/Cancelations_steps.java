package com.heroku.steps_definitions;

import org.openqa.selenium.support.ui.Select;

import com.heroku.pages.HuntPage;
import com.heroku.pages.SchedulePage;
import com.heroku.pages.SignInPage;
import com.heroku.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Cancelations_steps {

	@Then("the user {string} {string} click cancel and message will displayed")
	public void the_user_click_cancel_and_message_will_displayed(String string, String string2) {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		BrowserUtils.waitForVisibility(signInPage.email, 3);
		signInPage.email.sendKeys(string);
		signInPage.password.sendKeys(string2);
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		BrowserUtils.waitFor(3);
		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();
		BrowserUtils.waitFor(1);
		Assert.assertTrue(schedule.cancelMessage.isDisplayed());

	}
	@Then("the user {string} {string} not click cancel and message will not displayed")
	public void the_user_not_click_cancel_and_message_will_not_displayed(String string, String string2) {
		SignInPage signInPage = new SignInPage();
		signInPage.signOut();
		BrowserUtils.waitForVisibility(signInPage.email, 3);
		signInPage.email.sendKeys(string);
		signInPage.password.sendKeys(string2);
		signInPage.signInButton.click();
		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();
		if(schedule.checkRoom.isDisplayed()) {
		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		try {
			schedule.cancelSchedule.click();
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		BrowserUtils.waitFor(1);
		try {
			schedule.cancelMessage.click();
			Assert.assertTrue(false);
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		
		}
	}
}