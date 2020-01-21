package com.ust.Services;

import com.ust.DAO.EmployeeDao;
import com.ust.Entities.Department;
import com.ust.Entities.Employee;

public class HrService {
	
	
	EmployeeDao empDao;
	
	public HrService() {
		empDao = new EmployeeDao();
	}
	
	
	
	
	public void createEmployee(String firstname, String lastname, String email, int departmentId) {
		
		Department dept = new Department();
		dept.setIddepartment(departmentId);
		
		Employee employee = new Employee(firstname, lastname, email, dept);
		empDao.createEmployee(employee);
	}
	
	
	
	
	public Employee findEmployeeById(int id) {
		return empDao.findEmployeeUsingId(id);
	}
	
	
	
	
	
	

}
