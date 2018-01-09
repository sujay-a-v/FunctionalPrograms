package com.bridgelabz.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.StudentDao;

/**
 * Servlet implementation class DeleteRow
 */
@WebServlet("/DeleteRow")
public class DeleteRow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		int sid=Integer.parseInt(request.getParameter("sid"));
		System.out.println(sid);
		StudentDao studentDao=new StudentDao();
		studentDao.deleteStudent(sid);
	}

}
