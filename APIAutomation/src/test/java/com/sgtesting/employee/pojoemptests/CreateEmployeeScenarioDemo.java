package com.sgtesting.employee.pojoemptests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployeeScenarioDemo {
	
	private static String emp_id;
	@Test(priority = 1)
	public void createEmployee()
	{
		try
		{
			System.out.println("This Step Creates employee in the database");
			RestAssured.baseURI="http://localhost:8082/sgtest-employee/api/v1/employees";
			RequestSpecification httpRequest=RestAssured.given();
			//Json object
			Employee obj=new Employee();
			obj.setEmployeeFirstName("demo11");
			obj.setEmployeeLastName("User11");
			obj.setJobName("Senior Project Manager");
			obj.setEmailId("demo11@gss.com");
			obj.setAge(55);
			obj.setContactNumber("9010204050");
			obj.setSalary(23000);
			obj.setDepartmentName("Research");
			obj.setCityName("Kolar");
			obj.setAddress("1st Main , Service road Kolar");
			
			ObjectMapper mapper=new ObjectMapper();
			
			String employeeJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			//Headers
			httpRequest.header("Content-Type", "application/json");
			httpRequest.body(employeeJson);
			//Configure response
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
