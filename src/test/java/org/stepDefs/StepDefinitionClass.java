package org.stepDefs;

import java.io.IOException;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.BookHotelPage;
import org.pages.BookingConfirmationPage;
import org.pages.ItinearyPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass{
	
	public static WebDriver driver;
	LoginPage lp;
	SearchHotelPage searchpg; 
	SelectHotel slectHotel; 
	BookHotelPage bookpg;
	BookingConfirmationPage confirmpg;
	ItinearyPage itrpg; 
	public static String orderIdText;
	
	
	
	@Given("user is on Adactin login application")
	public void user_is_on_Adactin_login_application() {
		

		
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		
		lp=new LoginPage(); 
		WebElement txtUser = lp.getTxtUser();
		sendKeysByBase(txtUser, "ekanthIndra");
	    
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		
		lp=new LoginPage(); 
		sendKeysByBase(lp.getTxtPass(), "4N6ZQR");
	    
	}

	@When("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		lp=new LoginPage(); 
		lp.getBtnLogin().click();
		Thread.sleep(1000);

	}

	@Then("user verifies the search hotel page by header validation")
	public void user_verifies_the_search_hotel_page_by_header_validation() {
	  
		lp=new LoginPage(); 
		headerValidation(lp.getHeaderValidation());
	}

	@When("user prints all the select hotel dropdown details in the console")
	public void user_prints_all_the_select_hotel_dropdown_details_in_the_console() {
		searchpg=new SearchHotelPage(); 
		webTableData(searchpg.getTableSearch());
		System.out.println("============================================================================");
		
	}

	@When("user selects location, Hotel, RoomType and Number of Rooms from dropdown list")
	public void user_selects_location_Hotel_RoomType_and_Number_of_Rooms_from_dropdown_list() {
		searchpg=new SearchHotelPage(); 
		selectByBase(searchpg.getSelectLoc()).selectByValue("Sydney");
		selectByBase(searchpg.getHotelName()).selectByValue("Hotel Sunshine");
		selectByBase(searchpg.getRoomType()).selectByIndex(2);
		selectByBase(searchpg.getRoomNos()).selectByVisibleText("8 - Eight");	
	}

	@When("user enters Check In Date and Check out Date")
	public void user_enters_Check_In_Date_and_Check_out_Date() {
		searchpg=new SearchHotelPage(); 
		sendKeysByBase(searchpg.getCheckIn(), "10/03/2024");
		sendKeysByBase(searchpg.getCheckOut(), "15/03/2024");

	}

	@When("user enters Adults per Room and Children per Room")
	public void user_enters_Adults_per_Room_and_Children_per_Room() {
		searchpg=new SearchHotelPage(); 
		selectByBase(searchpg.getAdult()).selectByValue("2");
		selectByBase(searchpg.getChildren()).selectByValue("2");
	   
	}

	@When("user clickes search button")
	public void user_clickes_search_button() throws InterruptedException {
		searchpg=new SearchHotelPage(); 
		searchpg.getSearchBtn().click();
		Thread.sleep(1500);
	    
	}

	@Then("user verifies the select hotel by header validation")
	public void user_verifies_the_select_hotel_by_header_validation() {
		searchpg=new SearchHotelPage(); 
		headerValidation(searchpg.getSelectHotelheader());
		
	   
	}

	@When("user selctes the hotel")
	public void user_selctes_the_hotel() {
		slectHotel=new SelectHotel();
		slectHotel.getHotelRadioBtn().click();
	   
	}

	@When("user clicks the continue button")
	public void user_clicks_the_continue_button() throws InterruptedException {
		slectHotel=new SelectHotel();
		slectHotel.getContinueBtn().click();
		Thread.sleep(1500);

	    
	}

	@Then("user verifies the Book A Hotel page by header validation")
	public void user_verifies_the_Book_A_Hotel_page_by_header_validation() {
		slectHotel=new SelectHotel();
		headerValidation(slectHotel.getBookHotelheader());
	   
	}

	@When("user prints all the Book A Hotel page details in the console")
	public void user_prints_all_the_Book_A_Hotel_page_details_in_the_console() {
		bookpg = new BookHotelPage();
		webTableData(bookpg.getTableBook());
		
	   
	}

	@When("user enters First Name, Last Name, Billing Address and Credit Card Number")
	public void user_enters_First_Name_Last_Name_Billing_Address_and_Credit_Card_Number() {
		bookpg = new BookHotelPage();
		sendKeysByBase(bookpg.getfName(), "Adona");
		sendKeysByBase(bookpg.getlName(), "Irene");
		sendKeysByBase(bookpg.getTxtAddress(), "415/c1, 5th Aveanue, Anna Nager, Chennai-600003");
		sendKeysByBase(bookpg.getCcNumber(), "25871236569878521");
	}

	@When("user Selects Credit Card Type, Expiry Month and Expiry Year")
	public void user_Selects_Credit_Card_Type_Expiry_Month_and_Expiry_Year() {
		bookpg = new BookHotelPage();

		selectByBase(bookpg.getCcType()).selectByValue("AMEX");
		selectByBase(bookpg.getCcExpMonth()).selectByVisibleText("March");
		selectByBase(bookpg.getCcexpYear()).selectByVisibleText("2027");
	}

	@When("user enters cvv Number")
	public void user_enters_cvv_Number() {
		bookpg = new BookHotelPage();
		sendKeysByBase(bookpg.getCvvnum(), "546");  
	}
	@When("user clicks Book Now button")
	public void user_clicks_Book_Now_button() throws InterruptedException {
		bookpg = new BookHotelPage();
		bookpg.getBookNowBtn().click();
		Thread.sleep(4000); 
	}

	@Then("user verifies Booking confirmation page")
	public void user_verifies_Booking_confirmation_page() {
		bookpg = new BookHotelPage();

		headerValidation(bookpg.getBookingConfirmheader());
	   
	}

	@When("user tskes screen shot of the confirmed ticket")
	public void user_tskes_screen_shot_of_the_confirmed_ticket() throws IOException {
		
		takesScSt("F:\\Adactin.png");
	}	


	@When("user prints the Order No in the console")
	public void user_prints_the_Order_No_in_the_console() {
		
		confirmpg = new BookingConfirmationPage();
		 
		WebElement ordreIdNo = confirmpg.getOrdreIdNo();
		 
		orderIdText = ordreIdNo.getAttribute("value");
		 
		System.out.println();
		System.out.println("Hotel Booking Order Id: "+orderIdText);
		System.out.println();	
	    
	}

	@When("user clicks My Itineary button")
	public void user_clicks_My_Itineary_button() throws InterruptedException {
		 confirmpg = new BookingConfirmationPage();
		 confirmpg.getCheckBookingId().click();
		 Thread.sleep(1000);
	
	}
	
	@Then("user verifies Booked Itinerary page")
	public void user_verifies_Booked_Itinerary_page() {
		 confirmpg = new BookingConfirmationPage();
		 headerValidation(confirmpg.getItinearyHeader());

	}

	@When("user enters search order Id in the search box")
	public void user_enters_search_order_Id_in_the_search_box() {
		
		itrpg=new ItinearyPage();
		 
		WebElement searchOrderId = itrpg.getSearchOrderId();
		searchOrderId.sendKeys(orderIdText);

	}

	@When("user clickes on the go button")
	public void user_clickes_on_the_go_button() throws InterruptedException {
		
		itrpg=new ItinearyPage();
		itrpg.getGoBtn().click();
		Thread.sleep(1000);


	}

	@When("user clicks order Id check box of the booked Hotel")
	public void user_clicks_order_Id_check_box_of_the_booked_Hotel() {
		itrpg=new ItinearyPage();
		itrpg.getCheckBoxSelect().click();
	}

	@When("user clickes cancel button")
	public void user_clickes_cancel_button() {
		itrpg=new ItinearyPage();
		itrpg.getCancelBtn().click();

	}

	@When("user handles the popup Alert")
	public void user_handles_the_popup_Alert() {
		
		alsertByBase().accept();
	    
	}

	@When("user prints the webtable of the booked ticked")
	public void user_prints_the_webtable_of_the_booked_ticked() {
		itrpg=new ItinearyPage();
		webTableData(itrpg.getTable());
		System.out.println();

	   
	}

	@When("user clickes the LogOut button and logging out of the Application")
	public void user_clickes_the_LogOut_button_and_logging_out_of_the_Application() {
		itrpg=new ItinearyPage();
		itrpg.getBtnLogOut().click();

	}

	@Then("user verifies the application is logged out sucessfully")
	public void user_verifies_the_application_is_logged_out_sucessfully() {
		itrpg=new ItinearyPage();
		System.out.println();
		headerValidation(itrpg.getLoggedOutHeadder());

	}



}
