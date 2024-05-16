package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		popupBrowsers();
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
	
	private static void popupBrowsers()
	{
		try
		{
			System.out.println("Before click on Link, # of Popups :"+getPopupsCount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(2000);
			System.out.println("After click on Link, # of Popups :"+getPopupsCount());
			if(getPopupsCount() > 0)
			{
				handlePopupBrowsers();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupsCount()
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return count;
	}
	
	private static void handlePopupBrowsers()
	{
		String parentBrowser;
		try
		{
			parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			Object[] childBrowsers=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<childBrowsers.length;i++)
			{
				String childBrowser=childBrowsers[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				String title=oBrowser.getTitle();
				System.out.println("Title :"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL :"+url);
				oBrowser.findElement(By.linkText("Try Free")).click();
				
			}
			Thread.sleep(10000);
			oBrowser.switchTo().window(parentBrowser);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
