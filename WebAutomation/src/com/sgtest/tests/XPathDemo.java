package com.sgtest.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	//	relativeXPathUsingTagNameWithMultipleAttributeNameValueCombinationUsingAnd();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_01();
	//	relativeXPathUsingTagNameWithAttributeName_02();
		relativeXPathUsingTagNameWithAttributeName_03();
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
	
	/**
	 * case 9: Identify the Elements based on tagName with AttributeName
	 * syntax:
	 *  //<tagName>[@attributeName]
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		// display the count of links in a web page
		List<WebElement> olinks= oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links in the Web Page :"+olinks.size());
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_01()
	{
		// display the Name of the links in a web page
		List<WebElement> olinks= oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String name=link.getText();
			System.out.println(name);
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_02()
	{
		// display the Name of the links in a web page
		List<WebElement> olinks= oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String name=link.getText();
			if(name.equals("POI Apache")==true)
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_03()
	{
		// reproduce stale Element referece Exception
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
		List<WebElement> olinks= oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String name=link.getText();
			if(name.equals("S G Software Testing")==true)
			{
				link.click();
			}
		}
	}
	
	/**
	 * case 10: Partial Matching of Attribute Value
	 * starts-with(@attributename, attributeValue)
	 * ends-with(@attributename, attributeValue)
	 * contains(@attributename, attributeValue)
	 *  //<tagName>[starts-with(@attributename, attributeValue)]
	 *  //<tagName>[ends-with(@attributename, attributeValue)]
	 *  //<tagName>[contains(@attributename, attributeValue)]
	 */
	private static void partialMatchingOfAttributeValue()
	{
		
	}
}
