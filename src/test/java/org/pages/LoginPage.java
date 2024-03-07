package org.pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUser; 
	@FindBy(id="password")
	private WebElement txtPass; 
	@FindBy(id="login")
	private WebElement btnLogin; 
	@FindBy(className="login_title")
	private WebElement headerValidation;
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getHeaderValidation() {
		return headerValidation;
	} 

}
