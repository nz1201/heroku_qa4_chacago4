package com.heroku.pages;

import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class SelfPage extends TopNavigationBar{
	
	public SelfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

}
