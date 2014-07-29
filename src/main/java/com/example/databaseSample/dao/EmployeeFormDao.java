package com.example.databaseSample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.databaseSample.model.Employee;
import com.example.databaseSample.model.EmployeeForm;

@Repository
@Transactional
public class EmployeeFormDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Employee> selectEmployees(EmployeeForm employeeForm) {
		RowMapper<Employee> mapper = new BeanPropertyRowMapper<Employee>(
				Employee.class);
		List<Employee> employeeList = jdbcTemplate.query(
				"select * from employees;", mapper);
		return employeeList;
	}

}
