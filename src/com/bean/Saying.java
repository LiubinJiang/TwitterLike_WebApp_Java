package com.bean;

public class Saying {
	private int saying_id;
	private String user_id;
	private String sayinginfo;
	
	public String getSayinginfo() {
		return sayinginfo;
	}
	public void setSayinginfo(String sayinginfo) {
		this.sayinginfo = sayinginfo;
	}
	public int getSaying_id() {
		return saying_id;
	}
	public void setSaying_id(int saying_id) {
		this.saying_id = saying_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	public Saying(String user_id,int saying_id,String sayinginfo){
		this.user_id=user_id;
		this.saying_id=saying_id;
		this.sayinginfo=sayinginfo;
	}
	
	public Saying(){
		
	}
	

}
