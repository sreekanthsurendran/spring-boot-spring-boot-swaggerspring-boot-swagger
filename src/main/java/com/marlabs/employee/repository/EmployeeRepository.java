package com.marlabs.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.marlabs.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
