package com.heroku.pages;

import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class TeamPage extends TopNavigationBar{
	
	public TeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

}
