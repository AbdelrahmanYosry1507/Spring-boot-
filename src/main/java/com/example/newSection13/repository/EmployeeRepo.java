package com.example.newSection13.repository;

import com.example.newSection13.model.enitity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
