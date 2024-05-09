package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class strParams1[]=new Class[1];
			strParams1[0]=String.class;
			
			Method method1=obj.getClass().getMethod("showFirstName", strParams1);
			method1.invoke(obj, new String("Santosh"));
			System.out.println("++++++++++++++++++++++");
			Class intParams1[]=new Class[1];
			intParams1[0]=Integer.TYPE;
			
			Method method2=obj.getClass().getMethod("displayAge", intParams1);
			method2.invoke(obj, 21);
			System.out.println("++++++++++++++++++++++");
			
			Class strParams2[]=new Class[2];
			strParams2[0]=String.class;
			strParams2[1]=String.class;
			
			Method method3=obj.getClass().getMethod("showDetails", strParams2);
			method3.invoke(obj, new String("Medical"), new String("RIMS Raichur"));
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
