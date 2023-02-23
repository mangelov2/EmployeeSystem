package org.example.data;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;
    private double yearlyBudget;
    private List<Employee> departmentMembers;


    public Department(int departmentId, String departmentName, double yearlyBudget) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.yearlyBudget = yearlyBudget;
        this.departmentMembers = new ArrayList<>();
    }
    public List<Employee> getDepartmentMembers() {
        return departmentMembers;
    }
    public void setDepartmentMembers(List<Employee> departmentMembers) {
        this.departmentMembers = departmentMembers;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getYearlyBudget() {
        return yearlyBudget;
    }

    public void setYearlyBudget(double yearlyBudget) {
        this.yearlyBudget = yearlyBudget;
    }
}
