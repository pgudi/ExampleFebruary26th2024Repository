package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginLogoutEdge {
	public static WebDriver ebrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		logout(); 
		close();
	}
	private static void launch() 
	{
		try {
			ebrowser=new EdgeDriver();
			ebrowser.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			ebrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			ebrowser.findElement(By.id("username")).sendKeys("admin");
			ebrowser.findElement(By.name("pwd")).sendKeys("manager");
			ebrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			ebrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void logout() 
	{
		try {
			ebrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try {
			ebrowser.quit();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
