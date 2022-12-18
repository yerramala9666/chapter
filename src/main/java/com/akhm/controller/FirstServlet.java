package com.akhm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=getInitParameter("username");
		String password=getInitParameter("password");
		PrintWriter out=response.getWriter();
		out.println("username is"+username);
		out.println("password is"+password);
		ServletContext ctx=getServletContext();
		String myusername=ctx.getInitParameter("myusername");
		out.println("contex initialization parameter"+myusername);
	}

}
