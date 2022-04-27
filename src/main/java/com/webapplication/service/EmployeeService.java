package com.webapplication.service;

import java.util.List;


import com.webapplication.model.Employee;


public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	void deleteEmployeeById(long id);
	List<Employee> getByJobName(String keyword);
//	List<Employee> getByKeyword(String keyword); 
	
	
	 

}
