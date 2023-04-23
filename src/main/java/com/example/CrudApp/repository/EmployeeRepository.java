package com.example.CrudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudApp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
