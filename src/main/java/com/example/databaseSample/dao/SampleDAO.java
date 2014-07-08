package com.example.databaseSample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SampleDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(int id, String name) {
		jdbcTemplate.update("insert into sample (id, name) values (?, ?);"
				, id, name);
	}

}
