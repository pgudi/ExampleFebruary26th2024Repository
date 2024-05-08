package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		handleFrmaes();
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
			oBrowser.get("file:///G:/GitQARepository/CurrentWorkSpace/ExampleFebruary26th2024Repository/WebAutomation/frames/FramesDemo.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void handleFrmaes()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("//form[@id='frm1']/input[1]")).sendKeys("DemoUser1");
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("firstpage");
			oBrowser.findElement(By.linkText("S G Software Testing")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oFrame=oBrowser.findElement(By.id("thirdpage"));
			oBrowser.switchTo().frame(oFrame);
			WebElement oDropDown=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oDropDown);
			oSelect.selectByIndex(1);
			Thread.sleep(2000);
			oSelect.selectByValue("rc");
			Thread.sleep(2000);
			oSelect.selectByVisibleText("Selenium WebDriver");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
