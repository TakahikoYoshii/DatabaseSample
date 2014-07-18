package com.example.databaseSample.echo;

import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.databaseSample.dao.SpringDAO;
import com.example.databaseSample.model.Customer;
import com.example.databaseSample.model.Employee;

@Controller
@RequestMapping("echo")
public class EchoController {
	@Autowired
	private SpringDAO springdao;
	
	@ModelAttribute
	public EchoForm setUpEchoForm(){
		return new EchoForm();
	}
	
	@RequestMapping
	public String index(Model model){
		return "echo/index";
	}
	
//	@RequestMapping(value = "hello")
//	public String hello(@Valid EchoForm echoForm, BindingResult result, Model model){
//		if(result.hasErrors()){
//			return "echo/index";
//		}
//		model.addAttribute("name", echoForm.getName());
//		return "echo/hello";
//	}

	@RequestMapping(value = "employees")
	public String employees(Employee employee, Model model){
		List<Employee> employeelist = springdao.findEmployees();
		model.addAttribute("employeeList", employeelist);
		return "echo/employees";
	}

	@RequestMapping(value = "customers")
	public String customers(Customer customer, Model model){
		List<Customer> customerlist = springdao.findCustomers();
		model.addAttribute("customerList", customerlist);
		return "echo/customers";
	}

	@RequestMapping(value = "result")
	public String result(@Valid EchoForm echoForm, BindingResult result, String sql, Model model){
		if(result.hasErrors()){
			return "echo/index";
		}
		List<LinkedHashMap<String, String>> resultList = springdao.executeSQL(echoForm.getSql());
		model.addAttribute("result", resultList);
		return "echo/result";
	}
}
