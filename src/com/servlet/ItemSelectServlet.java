package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;

import com.been.ItemBeen;




public class ItemSelectServlet extends HttpServlet
{
    public void doPost(HttpServletRequest rq, HttpServletResponse rs) throws HTTPException,IOException
    {
       int a=Integer.parseInt(rq.getParameter("tic"));
       int i=0;
       int j=0;
       ArrayList ar=new ArrayList();
       
       for(i=0;i<a;i++)
       {
    	   String cb=rq.getParameter("cb"+i);
    	   if(cb!=null)
    	   {
    		   String ina=rq.getParameter("in"+i);
    		   String ipr=rq.getParameter("ip"+i);
    		   String ids=rq.getParameter("id"+i);
    		   String ico=rq.getParameter("ic"+i);
    		   String ima=rq.getParameter("im"+i);
    		   String iq=rq.getParameter("s"+i);
    		   
    		   
    		   ItemBeen ib=new ItemBeen();
    		   ib.setItem(ina);
    		   ib.setPrice(ipr);
    		   ib.setDsize(ids);
    		   ib.setColor(ico);
    		   ib.setImage(ima);
    		  ib.setQuantity(iq);
    		   
    		   ar.add(ib);
    		   
    	   }
       }
    		   
    		   if(ar.size()>0)
    		   {
    			   HttpSession hs=rq.getSession();
    			   hs.setAttribute("info", ar);
    			   rs.sendRedirect(rq.getContextPath()+"/html/print_confirm.jsp");
    		   }
 
    	   }
       

    }

      


