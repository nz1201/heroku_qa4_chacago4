package com.heroku.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heroku.utilities.Driver;

public class SelfPage extends TopNavigationBar{
	
	public SelfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}

	@FindBy(xpath = "(//*[@class='title is-6'])[2]")
	public WebElement role;
	
	@FindBy(xpath = "(//*[@class='title is-6'])[1]")
	public WebElement name;

	@FindBy (xpath="(//div//p)[1]")
	public WebElement username;

}
