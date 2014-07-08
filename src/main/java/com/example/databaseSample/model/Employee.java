package com.example.databaseSample.model;

public class Employee {
	private int employeeid;
	private String employeename;
	private int height;
	private int weight;
	private String email;
	private int hirefiscalyear;
	private String birthday;
	private String bloodtype;
	
	public void setEmployeeid(int employeeid){
		this.employeeid = employeeid;
	}
	public void setEmployeename(String employeename){
		this.employeename = employeename;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setHirefiscalyear(int hirefiscalyear){
		this.hirefiscalyear = hirefiscalyear;
	}
	public void setBloodtype(String bloodtype){
		this.bloodtype = bloodtype;
	}
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public int getEmployeeid(){
		return employeeid;
	}
	public String getEmployeename(){
		return employeename;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	public String getEmail(){
		return email;
	}
	public int getHirefiscalyear(){
		return hirefiscalyear;
	}
	public String getBirthday(){
		return birthday;
	}
	public String getBloodtype(){
		return bloodtype;
	}

}
