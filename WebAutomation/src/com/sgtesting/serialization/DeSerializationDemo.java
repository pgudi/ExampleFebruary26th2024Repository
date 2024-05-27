package com.sgtesting.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		readObjectFromFile();

	}
	
	private static void readObjectFromFile()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("G:\\Example\\Employee.ser");
			in=new ObjectInputStream(fin);
			
			obj=(Employee) in.readObject();
			
			obj.showEmployeeName("Santosh");
			obj.showDeptName("Medical");
			obj.showJobName("Doctor");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
