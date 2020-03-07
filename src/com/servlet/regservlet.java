package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;


import com.been.RegBeen;
import com.dao.RegDao;

public class regservlet extends HttpServlet{
	public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws HTTPException,IOException
	{
		String a=rq.getParameter("na");
		String b=rq.getParameter("em");
		String c=rq.getParameter("rd");
		String d=rq.getParameter("date");
		String e=rq.getParameter("mo");
		String f=rq.getParameter("pw");
		String g=rq.getParameter("submit");
		
		
		
		System.out.println(d);
		
		
		RegBeen ob=new RegBeen();
		ob.setName(a);
		ob.setEmail(b);
		ob.setGender(c);
		ob.setDate(d);
		ob.setMobile(e);
		ob.setPassword(f);
		ob.setSubmit(g);
		
		
		RegDao ob1=new RegDao();
		boolean p=ob1.regdao1(ob);
		
		if (p)
			rs.sendRedirect(rq.getContextPath()+"/html/home.jsp");
		else
			rs.sendRedirect(rq.getContextPath()+"/html/New1.html");
		
		
		
		
	}

}
