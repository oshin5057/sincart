package com.servlet;

public class DateFormate {
	int a;
	public String createdate (String s)
	{
		String s1=s.substring(0,2);
		String s2=s.substring(3,5);
		s1=s1+"-";
		
		if(s2.equals("01"))
		  s1=s1+"Jan";
		 
		  else if(s2.equals("02"))
		  s1=s1+"Feb";
		  
		  else if(s2.equals("03"))
		  s1=s1+"Mar";
		  
		  else if(s2.equals("04"))
		  s1=s1+"Apr";
		  
		  else if(s2.equals("05"))
		  s1=s1+"May";
		  
		  else if(s2.equals("06"))
		  s1=s1+"Jun";
		  
		  else if(s2.equals("07"))
		  s1=s1+"Jul";
		  
		  else if(s2.equals("08"))
		  s1=s1+"Aug";
		  
		  else if(s2.equals("09"))
		  s1=s1+"Sep";
		  
		  else if(s2.equals("10"))
		  s1=s1+"oct";
		  
		  else if(s2.equals("11"))
		  s1=s1+"Nov";
		  
		  else if(s2.equals("12"))
		  s1=s1+"Dec";
		s1="-"+s1;
		System.out.println(s1);
		s1=s1+s.substring(7,10);
		return s1;
		  
	}

}


