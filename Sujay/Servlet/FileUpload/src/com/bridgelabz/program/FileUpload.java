package com.bridgelabz.program;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.FileItem;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FileUpload() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printWriter= response.getWriter();
		
		String name=request.getParameter("name");
		printWriter.println(name);
		
		/*try
		{
			ServletFileUpload fileUpload=new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> files=fileUpload.parseRequest(request);
			
			for(FileItem item : files)
			{
				item.write(new File("/home/bridgeit/Sujay/Sujay/Servlet/FileUpload/" + item.getName()));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}*/
		
		printWriter.println("Successfully Uploaded");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
