package com.sgtesting.calculator.sourcecode;

public class Calculator {
	
	/**
	 * Addition Functionality
	 */
	public int addition(int firstNum,int secondNum)
	{
		int result=0;
		try
		{
			result=firstNum+secondNum;
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Addition Functionality
	 */
	public int addition(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result+numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * Subtraction Functionality
	 */
	public int Subtraction(int firstNum,int secondNum)
	{
		int result=0;
		try
		{
			result=firstNum-secondNum;
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Multiplication Functionality
	 */
	public int multiplication(int firstNum,int secondNum)
	{
		int result=0;
		try
		{
			result=firstNum*secondNum;
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Multiplication Functionality
	 */
	public int multiplication(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=(result*numbers[i]);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * Multiplication Functionality
	 */
	public int division(int firstNum,int secondNum)
	{
		int result=0;
		try
		{
			result=(firstNum/secondNum);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
}
