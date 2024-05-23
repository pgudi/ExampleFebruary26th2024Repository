package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		mouseOperationsOnFlipKart();
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
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void mouseOperationsOnFlipKart()
	{
		try
		{
			Actions oMouse=new Actions(oBrowser);
			
			WebElement electronics=oBrowser.findElement(By.xpath("//span[text()='Electronics']"));
			oMouse.moveToElement(electronics).build().perform();
			Thread.sleep(2000);
			
			WebElement computer=oBrowser.findElement(By.linkText("Computer Peripherals"));
			oMouse.moveToElement(computer).build().perform();
			Thread.sleep(2000);
			
			WebElement printers=oBrowser.findElement(By.linkText("Printers"));
			oMouse.moveToElement(printers).build().perform();
			Thread.sleep(2000);
			oMouse.click(printers).build().perform();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

}
