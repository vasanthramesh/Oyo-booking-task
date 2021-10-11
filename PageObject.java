package org.Oyo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject extends Base {

	

	@FindBy(xpath = "//input[@id='autoComplete__home']")
	public WebElement location;

	@FindBy(xpath = "(//span[@class='d-text16 geoSuggestionsList__locationName'])[1]")
	public WebElement select;

	@FindBy(xpath = "(//span[@class='datePickerDesktop__checkInOutText'])[1]")
	public WebElement datepicker;

	@FindBy(xpath = "(//span[@class='DateRangePicker__DateLabel'])[18]")
	public WebElement chekindate;
	
	
	@FindBy(xpath="(//span[@class='DateRangePicker__DateLabel'])[21]")
	public WebElement checkoutdate;
	
	@FindBy(xpath="(//div[contains(@class,'oyo-row oyo-row')])[6]")
	public WebElement roomselection;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	public WebElement addroom;
	
	@FindBy(xpath="(//span[@class='guestRoomPickerPopUp__plus'])[2]")
	public WebElement addguests;
	
	@FindBy(xpath="//button[contains(@class,'u-textCenter searchButton')]")
	public WebElement roomsearch;
	
	@FindBy(xpath="//span[@class='dropdown__select']")
	public WebElement sortrating;
	
	@FindBy(xpath="(//li[@class='dropdown__item'])[2]")
	public WebElement guestoption;
	
	@FindBy(xpath="(//button[@class='c-1k6asfw d-greenButton'])[3]")
	public WebElement bookroom;
	
	@FindBy(xpath="//div[@name='HotelListCard-19033']")
	public WebElement scroll;
}
