package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.been.RegBeen;
import com.dao.LogDao;
import com.dao.RegDao;

public class LogServlet extends HttpServlet {
	public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException
	{
		String a=rq.getParameter("un");
		String b=rq.getParameter("pw");
		
		if (a.equals("oshin")&& b.equals("12345"))
		   rs.sendRedirect(rq.getContextPath()+"/html/Successful.jsp");
		else{
		
		
		RegBeen ob=new RegBeen();
		ob.setName(a);
		ob.setPassword(b);
		
		
		
		LogDao ob1=new LogDao();
		ArrayList al=new ArrayList();
		al=ob1.logdao1(ob);
		
		System.out.println(al.size());
		
		if (al.size()>0)
		{ 
			HttpSession hs=rq.getSession();
			hs.setAttribute("info", al);
			rs.sendRedirect(rq.getContextPath()+"/html/print_item.jsp");  
		}	
		else
			rs.sendRedirect(rq.getContextPath()+"/html/home.jsp");
		
	
	}
	
}

}		
			
	
