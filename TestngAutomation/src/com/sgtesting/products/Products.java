package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("The Product demoProduct1 has created successfully");
	}

	@Test
	public void modifyProduct()
	{
		System.out.println("The Product demoProduct1 has modified successfully");
	}
	
	@Test
	public void deletProduct()
	{
		System.out.println("The Product demoProduct1 has deleted successfully");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Chrome Browser and Navigate URL and Login into the Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close the Application");
		System.out.println("+++++++++++++++++++++++++++++++");
	}

}
