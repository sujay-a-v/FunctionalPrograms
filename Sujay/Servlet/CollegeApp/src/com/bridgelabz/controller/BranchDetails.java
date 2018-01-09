package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;

import com.bridgelabz.dao.StudentDao;

/**
 * Servlet implementation class connectToAjax
 */
@WebServlet("/BranchDetails")
public class BranchDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String branch=request.getParameter("branch");
	
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		StudentDao studentDao=new StudentDao();
		JSONArray branchData = studentDao.fetchData(branch,name);
		PrintWriter out=response.getWriter();
		out.println(branchData.toString());
		out.close();
	}

}
