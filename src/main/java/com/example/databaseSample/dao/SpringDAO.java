package com.example.databaseSample.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;
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
				"select * from employees;", mapper);
		return employeeList;
	}

	public List<Customer> findCustomers() {
		RowMapper<Customer> mapper = new BeanPropertyRowMapper<Customer>(
				Customer.class);
		String sql = "SELECT CustomerID,CustomerName,Address"
				+ ",(SELECT CustomerClassName FROM CustomerClasses WHERE Customers.CustomerClassID = CustomerClasses.CustomerClassID)"
				+ ",(SELECT PrefecturalName FROM Prefecturals WHERE Customers.PrefecturalID = Prefecturals.PrefecturalID)"
				+ "FROM Customers ;";
		List<Customer> customerList = jdbcTemplate.query(sql, mapper);
		return customerList;
	}

	public ArrayList<LinkedHashMap<String, String>> executeSQL(String sql)
			throws DataAccessException, InvalidResultSetAccessException {
		ResultSetWrappingSqlRowSet rowset = (ResultSetWrappingSqlRowSet) jdbcTemplate
				.queryForRowSet(sql);
		SqlRowSetMetaData metaData = rowset.getMetaData();
		ArrayList<LinkedHashMap<String, String>> resultList = new ArrayList<LinkedHashMap<String, String>>();
		while (rowset.next()) {
			LinkedHashMap<String, String> recordMap = new LinkedHashMap<String, String>();
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				recordMap.put(metaData.getColumnName(i) , rowset.getString(metaData.getColumnName(i)));
			}
			resultList.add(recordMap);
		}
		return resultList;
	}
}
