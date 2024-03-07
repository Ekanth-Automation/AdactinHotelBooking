package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@class='login']")
	private WebElement tableBook;
	@FindBy(id="first_name")
	private WebElement fName;
	@FindBy(id="last_name")
	private WebElement lName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement ccNumber;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	@FindBy(id="book_now")
	private WebElement bookNowBtn;
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmheader;
	
	public WebElement getTableBook() {
		return tableBook;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getCcNumber() {
		return ccNumber;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}
	public WebElement getCcexpYear() {
		return ccexpYear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	public WebElement getBookingConfirmheader() {
		return bookingConfirmheader;
	}


	
	
	

}
