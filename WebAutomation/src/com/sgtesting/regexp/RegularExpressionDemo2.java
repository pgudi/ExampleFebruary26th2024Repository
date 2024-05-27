package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

	public static void main(String[] args) {
	//	repalceDemo1();
	//	repalceDemo2();
	//	repalceDemo3();
		extraactEachWord();
	}

	private static void repalceDemo1()
	{
		String str="Bangalore has received 125 milli meter of rain yesterday";
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		Matcher match=pattern.matcher(str);
		boolean v1=match.find();
		System.out.println(v1);
	}

	private static void repalceDemo2()
	{
		String str="Bangalore has received 125 milli meter of rain yesterday";
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		Matcher match=pattern.matcher(str);
		String v2=match.replaceAll("many");
		System.out.println(v2);
	}

	private static void repalceDemo3()
	{
		String str="Bangalore has received 125 milli meter of rain yesterday";
		Pattern pattern=Pattern.compile("[0-9]{3}");
		Matcher match=pattern.matcher(str);
		String v2=match.replaceAll("many");
		System.out.println(v2);
	}
	
	private static void extraactEachWord()
	{
		String str="The temple is 123 at the 456 top of the hill";
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
		Matcher match=pattern.matcher(str);
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
}
