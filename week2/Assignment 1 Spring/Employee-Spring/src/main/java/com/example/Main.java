package com.example;

import com.example.config.AppConfig;
import com.example.dao.EmployeeDAO;
import com.example.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO dao = context.getBean(EmployeeDAO.class);

        System.out.println("Employee Creation");
        dao.create(new Employee(1, "Yaswanth", "IT"));
        dao.create(new Employee(2, "Arun", "HR"));
        System.out.println("Employees Created successfully");

        System.out.println("Employees List");
        dao.getAll().forEach(e ->
                System.out.println(e.getId() + ", " + e.getName() + ", " + e.getDepartment())
        );

        System.out.println("\nUpdating Employee with ID 1:");
        dao.update(new Employee(1, "Yaswanth", "Finance"));
        System.out.println("Employee Updated.");

        System.out.println("\nDeleting Employee with ID 2:");
        dao.delete(2);
        System.out.println("Employee Deleted.");

        System.out.println("\nFinal Employees List:");
        dao.getAll().forEach(e ->
                System.out.println(e.getId() + ", " + e.getName() + ", " + e.getDepartment())
        );


        context.close();
    }
}
