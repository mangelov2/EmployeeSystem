package org.example.EcollectionStore.employeeCollection;

import org.example.data.Employee;

import java.util.List;

public interface EmployeeAction {

    void hireEmployee(Employee employee);

    Employee getEmployeeBy(int employeeId);

    boolean getEmployeeById(int employeeId);
    List<Employee> getAllEmployees();


}
