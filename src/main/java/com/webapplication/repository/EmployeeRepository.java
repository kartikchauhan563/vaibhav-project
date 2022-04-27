package com.webapplication.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webapplication.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
List<Employee> findByJobName(String JobName);
}
