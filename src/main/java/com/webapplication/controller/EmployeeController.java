package com.webapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webapplication.model.Employee;
import com.webapplication.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	
	//display list of employees
	@GetMapping("/")
	public ModelAndView viewHomePage() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return new ModelAndView("index", "employees", allEmployees);
		
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	
//	@RequestMapping(path = {"/","/search"})
//	 public String home(Employee emp, Model model, String keyword) {
//	  if(keyword!=null) {
//	   List<Employee> list = employeeService.getByKeyword(keyword);
//	   model.addAttribute("list", list);
//	  }else {
//	  List<Employee> list = employeeService.getAllEmployees();
//	  model.addAttribute("list", list);}
//	  return "index";
//	 }
	
	@GetMapping("/jobname")
	public ResponseEntity<List<Employee>> getByJobName(@RequestMapping String JobName){
		return new ResponseEntity<List<Employee>>(employeeService.getByJobName(JobName),HttpStatus.OK);
	}
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/";
	}
	
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormFormUpdate(@PathVariable(value = "id") long id,Model model) {
		Employee employee =  employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee"; 
	}
	
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}
	
	
}
