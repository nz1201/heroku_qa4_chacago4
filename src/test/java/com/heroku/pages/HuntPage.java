package com.heroku.pages;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class HuntPage extends TopNavigationBar {
	
	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "date")
	public WebElement dateClick;

	@FindBy(id = "timelineStart")
	public WebElement timeStart;
	
	@FindBy(id = "timelineFinish")
	public WebElement timeFinish;
	
	@FindBy(xpath = "//fa[@name='search']")
	public WebElement searchRoom;
	
	@FindBy(xpath = "//div[@class='column is-one-third']//div[@class='card-footer-item'][1]")
	public WebElement bookGoogleRoom;

	@FindBy(xpath = "//button")
	public WebElement confirmRoom;

	public String dayOfNextWeek() {
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(7);
		int dow = currentDate.getDayOfMonth();
		String dow1 = String.valueOf(dow);
		return dow1;	
	}
	
}
