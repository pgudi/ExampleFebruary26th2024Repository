package com.sgtesting.prototype.testscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.prototype.pageobjectmodel.ActiTimePage;

public class LoginScenario {
	public static WebDriver oBrowser=null;
	public static ActiTimePage page=null;
	
	@Test(priority = 1)
	public void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			page=new ActiTimePage(oBrowser);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 2, dataProvider = "url")
	public void navigate(String url)
	{
		try
		{
			oBrowser.get(url);
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3, dataProvider = "logindata")
	public void login(String username, String password)
	{
		try
		{
			page.getUserName().sendKeys(username);
			page.getPasword().sendKeys(password);
			page.getLoginButton().click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public void minimizeFlyOutwindow()
	{
		try
		{
			page.getFlyoutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	public void logout()
	{
		try
		{
			page.getLogoutLink().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider(name = "url")
	public Object[][] getURLData()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
		
	@DataProvider(name = "logindata")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
}
