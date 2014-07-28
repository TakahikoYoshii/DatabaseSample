package com.example.databaseSample.form;

import java.io.Serializable;

public class EmployeeForm implements Serializable{

	private static final long serialVersionUID = 7858744246934129848L;
	
	private String bloodtype;
	private boolean isBloodtype;
	private String birth_year_from;
	private String birth_year_to;
	private boolean where_birth_year;
	
	public void setBloodtype(String bloodtype){
		this.bloodtype = bloodtype;
	}
	
	public String getBloodtype(){
		return bloodtype;
	}

	public void setIsBloodtype(boolean isBloodtype){
		this.isBloodtype = isBloodtype;
	}
	
	public boolean getIsBloodtype(){
		return isBloodtype;
	}

	public void setBirth_year_from(String birth_year_from){
		this.birth_year_from = birth_year_from;
	}
	
	public String getBirth_year_from(){
		return birth_year_from;
	}

	public void setBirth_year_to(String birth_year_to){
		this.birth_year_to = birth_year_to;
	}
	
	public String getBirth_year_to(){
		return birth_year_to;
	}

	public void setWhere_birth_year(boolean where_birth_year){
		this.where_birth_year = where_birth_year;
	}
	
	public boolean getWhere_birth_year(){
		return where_birth_year;
	}
}
