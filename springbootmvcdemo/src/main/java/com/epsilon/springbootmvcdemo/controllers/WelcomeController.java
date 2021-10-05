package com.epsilon.springbootmvcdemo.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.springbootmvcdemo.models.Employee;


@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET,path = "/welcome")
	public String welcome() {
		//Employee emp = new Employee("Lenin Lawrence","Finance");
		//return emp;
		return "welcome";
	}
}
