package com.marlabs.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.employee.component.EmployeeComponent;
import com.marlabs.employee.model.Employee;

@RestController
@RequestMapping("sample")
public class EmployeeController {
	
	@Autowired
	private EmployeeComponent employeeComponent;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeComponent.getEmployees();
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeComponent.saveEmployee(employee);
	}
	
	@PutMapping("/employees/{empId}")
	public Employee updateEmployee(@PathVariable Integer empId, @RequestBody Employee employee) {
		Employee emp = employeeComponent.updateEmployee(empId, employee);
		if (null == emp) {
			throw new RuntimeException("Employee Record not found");
		}
		return emp;
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable Integer empId) {
		return employeeComponent.getEmployee(empId);
	}
	
	@DeleteMapping("/employees/{empId}")
	public void deleteEmployee(@PathVariable Integer empId) {
		employeeComponent.deleteEmployee(empId);
	}
	
}
