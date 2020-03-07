package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import com.been.ItemBeen;

import com.dao.ItemDao;


public class ItemServlet extends HttpServlet {
	public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws HTTPException,IOException
	{
		String a=rq.getParameter("in");
		String b=rq.getParameter("pr");
		String c=rq.getParameter("qu");
		String d=rq.getParameter("ds");
		String e=rq.getParameter("cl");
		String f=rq.getParameter("tn");
		String g=rq.getParameter("im");
		
		
		ItemBeen ob=new ItemBeen();
		ob.setItem(a);
		ob.setPrice(b);
		ob.setQuantity(c);
		ob.setDsize(d);
		ob.setColor(e);
		ob.setTable_Name(f);
		ob.setImage(g);
		
	
		
		
		ItemDao ob1=new ItemDao();
		boolean p=ob1.itemdao1(ob);
		
		if (p)
			rs.sendRedirect(rq.getContextPath()+"/html/Successful.jsp");
		else
			rs.sendRedirect(rq.getContextPath()+"/html/New1.html");
		
		
		
		
	}

}


