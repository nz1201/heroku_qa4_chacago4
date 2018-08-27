package com.heroku.pages;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath = "//div[@class='field']//input")
	public WebElement clickDateBoxMin;
	
	@FindBy(xpath = "//div[@class='field']//input")
	public WebElement clickDateBoxMax;
	
	
	public String dayOfNextWeek() {
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(6);
		int month = currentDate.getMonthValue();
		int dow = currentDate.getDayOfMonth();
		String rtrn= month+""+dow;
		return rtrn;	
	}
	public int firstTimeToInt() {
	Select select2 = new Select(new HuntPage().timeStart);
	select2.selectByIndex(0);
	String first2 =select2.getFirstSelectedOption().getText();
	String numberOnly2= first2.replaceAll("[^0-9]", "");
	int a2 = Integer.parseInt(numberOnly2);
	return a2;
	}
	public int secondTimeToInt(int a) {
		Select select2 = new Select(new HuntPage().timeFinish);
		select2.selectByIndex(a);
		String first2 =select2.getFirstSelectedOption().getText();
		String numberOnly2= first2.replaceAll("[^0-9]", "");
		int a2 = Integer.parseInt(numberOnly2);
		return a2;
	}
	public String monthOfNextWeek() {
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(7);
		System.out.println(currentDate.toString());
		int month = currentDate.getMonthValue();
		return String.valueOf(month);
	}


	
		public static void main(String[] args) {
			System.out.println(new HuntPage().dayOfNextWeek());
		}
}
