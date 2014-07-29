package com.example.databaseSample.form;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.databaseSample.dao.EmployeeFormDao;
import com.example.databaseSample.model.Employee;
import com.example.databaseSample.model.EmployeeForm;

@Controller
@RequestMapping("employee_form")
public class FormController {
	@Autowired
	private EmployeeFormDao dao;
	
	@ModelAttribute
	public EmployeeForm setUpEmployeeForm(){
		return new EmployeeForm();
	}
	
	@RequestMapping
	public String employee_form(Model model){
		return "employee_form/form";
	}

	@RequestMapping(value = "result", method = RequestMethod.POST)
	public String result(@Valid EmployeeForm employeeForm, BindingResult result, Model model){
		if(result.hasErrors()){
			return "employee_form/form";
		}
		List<Employee> employeelist = dao.selectEmployees(employeeForm);
		model.addAttribute("employeeList", employeelist);
		return "employee_form/result";
	}
}
