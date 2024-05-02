package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {
	
	@Test(enabled = false)
	public void assertSameTesting()
	{
		try
		{
			String s1="JavaScripting";
			String s2="JavaScripting";
			Assert.assertSame(s1, s2);
			System.out.println("This line will execute after execution of assertSame ");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotSameTesting()
	{
		try
		{
			String s1="JavaScripting";
			String s2="JavaScriptingNew";
			Assert.assertNotSame(s1, s2);
			System.out.println("This line will execute after execution of assertNotSame ");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
