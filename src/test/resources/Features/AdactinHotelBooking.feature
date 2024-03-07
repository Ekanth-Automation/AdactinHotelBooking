Feature: Hotel Booking
Scenario: TC01_Booking with valid credentials 
Given user is on Adactin login application 
When user enters valid username 
And user enters valid password 
And user clicks login button 
Then user verifies the search hotel page by header validation 

When user prints all the select hotel dropdown details in the console 
And user selects location, Hotel, RoomType and Number of Rooms from dropdown list 
And user enters Check In Date and Check out Date
And user enters Adults per Room and Children per Room 
And user clickes search button 
Then user verifies the select hotel by header validation 

When user selctes the hotel
And user clicks the continue button 
Then user verifies the Book A Hotel page by header validation 

When user prints all the Book A Hotel page details in the console 
And user enters First Name, Last Name, Billing Address and Credit Card Number 
And user Selects Credit Card Type, Expiry Month and Expiry Year
And user enters cvv Number 
And user clicks Book Now button 
And user tskes screen shot of the confirmed ticket  
Then user verifies Booking confirmation page 


Scenario: TC02_Booking and Cancel Hotel Booking with valid credentials 
Given user is on Adactin login application 
When user enters valid username 
And user enters valid password 
And user clicks login button 
Then user verifies the search hotel page by header validation 

When user prints all the select hotel dropdown details in the console 
And user selects location, Hotel, RoomType and Number of Rooms from dropdown list 
And user enters Check In Date and Check out Date
And user enters Adults per Room and Children per Room 
And user clickes search button 
Then user verifies the select hotel by header validation 

When user selctes the hotel
And user clicks the continue button 
Then user verifies the Book A Hotel page by header validation 

When user prints all the Book A Hotel page details in the console 
And user enters First Name, Last Name, Billing Address and Credit Card Number 
And user Selects Credit Card Type, Expiry Month and Expiry Year
And user enters cvv Number 
And user clicks Book Now button 
And user tskes screen shot of the confirmed ticket  
Then user verifies Booking confirmation page

When user prints the Order No in the console 
And user clicks My Itineary button 
Then user verifies Booked Itinerary page 

When user enters search order Id in the search box
And user clickes on the go button 
And user clicks order Id check box of the booked Hotel
And user clickes cancel button 
And user handles the popup Alert 
And user prints the webtable of the booked ticked
And user clickes the LogOut button and logging out of the Application
Then user verifies the application is logged out sucessfully 




 

