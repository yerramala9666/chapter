package com.akhm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId=(String)request.getAttribute("emi");
		String password=(String)request.getAttribute("pwd");
		PrintWriter out=response.getWriter();
		out.println("emi is"+emailId);
		out.println("pwd is"+password);
		HttpSession session=request.getSession();
		String emailId2=(String)session.getAttribute("emi");	
		String password2=(String)session.getAttribute("pwd");
		out.println("session emailId is"+emailId2);
		out.println("session password is"+password2);
		ServletContext ctx=request.getServletContext();
		String emailId3=(String)ctx.getAttribute("emi");
		String password3=(String)ctx.getAttribute("pwd");
		out.println("ctx emailId is"+emailId3);
		out.println("ctx password is"+password3);
		request.removeAttribute("emi");
		request.removeAttribute("pwd");
		out.println("remove emi is"+emailId);
		out.println("remove pwd is"+password);
		session.removeAttribute("emi");
		session.removeAttribute("pwd");
		out.println("remove emailId is"+emailId2);
		out.println("remove password is"+password2);
		
	}

}
