package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualDemo {
	public static SoftAssert soft=null;
	@Test(enabled = false)
	public void assertEqualsTesting()
	{
		try
		{
			soft=new SoftAssert();
			String s1="JavaScripting";
			String s2="JavaScripting";
			soft.assertEquals(s1, s2);
			System.out.println("This line will execute after execution of assertEquals ");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotEqualsTesting()
	{
		try
		{
			soft=new SoftAssert();
			String s1="JavaScripting";
			String s2="JavaScriptingNew";
			soft.assertNotEquals(s1, s2);
			System.out.println("This line will execute after execution of assertNotEquals ");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
