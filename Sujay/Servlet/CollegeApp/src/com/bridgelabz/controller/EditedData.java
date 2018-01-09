package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.StudentDao;

/**
 * Servlet implementation class EditedData
 */
@WebServlet("/EditedData")
public class EditedData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sid=Integer.parseInt(request.getParameter("sid"));
		String name=request.getParameter("stname");
		String mobile=request.getParameter("mob");
		String email=request.getParameter("mail");
		String branch=request.getParameter("stream");
		
		long mob=Long.parseLong(mobile);
		StudentDao studentDao=new StudentDao();
		studentDao.editedData(sid,name,mob,email,branch);
		
	}

}
