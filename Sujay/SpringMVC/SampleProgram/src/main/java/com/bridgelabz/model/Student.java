package com.bridgelabz.model;

import java.sql.Date;
import java.util.ArrayList;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class Student {
	
	@Size(min=3,max=30)
	private String studentName;
	@NotEmpty(message = "Please enter your password.")
	@Size(min=2,max=30,message="Length must be >2 and <30")
	private String studentHobby;
	
	private long studentMobile;
	private String studentDOB;
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
	
	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
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
