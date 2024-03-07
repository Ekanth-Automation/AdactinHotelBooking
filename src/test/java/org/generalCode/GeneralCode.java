package org.generalCode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralCode {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://adactinhotelapp.com/index.php"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); 
		
		
	//Login Page
		driver.findElement(By.id("username")).sendKeys("ekanthIndra");
		driver.findElement(By.id("password")).sendKeys("4N6ZQR");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		
	//Search Hotel Pageheader validation
		WebElement header = driver.findElement(By.className("login_title"));
		String headerText = header.getText();

	if (header.isDisplayed()) {
			
			System.out.println("Header Valindation is Sucessful for: "+headerText);
			
		} else
		{
			System.out.println("Header Valindation is not Sucessful");

		}
		
		
	//Search Hotel Page
		
		System.out.println("=========SEARCH HOTEL DROPDOWN DETAILS==============");
		WebElement tableSearch = driver.findElement(By.xpath("//table[@class='login']"));
		List<WebElement> tHeaddingSearch = tableSearch.findElements(By.tagName("tr"));
		System.out.println("tRow"+tHeaddingSearch.size());
		for (int i = 0; i < tHeaddingSearch.size(); i++) {
			WebElement headdingSearch = tHeaddingSearch.get(i);
		List<WebElement> tdataSearch = headdingSearch.findElements(By.tagName("td"));
			for (int j = 0; j < tdataSearch.size(); j++) {
			WebElement dataSearch = tdataSearch.get(j);
			String allDataSearch = dataSearch.getText();
			System.out.print(allDataSearch);
			
		}
			System.out.println("JData"+tdataSearch.size());
		}
				
		WebElement selectLoc = driver.findElement(By.id("location"));
		Select slocation=new Select(selectLoc); 
		slocation.selectByValue("Sydney");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select selHotel=new Select(hotel); 
		selHotel.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select selRoom=new Select(room); 	
		selRoom.selectByIndex(2);
		
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select selRoomNos=new Select(roomNos); 	
		selRoomNos.selectByVisibleText("8 - Eight");
		
		driver.findElement(By.id("datepick_in")).sendKeys("5/03/2024");
		driver.findElement(By.id("datepick_out")).sendKeys("10/03/2024");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select selAdult=new Select(adult); 	
		selAdult.selectByValue("2");
		
		WebElement children = driver.findElement(By.id("child_room"));
		Select selChildren=new Select(children); 	
		selChildren.selectByValue("1");
		
		WebElement searchBtn = driver.findElement(By.name("Submit"));
		searchBtn.click();
		Thread.sleep(1000);

		
	//header validation for Select Hotel
		WebElement selectHotelheader = driver.findElement(By.xpath("//td[text()='Select Hotel ']"));
		String selectHotelheaderText = selectHotelheader.getText();
		
	if (selectHotelheader.isDisplayed()) {
			
			System.out.println("Header Valindation is Sucessful for: "+selectHotelheaderText);
			
		} else
		{
			System.out.println("Header Valindation is not Sucessful");

		}
		
		System.out.println("============================================================================================");

	//Select Hotel	
		WebElement hotelRadioBtn = driver.findElement(By.id("radiobutton_0"));
		hotelRadioBtn.click();
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(1000);
		
	//header validation for book Hotel
		WebElement bookHotelheader = driver.findElement(By.xpath("//td[text()='Book A Hotel ']"));
		String bookHotelheaderText = bookHotelheader.getText();
		if (bookHotelheader.isDisplayed()) {
			
			System.out.println("Header Valindation Sucessful for: "+bookHotelheaderText);
			
		} else
		{
			System.out.println("Header Valindation is not Sucessful");

		}
		
		
	//Book a Hotel Page
		
		System.out.println("=========BOOK HOTEL DROPDOWN DETAILS==============");
		WebElement tableBook = driver.findElement(By.xpath("//table[@class='login']"));
		List<WebElement> tHeaddingBook = tableBook.findElements(By.tagName("tr"));
		System.out.println("tRow"+tHeaddingBook.size());
		for (int i = 0; i < tHeaddingBook.size(); i++) {
			WebElement headdingBook = tHeaddingBook.get(i);
		List<WebElement> tdataBook = headdingBook.findElements(By.tagName("td"));
			for (int j = 0; j < tdataBook.size(); j++) {
			WebElement dataBook = tdataBook.get(j);
			String allDataBook = dataBook.getText();
			System.out.print(allDataBook);
			
		}
			System.out.println("JData"+tdataBook.size());
		}
		
		System.out.println("==========================================================================================");

		driver.findElement(By.id("first_name")).sendKeys("Ekantha");
		driver.findElement(By.id("last_name")).sendKeys("Lingam");
		driver.findElement(By.id("address")).sendKeys("153, C/1, Tuty");
		driver.findElement(By.id("cc_num")).sendKeys("8888555544446666");
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select selcreditCard=new Select(cardType); 	
		selcreditCard.selectByValue("AMEX");
		
		WebElement ccExpiry = driver.findElement(By.id("cc_exp_month"));
		Select selccExpiry=new Select(ccExpiry); 	
		selccExpiry.selectByVisibleText("February");
		
		WebElement ccExpiryYear = driver.findElement(By.id("cc_exp_year"));
		Select selccExpiryYear=new Select(ccExpiryYear); 	
		selccExpiryYear.selectByVisibleText("2029");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("592");
		
		WebElement bookNowBtn = driver.findElement(By.id("book_now"));
		bookNowBtn.click();
		
		Thread.sleep(3000);
		
	//header validation for Booking Confirmation Page

		WebElement bookingConfirmheader = driver.findElement(By.xpath("//td[text()='Booking Confirmation ']"));
		String bookingConfirmheaderTxt = bookingConfirmheader.getText();
		System.out.println("Header Valindation Sucessful for: "+bookingConfirmheaderTxt);
		
	//takes screenshot of order confirmation 
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("F:\\Adactin.png");
		FileUtils.copyFile(srcFile, dstFile);	
		
	//print the order id in the console 
		WebElement ordreId = driver.findElement(By.xpath("//input[@id='order_no']"));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(7000));
