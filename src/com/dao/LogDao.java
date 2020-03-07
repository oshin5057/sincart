package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.been.ItemBeen;
import com.been.RegBeen;


public class LogDao {
	public ArrayList logdao1(RegBeen lb2)
	{
		
		String a=lb2.getName();
	    String b=lb2.getPassword();
	    String s1="";
		String s2="";
		String i1="";
		String i2="";
		String i3="";
		String i4="";
		String i5="";
		String i6="";
		ArrayList al=new ArrayList();
		
	    boolean p=false;
	    try {   
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
			//Class.forName(" oracle.jdbc.OracleDriver");   

			//System.out.println("Connecting to the database...");   
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
			
			Statement statement = connection.createStatement();
			
			ResultSet rs=statement.executeQuery("select * from reg where name='"+a+"'and password='"+b+"'");
			System.out.println("oshin");
			while(rs.next())
			{
				s1=rs.getString("name");
				s2=rs.getString("password");
				
				if (s1.equals(a) && s2.equals(b))
			     p=true;
			}
			statement.close();   
			connection.close();   
		} 
		catch (Exception ex) 
		{   
			System.out.println("The exception raised is:" + ex); 
			System.out.println("oshin1");
		}   
       if (p){
    	   try {   
   			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
   			//Class.forName(" oracle.jdbc.OracleDriver");   

   			//System.out.println("Connecting to the database...");   
   			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
   			
   			Statement statement = connection.createStatement();
   			
   			ResultSet rs=statement.executeQuery("select * from women");
   			System.out.println("kumari");
   			while(rs.next())
   			{
   				i1=rs.getString("Item");
   				i2=rs.getString("Price");
   				i3=rs.getString("Quantity");
   				i4=rs.getString("Dsize");
   				i5=rs.getString("Color");
   				i6=rs.getString("Image");
   				
   				
   				ItemBeen ib=new ItemBeen();
   				ib.setItem(i1);
   				ib.setPrice(i2);
   				ib.setQuantity(i3);
   				ib.setDsize(i4);
   				ib.setColor(i5);
   				ib.setImage(i6);
   				al.add(ib);
   				
   				
   			}
   			statement.close();   
   			connection.close();   
   		} 
   		catch (Exception ex) 
   		{   
   			System.out.println("The exception raised is:" + ex); 
   	
   		}   

       }
	return al;

	}

}


