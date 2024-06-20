package com.sgtesting.api.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo {

	@Before
	public void connectToOracleDB()
	{
		System.out.println("Connecting to the Oracle Database has performed successfully!!");
	}
	
	
	@After
	public void disConnectFromOracleDB()
	{
		System.out.println("Disconnect from the Oracle Database has performed successfully!!");
	}
}
