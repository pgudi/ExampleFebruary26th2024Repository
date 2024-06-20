package com.sgtesting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ReadDataFromDatabaseUsingPreparedStatementDemo {

	public static void main(String[] args) {
	//	readData();
		insertData();
	}
	
	private static void readData()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			System.out.println("Database connected successfully!!!");
			
			String query="select * from dept";
			PreparedStatement stmt=conn.prepareStatement(query);
			
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsdata=rs.getMetaData();
			String column1=rsdata.getColumnLabel(1);
			String column2=rsdata.getColumnLabel(2);
			String column3=rsdata.getColumnLabel(3);
			System.out.printf("%-12s",column1);
			System.out.printf("%-12s",column2);
			System.out.printf("%-12s",column3);
			System.out.println();
			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String dname=rs.getString("DNAME");
				String place=rs.getString("LOC");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",dname);
				System.out.printf("%-12s",place);
				System.out.println();
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	private static void insertData()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			System.out.println("Database connected successfully!!!");
			
			String query="insert into dept values(60,'BANKING','MYSORE')";
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate(query);
		
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
