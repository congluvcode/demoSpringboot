package com.congluvcode.employee.service;

import com.congluvcode.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> findAllEmployees();

    boolean deleteEmployee(long id);

    Employee updateEmployee(long id, Employee employee);

    Employee getEmployeeById(long id);
}
