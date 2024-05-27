package com.sgtesting.interfacedemo;
interface Department
{
	default void showName(String name)
	{
		System.out.println("The Department Name :"+name);
	}
}

interface Insurance
{
	default void showName(String name)
	{
		System.out.println("The Insurance Name :"+name);
	}
}

class Employee implements Department, Insurance
{

	@Override
	public void showName(String name) {
		System.out.println("The name of the organization is :"+name);
	}
	
}
public class InterfaceDemo3 {
	public static void main(String[] args) {
		Employee o=new Employee();
		o.showName("Software Company");
	}

}
