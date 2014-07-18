package com.example.databaseSample.dao;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.databaseSample.model.Customer;
import com.example.databaseSample.model.Employee;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class SpringDAOTest {
	@Autowired
	private SpringDAO dao;
	
	@Test
	public void test_employee() {
		assertThat(dao, notNullValue());
		List<Employee> employeelist = dao.findEmployees();
		assertThat(employeelist, notNullValue());
        for (Employee dto : employeelist) {
            System.out.print(dto.getEmployeeid());
            System.out.print(dto.getEmployeename());
            System.out.print(dto.getHeight());
            System.out.print(dto.getWeight());
            System.out.print(dto.getEmail());
            System.out.print(dto.getHirefiscalyear());
            System.out.print(dto.getBirthday());
            System.out.print(dto.getBloodtype());
            System.out.println();
        }
	}

	@Test
	public void test_customer() {
		assertThat(dao, notNullValue());
		List<Customer> customerlist = dao.findCustomers();
		assertThat(customerlist, notNullValue());
        for (Customer dto : customerlist) {
            System.out.print(dto.getCustomerid());
            System.out.print(dto.getCustomername());
            System.out.print(dto.getAddress());
            System.out.print(dto.getCustomerclassname());
            System.out.print(dto.getPrefecturalname());
            System.out.println();
        }
	}

	@Test
	public void test_executeSQL() {
		assertThat(dao, notNullValue());
		String sql = "select * from customers;";
		ArrayList<LinkedHashMap<String, String>> resultlist = dao.executeSQL(sql);
		assertThat(resultlist, notNullValue());
		LinkedHashMap<String, String> map = resultlist.get(0);
        for (String key : map.keySet()) {
            System.out.print(key+":"+map.get(key));
        }
        System.out.println();
	}
}
