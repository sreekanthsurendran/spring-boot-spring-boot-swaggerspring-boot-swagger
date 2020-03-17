package com.marlabs.employee.component;

import java.util.List;

import com.marlabs.employee.model.Employee;

public interface EmployeeComponent {

	public List<Employee> getEmployees();
	
	public Employee getEmployee(Integer empId);
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Integer empId, Employee employee);
	
	public void deleteEmployee(Integer empId);
}
