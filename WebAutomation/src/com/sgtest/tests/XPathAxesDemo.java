package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateURL();
	//	enterSalaryForThePersonNameSachinTendular();
	//	enterSalaryForThePersonWhoIsNextToSachinTendulkar();
	//	makeStatusAsActiveForDesignationIndianFreedomFighter();
	//	makeStatusAsActiveForPersonWhoIsPreviousToRahulDravid();
	//	basedOnChildElementIdentifyTheParentElement();
	//	basedOnParentElementIdentifyTheChildElement();
		
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
			oBrowser.get("file:///G:/GitQARepository/CurrentWorkSpace/ExampleFebruary26th2024Repository/WebAutomation/application/WebTableHTML.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * following-sibling
	 * case 1: enter the salary 12000 for the person name sachin tendular
	 */
	private static void enterSalaryForThePersonNameSachinTendular()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("12000");
	}
	
	/**
	 *  following
	 *  case 2: enter teh salary 12000 for teh person who is next to Sachin Tendulkar
	 */
	private static void enterSalaryForThePersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("12000");
	}
	
	/**
	 *  preceding-sibling
	 *  case 3: Make Status as Active For Designation Indian Freedom Fighter
	 */
	private static void makeStatusAsActiveForDesignationIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	/**
	 *  preceding
	 *  case 4: Make Status as Active For Person Who is previous to Rahul Dravid
	 */
	private static void makeStatusAsActiveForPersonWhoIsPreviousToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}

	/**
	 * ancestor
	 * case 5: Based on Child Element identify the Parent Element
	 */
	private static void basedOnChildElementIdentifyTheParentElement()
	{
		String val=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println(val);
	}
	
	/**
	 * descendant
	 * case 5: Based on Parent Element identify the Child Element
	 */
	private static void basedOnParentElementIdentifyTheChildElement()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/descendant::td[6]/descendant::input")).sendKeys("12000");
	}
	
}
