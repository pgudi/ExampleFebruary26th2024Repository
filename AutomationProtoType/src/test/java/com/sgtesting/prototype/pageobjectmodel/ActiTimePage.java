package com.sgtesting.prototype.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Login Page UserName text field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Login Page Password text field
	private WebElement pwd;
	public WebElement getPasword()
	{
		return pwd;
	}
	
	//Login Page Login  button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLoginButton;
	public WebElement getLoginButton()
	{
		return oLoginButton;
	}
	
	// Home Page Flyout Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Home Page Logout Link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
}
