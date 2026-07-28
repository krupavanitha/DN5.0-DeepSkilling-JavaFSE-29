package com.cognizant.orm_learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearn2Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearn2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        employeeRepository.findAll().forEach(employee -> {
            System.out.println("Employee : " + employee.getName());
            System.out.println("Department : " + employee.getDepartment().getName());

            employee.getSkillList().forEach(skill ->
                    System.out.println("Skill : " + skill.getName()));

            System.out.println("--------------------------------");
        });

    }
        
    }
