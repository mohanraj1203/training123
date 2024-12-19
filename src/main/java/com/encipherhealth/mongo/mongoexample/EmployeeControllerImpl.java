package com.encipherhealth.mongo.mongoexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControllerImpl {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public EmployeeControllerImpl() {
		
	}
	
	@PostMapping("/emp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	@GetMapping("/emp")
	public List<Employee> listEmployee() {
		return employeeRepository.findAll();
	}
	
	
	
}
