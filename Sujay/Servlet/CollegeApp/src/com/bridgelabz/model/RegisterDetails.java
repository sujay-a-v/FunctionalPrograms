package com.bridgelabz.model;

public class RegisterDetails {
	
	private String name;
	private String email;
	private String password;
	//private String confirmpw;
	private int uid;
	private long mobile;
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public String getConfirmpw() {
		return confirmpw;
	}
	public void setConfirmpw(String confirmpw) {
		this.confirmpw = confirmpw;
	}*/
	

}
