package com.bean;
public class User {
	private String username;
	private String password;
	private String user_id;
	private String horoscope;
	private String district;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getHoroscope() {
		return horoscope;
	}
	public void setHoroscope(String horoscope) {
		this.horoscope = horoscope;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public User(String username,String password,String user_id,String horoscope,String district){
		this.username=username;
		this.password=password;
		this.user_id=user_id;
		this.horoscope=horoscope;
		this.district=district;
	}
	
	public User(){
		
	}

}
