package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	
	public static SoftAssert soft=null;
	@Test
	public void assertEqualsTesting()
	{
		try
		{
			soft=new SoftAssert();
			String s1="JavaScripting";
			String s2="JavaScripting";
			soft.assertSame(s1, s2);
			System.out.println("This line will execute after execution of assertSame ");
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
			soft.assertNotSame(s1, s2);
			System.out.println("This line will execute after execution of assertNotSame ");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
