package com.heroku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class MapPage extends TopNavigationBar {
	
	public MapPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//h1")
	public WebElement iLTitile;
	
	@FindBy(xpath = "//a[@id='room-211']")
	public WebElement googleRoom;
	
	@FindBy(xpath = "//a[@id='room-212']")
	public WebElement appleRoom;
	
	@FindBy(xpath = "//a[@id='room-213']")
	public WebElement microsoftRoom;
	
	@FindBy(xpath = "//a[@id='room-215']")
	public WebElement amazonRoom;
	
	@FindBy(xpath = "//a[@id='room-216']")
	public WebElement teslaRoom;
	
	@FindBy(xpath = "//a[@id='room-217']")
	public WebElement facebookRoom;
	
	@FindBy(xpath = "//table[@class='card table is-fullwidth is-transparent borderless']")
	public WebElement weeklyView;
	
	@FindBy(xpath = "//*[contains(text(),'7:00am')]")
	public WebElement dailyView;
	
	
}
