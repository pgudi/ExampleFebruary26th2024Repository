package com.sgtest.tests;

public class ExecuteAutoItFile {

	public static void main(String[] args) {
		executeFile();
	}
	
	private static void executeFile()
	{
		try
		{
			String filename="G:\\GitQARepository\\CurrentWorkSpace\\AutoIT\\WriteContentAndSaveFile.exe";
	//		Runtime.getRuntime().exec(filename);
			Runtime obj=Runtime.getRuntime();
			obj.exec(filename);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
