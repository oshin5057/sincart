package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.been.PurBeen;
import com.dao.PurDao;



public class PurServlet extends HttpServlet{
	public void doPost(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException{
		int a1=Integer.parseInt(rq.getParameter("tic"));
		int i=0;
		int j=0;
		ArrayList ar=new ArrayList();
		
		for(i=0;i<a1;i++)
		{
			
				String in=rq.getParameter("in"+i);
				String ip=rq.getParameter("ip"+i);
				String iq=rq.getParameter("iq"+i);
				String id=rq.getParameter("id"+i);
				String ic=rq.getParameter("ic"+i);
				String im=rq.getParameter("im"+i);
				//String g=rq.getParameter("g"+i);
				
				
				
				PurBeen ob=new PurBeen();
				System.out.println("ooooo"+ip+in+iq+ic+im);
				ob.setItem(in);
				ob.setPrice(ip);
				ob.setColor(ic);
				ob.setDsize(id);
				ob.setQuantity(iq);
				ob.setImage(im);
				//ob.setTotal(g);
				
				System.out.println("o");
				ar.add(ob);
				
			
		}
	     PurDao ob1=new PurDao();
	     boolean t=ob1.pdao(ar);
	     System.out.println("kumari");
	     System.out.println(ar.size());
	     if(t)
	     {
	    	 rs.sendRedirect(rq.getContextPath()+"/html/final.jsp");
	     }
	     
	     else{
	    	 rs.sendRedirect(rq.getContextPath()+"/html/unsucc.jsp");
	     }
	  
	
	
	}
	

}
