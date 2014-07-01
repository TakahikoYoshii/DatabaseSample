package com.example.databaseSample.echo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("echo")
public class EchoController {

	@ModelAttribute
	public EchoForm setUpEchoForm(){
		return new EchoForm();
	}
	
	@RequestMapping
	public String index(Model model){
		return "echo/index";
	}
	
	@RequestMapping("hello")
	public String hello(@Valid EchoForm echoForm, BindingResult result, Model model){
		if(result.hasErrors()){
			return "echo/index";
		}
		model.addAttribute("name", echoForm.getName());
		return "echo/hello";
	}
}
