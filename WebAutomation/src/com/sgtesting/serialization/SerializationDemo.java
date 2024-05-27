package com.sgtesting.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		writeObjectToFile();

	}
	
	private static void writeObjectToFile()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee obj=null;
		try
		{
			fout=new FileOutputStream("G:\\Example\\Employee.ser");
			out=new ObjectOutputStream(fout);
			
			obj=new Employee();
			
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
