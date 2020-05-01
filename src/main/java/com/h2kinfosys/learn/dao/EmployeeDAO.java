package com.h2kinfosys.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.h2kinfosys.learn.dto.Employee;

@RepositoryRestResource(collectionResourceRel = "employee", path="employee")
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

}
