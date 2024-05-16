package com.sgtest.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
	//	absoluteCssSelector();
	//	relativeUsingTagName();
	//	relativeUsingTagNameWithIdAttributeValue();
	//	relativeUsingIdAttributeValue();
	//	relativeUsingTagNameWithClassAttributeValue();
	//	relativeUsingClassAttributeValue();
	//	relativeUsingTagNameWithAttributeNameValueCombination();
	//	relativeUsingTagNameWithMultipleAttributeNameValueCombination();
	//	relativeUsingTagNameWithPartialMatchingAttributeValueCombination();
	//	relativeUsingTagNameWithAttributeNameCombination();
	//	relativeUsingTagNameWithAttributeNameCombination_01();
	//	relativeUsingTagNameWithAttributeNameCombination_02();
	//	relativeUsingTagNameWithAttributeNameCombination_03();
	//	relativeBasedParentElementReference();
	//	relativeBasednthChildConcept();
		relativeBasedSiblingConcept();
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
			oBrowser.navigate().to("file:///G:/GitQARepository/CurrentWorkSpace/ExampleFebruary26th2024Repository/WebAutomation/application/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteCssSelector()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 1: Identify the Element based on tagName alone
	 * Syntax: <tagName>
	 */
	private static void relativeUsingTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
	}

	/**
	 * case 2: Identify the Element based on tagName with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeUsingTagNameWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("Welcome123");
	}
	
	/**
	 * case 3: Identify the Element based on id attribute value
	 * Syntax: #<id attribute value>
	 */
	private static void relativeUsingIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("Welcome456");
	}
	
	/**
	 * case 4: Identify the Element based on tagName with clsss attribute value
	 * Syntax: <tagName>.<class attribute value>
	 */
	private static void relativeUsingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.submit1btn1")).click();
	}
	
	/**
	 * case 5: Identify the Element based on clsss attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeUsingClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".submit1btn1")).click();
	}
	
	/**
	 * case 6: Identify the Element based on tagName with attribute Name and value
	 * Syntax: <tagName>[attributeName='attributeValue']
	 */
	private static void relativeUsingTagNameWithAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	
	/**
	 * case 7: Identify the Element based on tagName with Multiple attribute Name and value
	 * Syntax: <tagName>[attributeName='attributeValue'][attributeName='attributeValue']
	 */
	private static void relativeUsingTagNameWithMultipleAttributeNameValueCombination()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][type='button']")).click();
	}
	
	/**
	 * case 8: Identify the Element based on tagName with Partial MAtching of attribute value
	 * starts-with
	 * Syntax: <tagName>[attributeName ^= 'attributeValue']
	 * contains
	 * Syntax: <tagName>[attributeName *= 'attributeValue']
	 * ends-with
	 * Syntax: <tagName>[attributeName $= 'attributeValue']
	 */
	private static void relativeUsingTagNameWithPartialMatchingAttributeValueCombination()
	{
	//	oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit']")).click();
	}
	
	/**
	 * case 9: Identify the Element based on tagName with attribute Name 
	 * Syntax: <tagName>[attributeName]
	 */
	private static void relativeUsingTagNameWithAttributeNameCombination()
	{
		// Find the number of links available in this web page
		List<WebElement> oLinks= oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links in the Web Page :"+oLinks.size());
	}
	
	private static void relativeUsingTagNameWithAttributeNameCombination_01()
	{
		// Display Link Names Which are available in this web page
		List<WebElement> oLinks= oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String name=link.getText();
			System.out.println(name);
		}
		
	}
	
	private static void relativeUsingTagNameWithAttributeNameCombination_02()
	{
		// Display Link Names Which are available in this web page
		try
		{
			List<WebElement> oLinks= oBrowser.findElements(By.cssSelector("a[href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				WebElement link=oLinks.get(i);
				String name=link.getText();
				if(name.startsWith("S G "))
				{
					link.click();
					break;
				}
			}
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void relativeUsingTagNameWithAttributeNameCombination_03()
	{
		// org.openqa.selenium.StaleElementReferenceException: 
		// stale element reference: stale element not found
		List<WebElement> oLinks= oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String name=link.getText();
			if(name.startsWith("S G"))
			{
				link.click();
			}
		}
		
	}
	
	/**
	 * case 10: Identify the Element based on Parent Element
	 * Syntax: <parentElement> > <childElement>
	 */
	private static void relativeBasedParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("#frm2 > input")).click();
	}
	
	/**
	 * case 11: Identify the Element based nth child concept
	 * Syntax: :nth-child(number)
	 */
	private static void relativeBasednthChildConcept()
	{
	//	oBrowser.findElement(By.cssSelector("#frm3 > :nth-child(3)")).sendKeys("DemoUser3");
	//	oBrowser.findElement(By.cssSelector("#frm3 > :nth-child(11)")).sendKeys("DemoUser11");
		oBrowser.findElement(By.cssSelector("#frm3 > :nth-child(1)")).sendKeys("DemoUser1");
	}
	
	/**
	 * case 12: Identify the Element based sibling approach
	 * Syntax: : <Element1> + <Element2> + <Element3>
	 */
	private static void relativeBasedSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("#frm3 > input + input + input + input")).sendKeys("DemoUser4");
	}
}
