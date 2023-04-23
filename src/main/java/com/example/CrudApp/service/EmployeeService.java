package com.example.CrudApp.service;

import java.util.List;

import com.example.CrudApp.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployeeById(long id);

	public void deleteEmployeeById(long id);

}
