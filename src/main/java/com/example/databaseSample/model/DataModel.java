package com.example.databaseSample.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class DataModel implements Serializable{

	private static final long serialVersionUID = 2898450973321820892L;

	@Autowired
    private JdbcTemplate jdbcTemplate;
    
    private List<Map<String, Object>> list;
    
//    public DataModel(){
//    	list = jdbcTemplate.queryForList("select * from sample");
//    }
//    
    private String name = "test";//(String) list.get(0).get("name");

    private String id = "id";//(String) list.get(0).get("id");
    
	public String getName(){
		return this.name;
	}
	
	public String getId(){
		return this.id;
	}

}
