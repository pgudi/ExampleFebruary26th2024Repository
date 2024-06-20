package com.sgtesting.employee.pojotests;

public class Student {
	
	private String firstName;
    private String couseName;
    
    public Student() {
    	
    }
    
	public Student(String firstName, String couseName) {
		this.firstName = firstName;
		this.couseName = couseName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCouseName() {
		return couseName;
	}
	public void setCouseName(String couseName) {
		this.couseName = couseName;
	}
    
    

}
