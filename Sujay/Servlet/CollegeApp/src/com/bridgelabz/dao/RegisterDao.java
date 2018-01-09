package com.bridgelabz.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.bridgelabz.model.RegisterDetails;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class RegisterDao {
	
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	String JDBC_driver = "com.mysql.jdbc.Driver";
	String DB_url = "jdbc:mysql://localhost:3306/MyCollegeApp";

	String username = "root";
	String password1 = "root";
	
	public String CollectData(RegisterDetails registerDetails)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = (Connection) DriverManager.getConnection(DB_url, username, password1);
			
			Statement statement = (Statement) ((java.sql.Connection) connection).createStatement();
			String sql="SELECT email FROM user";
	         
	         ResultSet resultSet=(ResultSet) statement.executeQuery(sql);
	         String email=registerDetails.getEmail();
	         while(resultSet.next())
	         { 
	        	 String email1=resultSet.getString("email");
	        	 if(email1.equals(email))
	        	 {
	        		 return email;
	        	 } 
	         }
			String string = "insert into user(sname,email,pswd,mob)" + "values(?,?,?,?)";
			preparedStatement = (PreparedStatement) connection.prepareStatement(string);
			preparedStatement.setString(1, registerDetails.getName());
			preparedStatement.setString(2, registerDetails.getEmail());
			preparedStatement.setString(3, registerDetails.getPassword());
			preparedStatement.setLong(4, registerDetails.getMobile());
			preparedStatement.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return null;
	}
	
	
	public String verify(String email,String password)
	{
		Statement statement=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = (Connection) DriverManager.getConnection(DB_url, username, password1);

			statement = (Statement) ((java.sql.Connection) connection).createStatement();
			String sql="SELECT * FROM user";
	         
	         ResultSet resultSet=(ResultSet) statement.executeQuery(sql);
	         
	         while(resultSet.next())
	         {
	           	 String email1=resultSet.getString("email");
	        	 String password1=resultSet.getString("pswd");
	        	 if(email1.equals(email) && password1.equals(password))
	        	 {
	        		 return (resultSet.getString("sname"));
	        	 }
	        	 
	         }
	         return "null";
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return "null";
	}


	public int verify1(String name) {
		
			Statement statement=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = (Connection) DriverManager.getConnection(DB_url, username, password1);

			statement = (Statement) ((java.sql.Connection) connection).createStatement();
			String sql="SELECT * FROM user";
	         
	         ResultSet resultSet=(ResultSet) statement.executeQuery(sql);
	         
	         while(resultSet.next())
	         {
	        	 String name1=resultSet.getString("sname");
	        	 if(name1.equals(name))
	        	 {
	        		 return (resultSet.getInt("uid"));
	        	 }
	         }
	         return 0;
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		return 0;
	}
	
	public String forgetpw(String email)
	{
		
		Statement statement=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = (Connection) DriverManager.getConnection(DB_url, username, password1);

			statement = (Statement) ((java.sql.Connection) connection).createStatement();
			String sql="SELECT * FROM user";
	         
	         ResultSet resultSet=(ResultSet) statement.executeQuery(sql);
	         
	         while(resultSet.next())
	         {
	        	 String email1=resultSet.getString("email");
	        	 if(email1.equals(email))
	        	 {
	        		 return (resultSet.getString("pswd"));
	        	 }
	         }
	         return null;
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		return null;
	}

}
