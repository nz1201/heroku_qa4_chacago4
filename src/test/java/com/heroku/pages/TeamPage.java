package com.heroku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class TeamPage extends TopNavigationBar{
	
	public TeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath="//h2[@class='subtitle']")
	public WebElement teamName;
}
