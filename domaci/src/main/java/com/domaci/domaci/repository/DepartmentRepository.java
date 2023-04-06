package com.domaci.domaci.repository;

import com.domaci.domaci.entity.Company;
import com.domaci.domaci.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
