package com.sherwin.dev.employee_management.service;

import com.sherwin.dev.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);

    Employee getById(Long id);
    void deleteViaId(long id);
}
