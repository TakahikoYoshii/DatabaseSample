package com.example.databaseSample.model;

public class Customer {
	private int customerid;
	private int customercode;
	private String customername;
	private String address;
	private int customerclassid;
	private int prefecturalid;
	
	public void setCustomerid(int customerid){
		this.customerid = customerid;
	}

	public void setCustomercode(int customercode){
		this.customercode = customercode;
	}

	public void setCustomername(String customername){
		this.customername = customername;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setCustomerclassid(int customerclassid){
		this.customerclassid = customerclassid;
	}

	public void setPrefecturalid(int prefecturalid){
		this.prefecturalid = prefecturalid;
	}

	public int getCustomerid(){
		return customerid;
	}

	public int getCustomercode(){
		return customercode;
	}

	public String getCustomername(){
		return customername;
	}

	public String getAddress(){
		return address;
	}

	public int getCustomerclassid(){
		return customerclassid;
	}

	public int getPrefecturalid(){
		return prefecturalid;
	}
}
