package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Address;
import com.example.demo.modal.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping(value="/emscloud")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
		
	}
		
		
	
	
	
	
	
	
	@RequestMapping(value="/test")
	public Employee test() {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Krish");
		Address address=new Address();
		address.setId(1);
		address.setAddress1("Badulla");
		address.setCity("Kadawtha");
		return employee;
	}
	@RequestMapping(value="/test1")
	public ResponseEntity<Employee> test2() {
		Integer x=null;
		if(x==null) {
		
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Krish");
		Address address=new Address();
		address.setId(1);
		address.setAddress1("Badulla");
		address.setCity("Kadawtha");
		return ResponseEntity.ok(employee);
}else {
	HttpHeaders httpheaders=new HttpHeaders();
	httpheaders.add("status", "invalid staus");
	return ResponseEntity.notFound().headers(httpheaders).build();	
}
}
	}
