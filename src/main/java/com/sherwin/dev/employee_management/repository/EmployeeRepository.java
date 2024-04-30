package com.sherwin.dev.employee_management.repository;

import com.sherwin.dev.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
