package com.ust.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust.Entities.Employee;

public class EmployeeDao {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("PU");

	
	
	
	
	
	
	
	
	
	public void createEmployee(Employee employee) {

		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();

		try {

			manager.getTransaction().begin();
			manager.persist(employee);
			manager.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			manager.close();

		}

	}

	
	
	
	
	
	
	public Employee findEmployeeUsingId(int id) {
		
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		
		Employee employee_fetched = null;
		
		try {
			manager.getTransaction().begin();
			employee_fetched = manager.find(Employee.class, id);
			manager.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
		
		return employee_fetched;
		
	}
	
	
	
	
	
	
	
	

}
