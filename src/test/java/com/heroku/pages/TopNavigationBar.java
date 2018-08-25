package com.heroku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.BrowserUtils;
import com.heroku.utilities.Driver;

public abstract class TopNavigationBar {
	public TopNavigationBar() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "map")
	public WebElement map;

	@FindBy(linkText = "schedule")
	public WebElement schedule;

	@FindBy(linkText = "hunt")
	public WebElement hunt;

	@FindBy(linkText = "my")
	public WebElement my;

	@FindBy(linkText = "self")
	public WebElement self;

	@FindBy(linkText = "team")
	public WebElement team;

	@FindBy(linkText = "sign out")
	public WebElement signOut;

	public void goToSelf() {
		Actions actions = new Actions(Driver.getDriver());
		BrowserUtils.waitFor(3);
		actions.moveToElement(my).perform();
		BrowserUtils.waitFor(3);
		self.click();
	}

	public void goToTeam() {
		Actions actions = new Actions(Driver.getDriver());
		BrowserUtils.waitFor(3);
		actions.moveToElement(my).perform();
		BrowserUtils.waitFor(3);
		team.click();
	}
	public void goToSchedule() {
		Actions actions = new Actions(Driver.getDriver());
		BrowserUtils.waitFor(3);
		actions.moveToElement(schedule).perform();
		BrowserUtils.waitFor(3);
		schedule.click();
	}
	public void goToMap() {
		Actions actions = new Actions(Driver.getDriver());
		BrowserUtils.waitFor(3);
		actions.moveToElement(map).perform();
		BrowserUtils.waitFor(3);
		map.click();
	}
	public void goToHunt() {
		Actions actions = new Actions(Driver.getDriver());
		BrowserUtils.waitFor(3);
		actions.moveToElement(hunt).perform();
		BrowserUtils.waitFor(3);
		hunt.click();
	}

	public void signOut() {
		Actions actions = new Actions(Driver.getDriver());
		BrowserUtils.waitFor(3);
		actions.moveToElement(my).perform();
		BrowserUtils.waitFor(3);
		signOut.click();
	}
}
