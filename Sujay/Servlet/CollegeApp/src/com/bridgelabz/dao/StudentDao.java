package com.bridgelabz.dao;

import java.awt.List;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.RegisterDetails;
import com.bridgelabz.model.StudentDetails;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class StudentDao {
	
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	String JDBC_driver = "com.mysql.jdbc.Driver";
	static String DB_url = "jdbc:mysql://localhost:3306/MyCollegeApp";

	String username = "root";
	String password1 = "root";
	
	public void callectStdData(StudentDetails std)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(DB_url, username, password1);
			String add = "insert into Student(sname,mob,branch,email,id)" + "values(?,?,?,?,?)";
			preparedStatement = (PreparedStatement) connection.prepareStatement(add);
			preparedStatement.setString(1, std.getStutentName());
			preparedStatement.setLong(2, std.getMobile());
			preparedStatement.setString(3, std.getStream());
			preparedStatement.setString(4, std.getEmail());
			preparedStatement.setInt(5, std.getId());
			
			preparedStatement.executeUpdate();
			} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public JSONArray fetchData(String branch,String sname){	
		JSONArray jsonArray=new JSONArray();
		try
		{			
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(DB_url, username, password1);
			String query1="select uid from user where sname = ? ";
			preparedStatement=(PreparedStatement) connection.prepareStatement(query1);
			preparedStatement.setString(1, sname);
			ResultSet resultSet= (ResultSet) preparedStatement.executeQuery();
			resultSet.next();
			int id=resultSet.getInt("uid");			
			String query="select * from Student where branch=? and id=? ";
			preparedStatement=(PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, branch);
			preparedStatement.setInt(2,id);
			 resultSet= (ResultSet) preparedStatement.executeQuery();
			while(resultSet.next()){
				JSONObject object=new JSONObject();
				object.put("name",resultSet.getString("sname"));
				object.put("mob", resultSet.getLong("mob"));
				object.put("branch", resultSet.getString("branch"));
				object.put("email", resultSet.getString("email"));
				object.put("id", resultSet.getInt("id"));
				object.put("sid", resultSet.getInt("sid"));
				jsonArray.add(object);		
			}
			//System.out.println("new "+listStd);
			return jsonArray;
		}catch(Exception ex){
			System.out.println(ex);
		}
		return jsonArray;
		
	}
	
	
	public void deleteStudent(int sid) 
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(DB_url, username, password1);
			preparedStatement=(PreparedStatement) connection.prepareStatement("delete from Student where sid=?");
			preparedStatement.setInt(1, sid);
			preparedStatement.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public JSONObject editStudent(int sid)
	{
		JSONObject jobject=new JSONObject();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(DB_url, username, password1);
			String query="select * from Student where sid=?";
			preparedStatement=(PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, sid);
			ResultSet resultSet= (ResultSet) preparedStatement.executeQuery();
			while(resultSet.next()){
				jobject.put("sid", resultSet.getInt("sid"));
				jobject.put("name",resultSet.getString("sname"));
				jobject.put("mob", resultSet.getLong("mob"));
				jobject.put("branch", resultSet.getString("branch"));
				jobject.put("email", resultSet.getString("email"));
				jobject.put("id", resultSet.getInt("id"));
			
			}
			return jobject;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return jobject;
	}

	public void editedData(int sid,String sname,long mob,String email,String branch) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(DB_url, username, password1);
			
			String query1="select * from Student where sid = ? ";
			preparedStatement=(PreparedStatement) connection.prepareStatement(query1);
			preparedStatement.setInt(1, sid);
			ResultSet resultSet= (ResultSet) preparedStatement.executeQuery();
			resultSet.next();
			int id=resultSet.getInt("id");
			String sql="UPDATE Student set sname='"+sname+"',mob="+mob+",email='"+email+"',branch='"+branch+"'  where sid=?";
			preparedStatement=(PreparedStatement) connection.prepareStatement(sql);
			/*preparedStatement.setString(1, sname);
			preparedStatement.setLong(2, mob);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4,branch);
			preparedStatement.setInt(5, id);*/
			preparedStatement.setInt(1, sid);
			preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}
