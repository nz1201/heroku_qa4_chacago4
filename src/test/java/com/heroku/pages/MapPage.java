package com.heroku.pages;

import java.util.ArrayList;
import java.util.List;

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
	
	@FindBy(xpath="(//div[@class='navbar-end']/a)[1]")
	public WebElement mapModule;
	
	@FindBy(xpath="(//div[@class='navbar-end']/a)[2]")
	public WebElement scheduleModule;
	
	@FindBy(xpath="(//div[@class='navbar-end']/a)[3]")
	public WebElement huntModule;
	
	@FindBy(xpath="//a[@class='navbar-link']")
	public WebElement myModule;
	
	
	
	
	
	
}
