package com.bridgelabz.model;

public class Address {
	
	private String country;
	private String city;
	private int pincode;
	private String street;
	
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", pincode=" + pincode + ", street=" + street + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
