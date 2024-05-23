package com.sgtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfilesDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();

	}
	
	private static void launchBrowser()
	{
		try
		{
			/*
			ProfilesIni profile=new ProfilesIni();
			FirefoxProfile ffprofile=profile.getProfile("testing");
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(option);
			*/
			FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "www.sgtestinginstitute.com");
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(option);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
