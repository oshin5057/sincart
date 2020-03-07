package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.been.ItemBeen;



public class ItemDao {
	public boolean itemdao1(ItemBeen ob2)
	{
		String a=ob2.getItem();
		String b=ob2.getPrice();
	    String c=ob2.getQuantity();
		String d=ob2.getDsize();
		String e=ob2.getColor();
		String f=ob2.getTable_Name();
		String g=ob2.getImage();
		
		boolean p=false;
		
		
		try {   
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
			//Class.forName(" oracle.jdbc.OracleDriver");   

			//System.out.println("Connecting to the database...");   
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("insert into "+f+" values('" +a + "','" +b + "','"+c+"','"+d+"','"+e+"','"+g+"')");
			//statement.executeUpdate("insert into employee values('" +s1 + "','" +s2 + "','"+s3+"','"+s4+"','"+s5+"',"+a+")");   
			p=true;
			
			statement.close();   
			connection.close();   
		} 
		catch (Exception ex) 
		{   
			System.out.println("The exception raised is:" + ex);   
		}   

	return p;

	}
	}



