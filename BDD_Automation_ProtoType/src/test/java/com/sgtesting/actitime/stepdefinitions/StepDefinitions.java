package com.sgtesting.actitime.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Author:
	 * Step Name:I launch chrome Browser
	 */
	@Given("^I launch chrome Browser$")
	public void I_launch_chrome_Browser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name:I navigate url of the application
	 */
	@And("^I navigate url of the application$")
	public void I_navigate_url_of_the_application()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Step Name:I enter username in username text field
	 */
	@When("^I enter username in username text field$")
	public void I_enter_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("password")).sendKeys("welcome1");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			expected="actiTIME - User List";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.xpath("(//span[text()='User1, demo'])[1]")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
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
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			Thread.sleep(2000);
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Strp Name: I login and logout from application
	 */
	@When("^I login and logout from application$")
	public void I_login_and_logout_from_application(DataTable data)
	{
		try
		{
			List<Map<String,String>> rows=data.asMaps(String.class, String.class);
			int count=0;
			for(Map<String,String> testdata: rows)
			{
				String user1=testdata.get("username");
				String pwd1=testdata.get("password");
				oBrowser.findElement(By.id("username")).sendKeys(user1);
				oBrowser.findElement(By.name("pwd")).sendKeys(pwd1);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(5000);
				if(count==0)
				{
					oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(2000);
				}
				count=count+1;
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
