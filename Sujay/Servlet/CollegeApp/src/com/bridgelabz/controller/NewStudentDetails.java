package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.StudentDao;
import com.bridgelabz.model.StudentDetails;

/**
 * Servlet implementation class newStudent
 */
@WebServlet("/newStudent")
public class NewStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("stname");
		String mobile = request.getParameter("mob");
		String email = request.getParameter("mail");
		String stream = request.getParameter("stream");
		
		HttpSession session=request.getSession();
		int id= (int) session.getAttribute("uid");
		long mob=Long.parseLong(mobile);
		
		StudentDetails studentDetail = new StudentDetails();
		
		studentDetail.setStutentName(name);
		studentDetail.setMobile(mob);
		studentDetail.setEmail(email);
		studentDetail.setId(id);
		studentDetail.setStream(stream);
		
		StudentDao studentDao=new StudentDao();
		studentDao.callectStdData(studentDetail);
		
		response.sendRedirect("homepage.jsp");
		
		
	}

}
