package com.example.databaseSample.model;

public class Customer {
	private int customerid;
	private String customername;
	private String address;
	private String customerclassname;
	private String prefecturalname;
	
	public void setCustomerid(int customerid){
		this.customerid = customerid;
	}

	public void setCustomername(String customername){
		this.customername = customername;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setCustomerclassname(String customerclassname){
		this.customerclassname = customerclassname;
	}

	public void setPrefecturalname(String prefecturalname){
		this.prefecturalname = prefecturalname;
	}

	public int getCustomerid(){
		return customerid;
	}

	public String getCustomername(){
		return customername;
	}

	public String getAddress(){
		return address;
	}

	public String getCustomerclassname(){
		return customerclassname;
	}

	public String getPrefecturalname(){
		return prefecturalname;
	}
}
