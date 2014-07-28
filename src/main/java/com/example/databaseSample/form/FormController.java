package com.example.databaseSample.form;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.databaseSample.dao.EmployeeFormDao;
import com.example.databaseSample.echo.EchoForm;
import com.example.databaseSample.model.Employee;

@Controller
@RequestMapping("employee_form")
public class FormController {
	@Autowired
	private EmployeeFormDao dao;
	
	@RequestMapping
	public String employee_form(Model model){
		return "employee_form/form";
	}

	@RequestMapping(value = "form_result")
	public String form_result(@Valid EchoForm echoForm, BindingResult result, Model model){
		if(result.hasErrors()){
			return "employee_form/form";
		}
		List<Employee> employeelist = dao.selectEmployees();
		model.addAttribute("employeeList", employeelist);
		return "employee_form/result";
	}
}
