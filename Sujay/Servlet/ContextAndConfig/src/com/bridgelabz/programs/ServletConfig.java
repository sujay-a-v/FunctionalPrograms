package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfig
 */
//@WebServlet("/ServletConfig")
public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletConfig() {
        // TODO Auto-generated constructor stub
    }

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
		
		PrintWriter printWriter=response.getWriter();
		String name=request.getParameter("name");
		printWriter.println("welcome  "+name);
		
		String message=getServletContext().getInitParameter("message");
		printWriter.println(message);
		
		String topic=getServletConfig().getInitParameter("topic");
		printWriter.println(topic);
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("ServletConfig2");
		//requestDispatcher.forward(request, response);
		
		//requestDispatcher.include(request, response);
		
		response.sendRedirect("ServletConfig2");
		
	}

}
