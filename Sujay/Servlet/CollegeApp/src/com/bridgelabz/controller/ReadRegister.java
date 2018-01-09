package com.bridgelabz.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.RegisterDao;
import com.bridgelabz.model.RegisterDetails;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Read
 */
@WebServlet("/Read")
public class ReadRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cnfmpw = request.getParameter("confirmpassword");
		long mobile =Long.parseLong(request.getParameter("mob"));
		
		if(!Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.com$", email))
		{
			HttpSession session=request.getSession();
			session.setAttribute("error", "Wrong email pattern");
			response.sendRedirect("Register.jsp");	
		}
		
		else
		{
			
			RegisterDetails registerDetail=new RegisterDetails();
			registerDetail.setName(name);
			registerDetail.setEmail(email);
			registerDetail.setPassword(password);
			registerDetail.setMobile(mobile);
			
			
			RegisterDao registerDao=new RegisterDao();
			String name1=registerDao.CollectData(registerDetail);
			if(name1!=null)
			{
				PrintWriter printWriter=response.getWriter();
				printWriter.println("<b>You are already registered <b><hr>");
				request.getRequestDispatcher("Register.jsp").include(request, response);
				printWriter.close();
			}
			else
			{
				response.sendRedirect("Signin.jsp");
			}
			
		}
		
	}

}