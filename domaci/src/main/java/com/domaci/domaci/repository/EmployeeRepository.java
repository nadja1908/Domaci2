package com.domaci.domaci.repository;

import com.domaci.domaci.entity.Company;
import com.domaci.domaci.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
