package com.sgtesting.interfacedemo;
interface College
{
	void showCollegeName(String name);
	static void displayBranches(String branches[])
	{
		System.out.println("The available branches:");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
}
class Student implements College
{

	@Override
	public void showCollegeName(String name) {
		System.out.println("the Name of the College is "+name);
		
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Student o=new Student();
		o.showCollegeName("SLN Engineering College");
		String s[]= {"CSE","ISE","EEE","ECE"};
		College.displayBranches(s);
	}

}
