package com.akhm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("emailId is"+emailId);
		out.println("password is"+password);
		if (emailId!=null&&emailId.equalsIgnoreCase("akhm@gmail.com")) {
				
				HttpSession session=request.getSession(true);
				session.setAttribute("emailId", emailId);
				session.setAttribute("password", password);
				response.sendRedirect("userhome");
			}
			else {
				response.sendRedirect("userlogin.html");
				
			}
			
	}

}
