package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.been.PurBeen;



public class PurDao {
   public boolean pdao(ArrayList ar){
	   boolean u=false;
	   boolean p=false,t=false;
	  // ArrayList q=new ArrayList();
	  String s1=null,s2=null;
	  int i=0;
	  for(i=0;i<ar.size();i++)
	  {
		  PurBeen fi=(PurBeen)ar.get(i);
		  int cont=Integer.parseInt(fi.getQuantity());
		  String img=fi.getImage();
		  String b=fi.getPrice();
		  String c=fi.getColor();
		  String d=fi.getDsize();
		  String a=fi.getItem();
		 
		  
		  try {   
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
				//Class.forName(" oracle.jdbc.OracleDriver");   

				System.out.println("oshin6");   
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
				
				Statement statement = connection.createStatement();
				
				ResultSet rs=statement.executeQuery("select * from women where image='"+img+"'");
				System.out.println("oshin");
				while(rs.next())
				{
					s1=rs.getString(3);
					s2=rs.getString(6);
					
					if (s2.equals(img))
				     u=true;
				}
				statement.close();   
				connection.close();   
			} 
			catch (Exception ex) 
			{   
				System.out.println("The exception raised is:" + ex); 
				System.out.println("oshin1");
			}   
            if(u)
            {
            	int up_quan=Integer.parseInt(s1)-cont;
            	try {   
    				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
    				//Class.forName(" oracle.jdbc.OracleDriver");   

    				System.out.println("2");   
    				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
    				
    				Statement statement = connection.createStatement();
    				
    				statement.executeUpdate("update women set quantity="+up_quan+"where image='"+img+"'");
    				if(up_quan==0){
    					statement.executeUpdate("delete from women where quantity="+up_quan+" ");
    				}
    				else
    				{
    					statement.executeUpdate("update women set quantity="+up_quan+"where image='"+img+"'");
    				}
    					
    				
    				System.out.println("oshin");
    				
    				p=true;
    				
    				statement.close();   
    				connection.close();   
    			} 
    			catch (Exception ex) 
    			{   
    				System.out.println("The exception raised is:" + ex); 
    				System.out.println("oshin1");
    			}   
             }
            
            if(p)
            {
            	try {   
    				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
    				//Class.forName(" oracle.jdbc.OracleDriver");   

    				System.out.println("3");   
    				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
    				
    				Statement statement = connection.createStatement();
    				int t_price=Integer.parseInt(b)*cont;
    				statement.executeUpdate("insert into pur values('"+a+"',"+b+",'"+cont+"','"+d+"','"+c+"','"+img+"',"+t_price+")");
    				
    				t=true;
    				statement.close();   
    				connection.close();   
    			} 
    			catch (Exception ex) 
    			{   
    				System.out.println("The exception raised is:" + ex); 
    				System.out.println("oshin2");
    			}   

            }
	  }
   return t;
 }
}
