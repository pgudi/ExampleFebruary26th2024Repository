package com.sgtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
	//	absoluteXPath();
	//	relativeXPathUsingTagNameAlone();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameValueCombination();
	//	relativeXPathUsingAttributeNameValueCombination();
	//	relativeXPathUsingAttributeValueAlone();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombination();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingOR();
		relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingAnd();
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
			oBrowser.get("file:///G:/GitQARepository/CurrentWorkSpace/ExampleFebruary26th2024Repository/WebAutomation/application/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("/html/body/div/form/input")).sendKeys("DemoUser1");
		
	}
	
	/**
	 * case 1: Identify the Element based on tagName alone
	 * Syntax:
	 *  //<tagName>
	 */
	private static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser2");
	}
	
	/**
	 * case 2: Identify the Element based on tagName alone with index
	 * Syntax:
	 *  //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser3");
	}
	
	/**
	 * case 3: Identify the Element based on tagName with attribute name and value combination
	 * Syntax:
	 *  //<tagName>[@attributeName='attributeValue]
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * case 4: Identify the Element based on attribute name and value combination alone
	 * Syntax:
	 *  //*[@attributeName='attributeValue]
	 */
	private static void relativeXPathUsingAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}


	/**
	 * case 5: Identify the Element based on attribute value alone
	 * Syntax:
	 *  //*[@*='attributeValue]
	 */
	private static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	
	/**
	 * case 6: Identify the Element based on tagName with Multiple attribute name and value combination
	 * Syntax:
	 *  //<tagName>[@attributeName='attributeValue][@attributeName='attributeValue]
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@type='button']")).click();
	}
	
	/**
	 * case 7: Identify the Element based on tagName with Multiple 
	 * attribute name and value combination using OR operator
	 * Syntax:
	 *  //<tagName>[@attributeName='attributeValue or @attributeName='attributeValue]
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingOR()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @type='button']")).click();
	}
	
	/**
	 * case 8: Identify the Element based on tagName with Multiple 
	 * attribute name and value combination using And operator
	 * Syntax:
	 *  //<tagName>[@attributeName='attributeValue and @attributeName='attributeValue]
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingAnd()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @type='button']")).click();
	}
}
