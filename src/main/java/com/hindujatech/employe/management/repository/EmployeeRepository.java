package com.hindujatech.employe.management.repository;

import com.hindujatech.employe.management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
