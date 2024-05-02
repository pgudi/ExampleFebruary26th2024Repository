package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
	@Test(enabled = false)
	public void assertEqualsTesting()
	{
		try
		{
			String s1="JavaScripting";
			String s2="JavaScripting";
			Assert.assertEquals(s1, s2);
			System.out.println("This line will execute after execution of assertEquals ");
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
			String s1="JavaScripting1";
			String s2="JavaScripting";
			Assert.assertNotEquals(s1, s2);
			System.out.println("This line will execute after execution of assertNotEquals ");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
