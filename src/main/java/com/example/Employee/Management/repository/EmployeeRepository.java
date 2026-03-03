package com.example.Employee.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Employee.Management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}