package com.congluvcode.employee.repository;

import com.congluvcode.employee.entity.EmployeeEntity;
import com.congluvcode.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
