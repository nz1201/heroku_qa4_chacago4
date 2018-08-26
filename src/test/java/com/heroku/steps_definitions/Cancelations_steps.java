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
		// //td[@class='conference ng-star-inserted']

		SignInPage signInPage = new SignInPage();
		signInPage.email.sendKeys("htwinbrowb4@blogspot.com");
		signInPage.password.sendKeys("kanyabang");
		signInPage.signInButton.click();

		HuntPage hunt = new HuntPage();
		hunt.goToHunt();

		hunt.dateClick.click();
		Thread.sleep(3000);
		hunt.dateClick.sendKeys(hunt.dayOfNextWeek());
		Thread.sleep(3000);
		Select select = new Select(hunt.timeStart);
		select.selectByValue("0: Object");
		Select select2 = new Select(hunt.timeFinish);
		select2.selectByValue("2: Object");
		Thread.sleep(3000);
		hunt.searchRoom.click();
		Thread.sleep(3000);
		hunt.bookGoogleRoom.click();
		Thread.sleep(3000);
		hunt.confirmRoom.click();

		SchedulePage schedule = new SchedulePage();
		schedule.goToSchedule();

		String expected = "conference ng-star-inserted";
		String actual = schedule.checkRoom.getAttribute("class");
		System.out.println(expected + actual);
		Assert.assertEquals(expected, actual);

		schedule.checkRoom.click();
		BrowserUtils.waitFor(3);
		schedule.cancelSchedule.click();

	}

}
