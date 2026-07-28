package com.cognizant.spring_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    private static List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {

        Department d1 = new Department(1, "IT");
        Department d2 = new Department(2, "HR");

        Skill s1 = new Skill(1, "Java");
        Skill s2 = new Skill(2, "Spring Boot");
        Skill s3 = new Skill(3, "Angular");

        EMPLOYEE_LIST.add(
                new Employee(1, "John", 50000, true,
                        d1, Arrays.asList(s1, s2)));

        EMPLOYEE_LIST.add(
                new Employee(2, "David", 60000, true,
                        d1, Arrays.asList(s1, s3)));

        EMPLOYEE_LIST.add(
                new Employee(3, "Priya", 45000, false,
                        d2, Arrays.asList(s2)));

        EMPLOYEE_LIST.add(
                new Employee(4, "Rahul", 70000, true,
                        d1, Arrays.asList(s1, s2, s3)));
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}