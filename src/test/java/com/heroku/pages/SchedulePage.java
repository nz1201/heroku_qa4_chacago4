package com.heroku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class SchedulePage extends TopNavigationBar {
	
	public SchedulePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//tbody//tr)[1]//td[7]")
	public WebElement checkRoom;
	
	@FindBy(xpath = "//button")
	public WebElement cancelSchedule;
	
	
	
}
