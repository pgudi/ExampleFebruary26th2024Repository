package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
	
	@Test
	public void createUser()
	{
		System.out.println("The user demoUser1 has created successfully");
	}

	@Test
	public void modifyUser()
	{
		System.out.println("The user demoUser1 has modified successfully");
	}
	
	@Test
	public void deletUser()
	{
		System.out.println("The user demoUser1 has deleted successfully");
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
