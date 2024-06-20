package com.sgtesting.employee.tests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployeeTestCase {
	private static String emp_id=null;
	@Test(priority = 1)
	public void createEmployee()
	{
		try
		{
			System.out.println("This testcase create Employee in the server");
			RestAssured.baseURI="http://localhost:8082/sgtest-employee/api/v1/employees";
			RequestSpecification httpRequest=RestAssured.given();
			//Create JSON File Object
			File f1=new File(".\\DataFiles\\data_createemployee.json");
			
			//configure the header
			httpRequest.header("Content-Type", "application/json");
			httpRequest.body(f1);
			
			//Execute HTTP Method
			Response response=httpRequest.post();
			//Print response
			String content=response.asPrettyString();
			System.out.println(content);
			
			//JsonPath to read each value
			JsonPath jpath=response.jsonPath();
			emp_id=jpath.getString("id");
			System.out.println("Employee id :"+emp_id);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void displayEmployee()
	{
		try
		{
			System.out.println("This testcase displays Employee from the server");
			RestAssured.baseURI="http://localhost:8082/sgtest-employee/api/v1/employees/"+emp_id;
			RequestSpecification httpRequest=RestAssured.given();
			
			//configure the header
			httpRequest.header("Content-Type", "application/json");
			
			//GET Http Method
			Response response=httpRequest.get();
			String content=response.asPrettyString();
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	@Test(priority = 3)
	public void deleteEmployee()
	{
		try
		{
			System.out.println("This testcase deletes Employee from the server");
			RestAssured.baseURI="http://localhost:8082/sgtest-employee/api/v1/employees/"+emp_id;
			RequestSpecification httpRequest=RestAssured.given();
			
			//configure the header
			httpRequest.header("Content-Type", "application/json");
			
			//DELETE Http Method
			Response response=httpRequest.delete();
			String content=response.asPrettyString();
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
