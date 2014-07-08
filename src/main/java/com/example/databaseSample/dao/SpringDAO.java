package com.example.databaseSample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.databaseSample.model.Customer;
import com.example.databaseSample.model.Employee;

@Repository
@Transactional
public class SpringDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> findEmployees() {
		RowMapper<Employee> mapper = new BeanPropertyRowMapper<Employee>(
				Employee.class);
		List<Employee> employeeList = jdbcTemplate.query(
				"select * from employees", mapper);
		return employeeList;
	}

	public List<Customer> findCustomers() {
		RowMapper<Customer> mapper = new BeanPropertyRowMapper<Customer>(
				Customer.class);
		List<Customer> customerList = jdbcTemplate.query(
				"select * from customers", mapper);
		return customerList;
	}

}
