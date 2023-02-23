package org.example.EcollectionStore.departmentCollection;

import org.example.data.Department;
import org.example.data.Employee;

import java.util.List;

public interface DepartmentAction {

    void addDepartment(Department department);
    boolean getDepartmentById(int departmentId);

    Department getDepartment(int departmentId);

    void assignEmployee(int departmentId, int employeeId);
    boolean checkForExistingDepartment(int departmentID);

    double sumEmployeesSelaries(int departmentID);

    double employeeSelary(int employeeID);
    List<Department> getAllDepartments();

}
