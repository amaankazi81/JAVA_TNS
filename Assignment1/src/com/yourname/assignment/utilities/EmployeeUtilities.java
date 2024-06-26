package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Employee;
import com.yourname.assignment.employees.Manager;

/**
 * The EmployeeUtilities class provides utility methods for employee operations.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * @param employee the employee whose details are to be printed
     */
    public static void printEmployeeDetails(Employee employee) {
        if (employee == null) {
            System.out.println("Employee is null");
            return;
        }

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }

    /**
     * Increases the salary of an employee by a specified percentage.
     * @param employee the employee whose salary is to be increased
     * @param percentage the percentage by which to increase the salary
     * @throws IllegalArgumentException if the percentage is negative
     */
    public static void increaseSalary(Employee employee, double percentage) {
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative");
        }

        if (employee != null) {
            double newSalary = employee.getSalary() * (1 + percentage / 100);
            employee.setSalary(newSalary);
        }
    }
}
