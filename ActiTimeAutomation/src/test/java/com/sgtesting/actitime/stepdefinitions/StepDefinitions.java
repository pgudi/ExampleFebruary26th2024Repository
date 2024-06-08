package com.sgtesting.actitime.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sgtesting.actitime.pom.ActiTimePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public Logger log=LogManager.getLogger("BDD Automation");
	/**
	 * Author:
	 * Step Name:I launch chrome Browser
	 */
	@Given("^I launch chrome Browser$")
	public void I_launch_chrome_Browser()
	{
		log.info("Execution of method  I_launch_chrome_Browser has started here..");
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_launch_chrome_Browser, Exception :"+e);
		}
		log.info("Execution of method  I_launch_chrome_Browser has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I navigate url of the application
	 */
	@And("^I navigate url of the application$")
	public void I_navigate_url_of_the_application()
	{
		log.info("Execution of method  I_navigate_url_of_the_application has started here..");
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_launch_chrome_Browser, Exception :"+e);
		}
		log.info("Execution of method  I_navigate_url_of_the_application has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I enter username in username text field
	 */
	@When("^I enter username in username text field$")
	public void I_enter_username_in_username_text_field()
	{
		log.info("Execution of method  I_enter_username_in_username_text_field has started here..");
		try
		{
			oPage.getUserName().sendKeys("admin");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_username_in_username_text_field, Exception :"+e);
		}
		log.info("Execution of method  I_enter_username_in_username_text_field has ended here..");
	}

	/**
	 * Author:
	 * Step Name:I enter password in password text field
	 */
	@And("^I enter password in password text field$")
	public void I_enter_password_in_password_text_field()
	{
		try
		{
			log.info("Execution of method  I_enter_password_in_password_text_field has started here..");
			oPage.getPasword().sendKeys("manager");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_password_in_password_text_field, Exception :"+e);
		}
		log.info("Execution of method  I_enter_password_in_password_text_field has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I click on login button in login page
	 */
	@And("^I click on login button in login page$")
	public void I_click_on_login_button_in_login_page()
	{
		try
		{
			log.info("Execution of method  I_click_on_login_button_in_login_page has started here..");
			oPage.getLoginButton().click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_login_button_in_login_page, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_login_button_in_login_page has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I minimize the flyout window
	 */
	@And("^I minimize the flyout window$")
	public void I_minimize_flyout_window()
	{
		try
		{
			log.info("Execution of method  I_minimize_flyout_window has started here..");
			oPage.getFlyoutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_minimize_flyout_window, Exception :"+e);
		}
		log.info("Execution of method  I_minimize_flyout_window has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I minimize the flyout window
	 */
	@Then("^I find the home page$")
	public void I_find_the_home_page()
	{
		try
		{
			log.info("Execution of method  I_find_the_home_page has started here..");
			WebElement oEle=oPage.getEnterTimeTrack();
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_find_the_home_page, Exception :"+e);
		}
		log.info("Execution of method  I_find_the_home_page has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I click on logout link
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
	{
		try
		{
			log.info("Execution of method  I_click_on_logout_link has started here..");
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_logout_link, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_logout_link has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I find the login page
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		String actual,expected;
		try
		{
			log.info("Execution of method  I_find_the_login_page has started here..");
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_find_the_login_page, Exception :"+e);
		}
		log.info("Execution of method  I_find_the_login_page has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name:I close chrome browser
	 */
	@And("^I close chrome browser$")
	public void I_close_chrome_browser()
	{
		try
		{
			log.info("Execution of method  I_close_chrome_browser has started here..");
			oBrowser.quit();
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_close_chrome_browser, Exception :"+e);
		}
		log.info("Execution of method  I_close_chrome_browser has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I click on Users Menu
	 */
	@When("^I click on Users Menu$")
	public void I_click_on_Users_Menu()
	{
		try
		{
			log.info("Execution of method  I_click_on_Users_Menu has started here..");
			oPage.getUserMenu().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_Users_Menu, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_Users_Menu has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I click on Add Users button
	 */
	@And("^I click on Add Users button$")
	public void I_click_on_Add_Users_button()
	{
		try
		{
			log.info("Execution of method  I_click_on_Add_Users_button has started here..");
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_Add_Users_button, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_Add_Users_button has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I enter firstName in firstName text field
	 */
	@And("^I enter firstName in firstName text field$")
	public void I_enter_firstName_in_firstName_text_field()
	{
		try
		{
			log.info("Execution of method  I_enter_firstName_in_firstName_text_field has started here..");
			oPage.getUserFirstName().sendKeys("demo");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_firstName_in_firstName_text_field, Exception :"+e);
		}
		log.info("Execution of method  I_enter_firstName_in_firstName_text_field has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I enter lastName in lastName text field
	 */
	@And("^I enter lastName in lastName text field$")
	public void I_enter_lastName_in_lastName_text_field()
	{
		try
		{
			log.info("Execution of method  I_enter_lastName_in_lastName_text_field has started here..");
			oPage.getUserLastName().sendKeys("User1");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_lastName_in_lastName_text_field, Exception :"+e);
		}
		log.info("Execution of method  I_enter_lastName_in_lastName_text_field has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I enter email in email text field
	 */
	@And("^I enter email in email text field$")
	public void I_enter_email_in_email_text_field()
	{
		try
		{
			log.info("Execution of method  I_enter_email_in_email_text_field has started here..");
			oPage.getUserEmailId().sendKeys("demo@gmail.com");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_email_in_email_text_field, Exception :"+e);
		}
		log.info("Execution of method  I_enter_email_in_email_text_field has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I enter username in username text field of user page
	 */
	@And("^I enter username in username text field of user page$")
	public void I_enter_username_in_username_text_field_of_user_page()
	{
		try
		{
			log.info("Execution of method  I_enter_username_in_username_text_field_of_user_page has started here..");
			oPage.getUserName().sendKeys("DemoUser1");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_username_in_username_text_field_of_user_page, Exception :"+e);
		}
		log.info("Execution of method  I_enter_username_in_username_text_field_of_user_page has ended here..");
	}
	
	
	/**
	 * Author:
	 * Step Name: I enter password in password text field of user page
	 */
	@And("^I enter password in password text field of user page$")
	public void I_enter_password_in_password_text_field_of_user_page()
	{
		try
		{
			log.info("Execution of method  I_enter_password_in_password_text_field_of_user_page has started here..");
			oPage.getUserPassword().sendKeys("welcome1");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_password_in_password_text_field_of_user_page, Exception :"+e);
		}
		log.info("Execution of method  I_enter_password_in_password_text_field_of_user_page has ended here..");
	}
	
	
	/**
	 * Author:
	 * Step Name: I enter retype password in password text field of user page
	 */
	@And("^I enter retype password in password text field of user page$")
	public void I_enter_retype_password_in_password_text_field_of_user_page()
	{
		try
		{
			log.info("Execution of method  I_enter_retype_password_in_password_text_field_of_user_page has started here..");
			oPage.getUserRetypePassword().sendKeys("welcome1");
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_enter_retype_password_in_password_text_field_of_user_page, Exception :"+e);
		}
		log.info("Execution of method  I_enter_retype_password_in_password_text_field_of_user_page has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I click on create user button
	 */
	@And("^I click on create user button$")
	public void I_click_on_create_user_button()
	{
		try
		{
			log.info("Execution of method  I_click_on_create_user_button has started here..");
			oPage.getCreateUserButton().click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_create_user_button, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_create_user_button has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I find the UserList page
	 */
	@And("^I find the UserList page$")
	public void I_find_the_UserList_page()
	{
		String expected, actual;
		try
		{
			log.info("Execution of method  I_find_the_UserList_page has started here..");
			expected="actiTIME - User List";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_find_the_UserList_page, Exception :"+e);
		}
		log.info("Execution of method  I_find_the_UserList_page has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I click on existing user in the user list page
	 */
	@When("^I click on existing user in the user list page$")
	public void I_click_on_existing_user_in_the_user_list_page()
	{
		String expected, actual;
		try
		{
			log.info("Execution of method  I_click_on_existing_user_in_the_user_list_page has started here..");
			oPage.getExistingUser().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_existing_user_in_the_user_list_page, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_existing_user_in_the_user_list_page has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I click on delete button
	 */
	@When("^I click on delete button$")
	public void I_click_on_delete_button()
	{
		try
		{
			log.info("Execution of method  I_click_on_delete_button has started here..");
			oPage.getDeleteExistingUser().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_delete_button, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_delete_button has ended here..");
	}
	
	/**
	 * Author:
	 * Step Name: I click on ok button in the alert window
	 */
	@When("^I click on ok button in the alert window$")
	public void I_click_on_ok_button_in_the_alert_window()
	{
		try
		{
			log.info("Execution of method  I_click_on_ok_button_in_the_alert_window has started here..");
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			Thread.sleep(2000);
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			log.error("There is an exception araised during the execution of Method I_click_on_ok_button_in_the_alert_window, Exception :"+e);
		}
		log.info("Execution of method  I_click_on_ok_button_in_the_alert_window has ended here..");
	}
}
