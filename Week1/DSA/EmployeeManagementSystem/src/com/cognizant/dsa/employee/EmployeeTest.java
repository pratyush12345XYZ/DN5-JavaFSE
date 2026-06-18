package com.cognizant.dsa.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager =
                new EmployeeManager(10);

        manager.addEmployee(
                new Employee(101,
                        "Pratyush",
                        "Developer",
                        50000));

        manager.addEmployee(
                new Employee(102,
                        "Rahul",
                        "Tester",
                        40000));

        manager.addEmployee(
                new Employee(103,
                        "Aman",
                        "Manager",
                        70000));

        System.out.println("\nAll Employees:");

        manager.traverseEmployees();

        System.out.println("\nSearching Employee 102:");

        Employee found =
                manager.searchEmployee(102);

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee Not Found");
        }

        System.out.println("\nDeleting Employee 102:");

        manager.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");

        manager.traverseEmployees();
    }
}