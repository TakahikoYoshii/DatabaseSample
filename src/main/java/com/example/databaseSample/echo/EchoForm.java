package com.example.databaseSample.echo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable{
	
	private static final long serialVersionUID = -5706357630590327715L;

	@NotNull
	@Size(min = 1, max = 5)
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
