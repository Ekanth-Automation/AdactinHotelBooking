package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class='login']")
	private WebElement tableSearch; 
	@FindBy(id="location")
	private WebElement selectLoc; 
	@FindBy(id="hotels")
	private WebElement hotelName; 
	@FindBy(id="room_type")
	private WebElement roomType; 
	@FindBy(id="room_nos")
	private WebElement roomNos; 
	@FindBy(id="datepick_in")
	private WebElement checkIn; 
	@FindBy(id="datepick_out")
	private WebElement checkOut; 
	@FindBy(id="adult_room")
	private WebElement adult; 
	@FindBy(id="child_room")
	private WebElement children; 
	@FindBy(name="Submit")
	private WebElement searchBtn; 
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selectHotelheader;
	
	public WebElement getTableSearch() {
		return tableSearch;
	}
	public WebElement getSelectLoc() {
		return selectLoc;
	}
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getSelectHotelheader() {
		return selectHotelheader;
	} 


}
