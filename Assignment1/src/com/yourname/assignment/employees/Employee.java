package com.yourname.assignment.employees;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    /**
     * Gets the employee's name.
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee's ID.
     * @return the employee ID
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee's ID.
     * @param employeeId the employee ID to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the employee's salary.
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}