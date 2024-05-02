package com.sgtesting.params;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	@Parameters(value="uname")
	@Test
	public void createUser(String uname)
	{
		System.out.println("The user "+uname+" has created successfully");
	}

	@Parameters(value="uname")
	@Test
	public void modifyUser(String uname)
	{
		System.out.println("The user "+uname+" has modified successfully");
	}
	
	@Parameters(value="uname")
	@Test
	public void deletUser(String uname)
	{
		System.out.println("The user "+uname+" has deleted successfully");
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
