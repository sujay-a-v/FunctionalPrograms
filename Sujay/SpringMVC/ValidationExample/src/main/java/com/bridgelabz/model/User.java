package com.bridgelabz.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull
	@Size(min=1)
	private String name;
	@NotNull
	@Size(min=1)
	private List<String> language;
	@Size(min=1)
	private String country;
	@NotNull
	private String gender;
	@Size(min=1, message="Email feild can't blank")
	private String email;
	@Size(min=8, max=20)
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLanguage() {
		return language;
	}
	public void setLanguage(List<String> language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", language=" + language + ", country=" + country + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + "]";
	}
	
}
