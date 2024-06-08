package com.sgtesting.actitime.pom;

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

	//Home Page Object
	@FindBy(xpath="//td[text()='Enter Time-Track']")
	private WebElement oEnterTimeTrack;
	public WebElement getEnterTimeTrack()
	{
		return oEnterTimeTrack;
	}

	//Users Menu
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUserMenu;
	public WebElement getUserMenu()
	{
		return oUserMenu;
	}

	//Add User button
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUserBtn;;
	public WebElement getAddUserButton()
	{
		return oAddUserBtn;
	}


	//Create User Page FirstName text field
	private WebElement firstName;
	public WebElement getUserFirstName()
	{
		return firstName;
	}

	//Create User Page FirstName text field
	private WebElement lastName;
	public WebElement getUserLastName()
	{
		return lastName;
	}


	//Create User Page FirstName text field
	private WebElement email;
	public WebElement getUserEmailId()
	{
		return email;
	}


	//Create User Page FirstName text field
	private WebElement password;
	public WebElement getUserPassword()
	{
		return password;
	}

	//Create User Page FirstName text field
	private WebElement passwordCopy;
	public WebElement getUserRetypePassword()
	{
		return passwordCopy;
	}
	
	//Create User Page Create User button
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement oCreateUserButton;
	public WebElement getCreateUserButton()
	{
		return oCreateUserButton;
	}
	
	//List User Page Existing User
	@FindBy(xpath="(//span[text()='User1, demo'])[1]")
	private WebElement oExistingUser;
	public WebElement getExistingUser()
	{
		return oExistingUser;
	}
	
	//User Page Delete button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteExistingUser()
	{
		return userDataLightBox_deleteBtn;
	}
}
