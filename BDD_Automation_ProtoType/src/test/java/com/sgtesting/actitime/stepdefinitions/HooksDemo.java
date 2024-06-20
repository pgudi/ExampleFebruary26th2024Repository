package com.sgtesting.actitime.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo {
	
	@Before
	public void beforeEach()
	{
		System.out.println("It has connected to the Oracle Database successfully");
	}

	
	@After
	public void afterEach()
	{
		System.out.println("It has disconnected from the Oracle Database successfully");
	}
}
