package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItinearyPage extends BaseClass{
	
	public ItinearyPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement searchOrderId;
	@FindBy(id="search_hotel_id")
	private WebElement goBtn;
	@FindBy(xpath="//input[@name='ids[]']")
	private WebElement checkBoxSelect;
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancelBtn;
	@FindBy(id="logout")
	private WebElement btnLogOut;
	@FindBy(xpath="//td[text()='You have successfully logged out. ']")
	private WebElement loggedOutHeadder;
	@FindBy(xpath="//table[@class='login']")
	private WebElement table;


	public WebElement getTable() {
		return table;
	}
	public WebElement getBtnLogOut() {
		return btnLogOut;
	}
	public WebElement getLoggedOutHeadder() {
		return loggedOutHeadder;
	}
	public WebElement getSearchOrderId() {
		return searchOrderId;
	}
	public WebElement getGoBtn() {
		return goBtn;
	}
	public WebElement getCheckBoxSelect() {
		return checkBoxSelect;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	

}
