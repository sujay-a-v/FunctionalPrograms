package com.bridgelabz.controller;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.RegisterDao;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class verifyData
 */
@WebServlet("/Verify")
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("Password");
		
		RegisterDao registerDao=new RegisterDao();
		String name=registerDao.verify(email,password);
		int uid=registerDao.verify1(name);
		if(uid!=0)
		{
			HttpSession session=request.getSession();
			session.setAttribute("uid",uid );
		}
		
		if(name!="null")
		{
			HttpSession session=request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("homepage.jsp");
		}
		else
		{
			
			HttpSession session=request.getSession();
			session.setAttribute("error", "Email or Password wrong");
			response.sendRedirect("Signin.jsp");
		}
			
	}
}