//		WebElement ordreId = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='order_no']")));

		JavascriptExecutor js=(JavascriptExecutor) driver; 
		Object object = js.executeScript("return arguments[0].getAttribute('value');", ordreId);
		String ordreIdText=(String) object;
		
		System.out.println();
		System.out.println("Hotel Booking Order Id: "+ordreIdText);
		System.out.println();

		
		WebElement checkBookingId = driver.findElement(By.id("my_itinerary"));
		checkBookingId.click();
		
		Thread.sleep(1500);
		
	//header validation for Booked Itinerary Page
		WebElement itinearyHeader = driver.findElement(By.xpath("//td[text()='Booked Itinerary']"));
		String itinearyHeaderText = itinearyHeader.getText();
		System.out.println("Header Valindation Sucessful for: "+itinearyHeaderText);
		
		WebElement searchOrderId = driver.findElement(By.id("order_id_text"));
		searchOrderId.sendKeys(ordreIdText);
		
		WebElement goBtn = driver.findElement(By.id("search_hotel_id"));
		goBtn.click();
		
		Thread.sleep(1500);
		
		WebElement checkBoxSelect = driver.findElement(By.xpath("//input[@name='ids[]']"));
		checkBoxSelect.click();
		
		WebElement cancelBtn = driver.findElement(By.xpath("//input[@name='cancelall']"));
		cancelBtn.click();
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(1500);
		
		WebElement table = driver.findElement(By.xpath("//table[@class='login']"));


		List<WebElement> tHeadding = table.findElements(By.tagName("tr"));
		System.out.println("tRow"+tHeadding.size());
		for (int i1 = 0; i1 < tHeadding.size(); i1++) {
			WebElement headding = tHeadding.get(i1);

		List<WebElement> tdata = headding.findElements(By.tagName("td"));
			
			for (int j = 0; j < tdata.size(); j++) {
			WebElement data = tdata.get(j);
			String allData = data.getText();
			System.out.print(allData);
			
		}
			System.out.println("JData"+tdata.size());
		}
		WebElement btnLogOut = driver.findElement(By.id("logout"));
		Thread.sleep(1000);
		btnLogOut.click();
		Thread.sleep(1000);
		
		WebElement loggedOutHeadder = driver.findElement(By.xpath("//td[text()='You have successfully logged out. ']"));
		if (loggedOutHeadder.isDisplayed()) {
			
			System.out.println("User has successfully logged out of the application");
			
		} else
		{
			System.out.println("Logout is not sucessful");

		}
		
		driver.quit();

		
	}

}
