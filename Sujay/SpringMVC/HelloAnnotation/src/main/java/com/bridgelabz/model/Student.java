package com.bridgelabz.model;

import java.sql.Date;
import java.util.ArrayList;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;


public class Student {
	
	@Size(min=2, max=10)
	private String studentName;
	
	private String studentHobby;
	@Max(222)
	private long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	private Address studentAddress;
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	/*@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentHobby=" + studentHobby + "]";
	}
	*/
	
			
}
