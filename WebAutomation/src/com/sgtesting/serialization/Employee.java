package com.sgtesting.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;

	public void showEmployeeName(String name)
	{
		System.out.println("Employee Name :"+name);
	}

	public void showJobName(String name)
	{
		System.out.println("The job of the Employee :"+name);
	}
	
	public void showDeptName(String name)
	{
		System.out.println("Name of the department :"+name);
	}
}
