package com.sgtesting.hardassertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
	
	@Test(enabled = false)
	public void assertNullTesting()
	{
		try
		{
			File f1=null;
			Assert.assertNull(f1);
			System.out.println("This line will execute after execution of assertNull ");
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
			File f1=null;
			f1=new File("G:\\Example");
			Assert.assertNotNull(f1);
			System.out.println("This line will execute after execution of assertNotNull ");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
