package com.bridgelabz.programs;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteCookies
 */
//@WebServlet("/DELETECOOKIE")
public class DELETECOOKIE extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookie=null;
		Cookie[] cookies=null;
		
		cookies=request.getCookies();
		
		PrintWriter printWriter=response.getWriter();
		response.setContentType("text/html");
		
		String title="Delete cookie";	
		
		String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
        
	      printWriter.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n" +
	         "<body bgcolor = \"#f0f0f0\">\n" );
	         
	      if( cookies != null ) {
	         printWriter.println("<h2> Cookies Name and Value</h2>");

	         for (int i = 0; i < cookies.length; i++) {
	            cookie = cookies[i];

	            if((cookie.getName()).compareTo("fname") == 0 ) {
	               cookie.setMaxAge(0);
	               response.addCookie(cookie);
	              printWriter.print("Deleted cookie : " + cookie.getName( ) + "<br/>");
	            }
	            printWriter.print("Name : " + cookie.getName( ) + ",  ");
	            printWriter.print("Value: " + cookie.getValue( )+" <br/>");
	         }
	      } else {
	         printWriter.println("<h2>No cookies founds</h2>");
	      }
	      printWriter.println("</body>");
	      printWriter.println("</html>");
	}


}