package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebElementDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
	}

	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigateURL()
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
	
	private static void login()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("username"));
			oEle.sendKeys("demoUser1");
			Thread.sleep(1000);
			oEle.clear();
			Thread.sleep(1000);
			oEle.sendKeys("demoUser2");
			Thread.sleep(1000);
			oEle.clear();
			Thread.sleep(1000);
			oEle.sendKeys("demoUser3");
			Thread.sleep(1000);
			oEle.clear();
			Thread.sleep(1000);
			oEle.sendKeys("demoUser123345");
			Thread.sleep(1000);
			String v1=oEle.getAttribute("value");
			System.out.println(v1);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
