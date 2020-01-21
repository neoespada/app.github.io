package com.ust.Controllers;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ust.Entities.Department;
import com.ust.Entities.Employee;
import com.ust.Services.HrService;

@Controller
public class MyController {

	public static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("PU");
	
	HrService hrservice;
	
	public MyController() {
		hrservice = new HrService();
	}

	@RequestMapping("/signup")
	public String signUP(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("email") String email,
			@RequestParam("department") int department) {

		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(department);
		
		hrservice.createEmployee(firstname, lastname, email, department);
		
		
		return "login";

	}
	
	
	
	
	@RequestMapping("/employee/{id}")
	public String findEmployeeById(@PathVariable("id") int employeeId) {
		
		Employee emp = hrservice.findEmployeeById(employeeId);
		
		System.out.println(emp.getDept().getName());
		
		return "result";
		
	}
	

}
