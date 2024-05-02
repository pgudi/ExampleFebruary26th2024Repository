package com.sgtesting.params;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "credentails")
	public void login(String user, String pwd)
	{
		System.out.println(user +" -->"+pwd);
	}
	
	@DataProvider(name = "credentails")
	public Object[][] getLoginData()
	{
		return new Object[][] {
			{"user1","welcome1"},
			{"user2","welcome2"},
			{"user3","welcome3"}
		};
	}

}
