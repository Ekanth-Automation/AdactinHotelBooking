package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass {
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement ordreId;
	@FindBy(id="my_itinerary")
	private WebElement checkBookingId;
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	private WebElement itinearyHeader;
	
	
	public WebElement getItinearyHeader() {
		return itinearyHeader;
	}

	public WebElement getOrdreId() {
		return ordreId;
	}
	
	public WebElement getOrdreIdNo() {
		return ordreId;
	}
	public WebElement getCheckBookingId() {
		return checkBookingId;
	}

	
//	By ordreIdNo=By.xpath("//input[@id='order_no']");
//	By checkBookingId=By.xpath("my_itinerary");
//
//	public By getCheckBookingId() {
//		return checkBookingId;
//	}
//
//	public By getOrdreIdNo() {
//		return ordreIdNo;
//	}


}
