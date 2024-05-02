package com.sgtesting.softassertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	public static SoftAssert soft=null;
	@Test
	public void assertNullTesting()
	{
		try
		{
			soft=new SoftAssert();
			File f1=null;
			soft.assertNull(f1);
			System.out.println("This line will execute after execution of assertNull ");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotNullTesting()
	{
		try
		{
			soft=new SoftAssert();
			File f1=null;
			f1=new File("G:\\Example");
			soft.assertNotNull(f1);
			System.out.println("This line will execute after execution of assertNotNull ");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
