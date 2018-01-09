package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.dao.StudentDao;

/**
 * Servlet implementation class EditRow
 */
@WebServlet("/EditRow")
public class EditRow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sid=Integer.parseInt(request.getParameter("sid"));
		StudentDao studentDao=new StudentDao();
		JSONObject editData=studentDao.editStudent(sid);
		PrintWriter printWriter=response.getWriter();
		printWriter.println(editData.toString());
		printWriter.close();
		
	}

}
