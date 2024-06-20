package com.sgtesting.employee.pojotests;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentObjectToJsonObject {

	public static void main(String[] args) {
		jsonObject();	
		System.out.println("----------------------");
		arrayOfJsonObject();
	}
	
	private static void jsonObject()
	{
		try
		{
			Student obj=new Student("Santosh","General Studies");
			
			ObjectMapper mapper=new ObjectMapper();
			
			String studentJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			System.out.println(studentJson);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void arrayOfJsonObject()
	{
		try
		{
			Student[] obj= {
					new Student("Santosh","General Studies"),
					new Student("Manoj","Mechanical"),
					new Student("Vijay","Civil")
			};
			
			ObjectMapper mapper=new ObjectMapper();
			
			String studentJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			System.out.println(studentJson);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
