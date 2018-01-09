package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.RegisterDao;

/**
 * Servlet implementation class ForgetPW
 */
@WebServlet("/ForgetPW")
public class ForgetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email=request.getParameter("email");
		RegisterDao registerDao=new RegisterDao();
		String password=registerDao.forgetpw(email);
		if(password==null)
		{
			password="You are not a Registered person !!!";
		}
		PrintWriter out=response.getWriter();
		out.println(password.toString());
		out.close();
	}

}
