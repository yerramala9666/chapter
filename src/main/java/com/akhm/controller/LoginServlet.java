package com.akhm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("emailId is"+emailId);
		out.println("password is"+password);
		request.setAttribute("emi", emailId);
		request.setAttribute("pwd", password);
		//RequestDispatcher rd=request.getRequestDispatcher("/home");
		//rd.forward(request, response);
		
		HttpSession session=request.getSession();
		session.setAttribute("emi", emailId);
		session.setAttribute("pwd", password);
		ServletContext ctx=request.getServletContext();
		ctx.setAttribute("emi", emailId);
		ctx.setAttribute("pwd", password);
		response.sendRedirect("home");
		
	}
	}

