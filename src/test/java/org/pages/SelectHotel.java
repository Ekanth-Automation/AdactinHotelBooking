package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement hotelRadioBtn; 
	@FindBy(id="continue")
	private WebElement continueBtn;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookHotelheader;
	
	public WebElement getHotelRadioBtn() {
		return hotelRadioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getBookHotelheader() {
		return bookHotelheader;
	}

}
