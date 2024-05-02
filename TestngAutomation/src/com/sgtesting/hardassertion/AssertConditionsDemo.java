package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditionsDemo {
	
	@Test(enabled = false)
	public void assertTrueTesting()
	{
		try
		{
			int x=40;
			int y=35;
			Assert.assertTrue(x>=y);
			System.out.println("This line will execute after execution of assertTrue ");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertFalseTesting()
	{
		try
		{
			int x=40;
			int y=135;
			Assert.assertFalse(x>=y);
			System.out.println("This line will execute after execution of assertFalse ");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
