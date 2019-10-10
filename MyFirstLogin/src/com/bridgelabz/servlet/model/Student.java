package com.bridgelabz.servlet.model;

public class Student 
{
	private String Name;
    private String mailId;
	private String mobNumber;
	private String password;
	private String reTypePassword;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getmailId() {
		return mailId;
	}
	public void setmailId(String email) {
		this.mailId = email;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReTypePassword() {
		return reTypePassword;
	}
	public void setReTypePassword(String reTypePassword) {
		this.reTypePassword = reTypePassword;
	}
	
	
	
	
	
}
