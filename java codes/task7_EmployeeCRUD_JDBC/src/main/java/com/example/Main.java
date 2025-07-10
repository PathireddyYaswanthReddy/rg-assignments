package com.example;

public class Main {
    public static void main(String[] args) {
        EmployeeJDBC crud = new EmployeeJDBC();

        Employee e1 = new Employee(1, "Yaswanth", "IT");
        Employee e2 = new Employee(2, "Arun", "HR");

        crud.addEmployee(e1);
        crud.addEmployee(e2);

        System.out.println("\nAll Employees:");
        crud.viewEmployees();

        crud.updateEmployee(2, "John", "Finance");

        crud.deleteEmployee(1);

        System.out.println("\nFinal List:");
        crud.viewEmployees();
    }
}
