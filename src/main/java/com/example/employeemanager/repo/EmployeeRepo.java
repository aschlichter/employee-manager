package com.example.employeemanager.repo;

import com.example.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adam on 2021. 12. 26.
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
