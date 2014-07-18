package com.example.databaseSample.echo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable{
	
	private static final long serialVersionUID = -5706357630590327715L;

	@NotNull
	@Size(min = 1, max = 100)
	private String sql;
	
	public void setSql(String sql) {
		this.sql = sql;
	}
	
	public String getSql(){
		return this.sql;
	}
}
