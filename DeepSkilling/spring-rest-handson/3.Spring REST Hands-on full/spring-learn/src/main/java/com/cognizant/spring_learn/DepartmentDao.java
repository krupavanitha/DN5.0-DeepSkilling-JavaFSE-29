package com.cognizant.spring_learn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {

    private static List<Department> DEPARTMENT_LIST = new ArrayList<>();

    static {
        DEPARTMENT_LIST.add(new Department(1, "IT"));
        DEPARTMENT_LIST.add(new Department(2, "HR"));
        DEPARTMENT_LIST.add(new Department(3, "Finance"));
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}