package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.been.RegBeen;

public class RegDao {
public boolean regdao1(RegBeen ob2)
{
	String a=ob2.getName();
	String b=ob2.getEmail();
	String c=ob2.getGender();
	String d=ob2.getDate();
	String e=ob2.getMobile();
	String f=ob2.getPassword();
	boolean p=false;
	
	
	try {   
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
		//Class.forName(" oracle.jdbc.OracleDriver");   

		//System.out.println("Connecting to the database...");   
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
		
		Statement statement = connection.createStatement();
		
		statement.executeUpdate("insert into reg values('" +a + "','" +b + "','"+c+"','"+d+"','"+e+"','"+f+"')");
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


