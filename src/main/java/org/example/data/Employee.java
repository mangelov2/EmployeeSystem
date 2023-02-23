package org.example.data;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private double yearSalary;


    public Employee(int employeeId, String firstName, String lastName, double yearSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearSalary = yearSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getYearSalary() {
        return yearSalary;
    }

    public void setYearSalary(double yearSalary) {
        this.yearSalary = yearSalary;
    }
}
