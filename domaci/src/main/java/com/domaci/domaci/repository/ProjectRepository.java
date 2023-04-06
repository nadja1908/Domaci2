package com.domaci.domaci.repository;

import com.domaci.domaci.entity.Company;
import com.domaci.domaci.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long>
{
}
