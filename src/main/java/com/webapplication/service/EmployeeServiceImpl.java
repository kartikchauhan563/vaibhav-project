package com.webapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapplication.model.Employee;
import com.webapplication.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.repository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> optional = repository.findById(id);
		Employee employee=null;
		if (optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee not fount for id : "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.repository.deleteById(id);
		
	}

	
	public List<Employee> getByJobName(String keyword) {
		return repository.findByJobName(keyword);
	}

	
	
	

}
