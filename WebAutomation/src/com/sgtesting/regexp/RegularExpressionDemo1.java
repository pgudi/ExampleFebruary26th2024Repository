package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {

	public static void main(String[] args) {
	//	matchesDemo();
	//	findDemo();
	//	countOfMatch();
	//	matchedData();
	//	matchedDataWithStartAndEndIndex();
	//	replaceDemo();
		splitDemo();
	}
	
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java");
		boolean val=match.matches();
		System.out.println(val);
	}
	
	private static void findDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre jdk java jvm java");
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void countOfMatch()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre jdk java jvm java");
		int count=0;
		while(match.find())
		{
			count=count+1;
		}
		System.out.println("# of Count :"+count);
	}
	
	private static void matchedData()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre jdk java jvm java");
		
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
	
	private static void matchedDataWithStartAndEndIndex()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre jdk java jvm java");
		
		while(match.find())
		{
			System.out.println(match.group()+": Start Index :"+match.start()+"  End Index :"+match.end());
		}
	}

	private static void replaceDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre jdk java jvm java");
		String data=match.replaceAll("python");
		System.out.println(data);
	}
	
	private static void splitDemo()
	{
		Pattern pattern=Pattern.compile("[,!@#$%]");
		String s[]=pattern.split("Apple,Mango!Orange#banana$Kiwi%Grapes");
		for(String fruit:s)
		{
			System.out.println(fruit);
		}
	}
}
