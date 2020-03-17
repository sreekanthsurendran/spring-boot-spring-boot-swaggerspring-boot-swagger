package com.marlabs.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.employee.integration.PayrollServiceProxy;

@RestController
@RequestMapping("/sample/employeeservice")
public class EmployeeService {
	
	@Autowired
	private PayrollServiceProxy payrollServiceProxy;

	@GetMapping("/{empId}/salary") 
	public Double getSalary(@PathVariable Integer empId) {
		System.out.println("EMP ID - " + empId);
		return payrollServiceProxy.getSalary(empId);
	}
}
