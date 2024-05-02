package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionsDemo {
	public static SoftAssert soft=null;
	@Test
	public void assertTrueTesting()
	{
		try
		{
			soft=new SoftAssert();
			int x=40;
			int y=35;
			soft.assertTrue(x>=y);
			System.out.println("This line will execute after execution of assertTrue ");
			soft.assertAll();
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
			soft=new SoftAssert();
			int x=40;
			int y=135;
			soft.assertFalse(x>=y);
			System.out.println("This line will execute after execution of assertFalse ");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
