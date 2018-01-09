package com.bridgelabz.programs;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberOfHits
 */
@WebServlet("/NumberOfHits")
public class NumberOfHits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int count;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		count=0;
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setIntHeader("Refresh", 5);
		//response.sendRedirect("database.html");
		
		PrintWriter printWriter=response.getWriter();
		response.setContentType("text/html");
		
		count++;
		String title="Nomber of hits ";
		String doct="";
		
		printWriter.print("<!doctype html\n");
		printWriter.print("<html>\n");
		printWriter.print("<head><title>"+title+"</title></head>\n");
		printWriter.print("<body>\n");
		printWriter.print("<h3>"+title+"</h3>\n");
		printWriter.print(count);
		printWriter.print("</body>\n");
		printWriter.print("</html>");
	
	}

}