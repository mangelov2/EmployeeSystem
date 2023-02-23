package org.example.service.departmentService;

import org.example.data.Department;
import org.example.data.Employee;

import java.util.List;

public interface DepartmentService {

    boolean employeeContainsInDepartment(int employeeId);

    double getDepartmentBudget(int employeeID);
//
//        double getDepartmentBudget(Department department);
//
//        void assignEmployeesToDepartment(int departmentId, int employeeId);
    }
