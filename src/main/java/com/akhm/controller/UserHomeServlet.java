package com.akhm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserHomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(false);
		if (session!=null) {
			String emailId=(String)session.getAttribute("emailId");
			String password=(String)session.getAttribute("password");
			if(emailId!=null&&password!=null) {
				PrintWriter out=response.getWriter();
				out.println("welcome");
			}
			else {
				response.sendRedirect("userlogin.html");
			}
		}
		else {
			response.sendRedirect("userlogin.html");
		}
		
	}
}
