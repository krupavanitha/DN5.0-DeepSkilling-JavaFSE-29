package com.cognizant.orm_learn2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("from Employee")
    List<Employee> getAllEmployees();

    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();
}