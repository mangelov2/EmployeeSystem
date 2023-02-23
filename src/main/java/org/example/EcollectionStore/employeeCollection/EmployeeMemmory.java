package org.example.EcollectionStore.employeeCollection;

import org.example.data.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMemmory implements EmployeeAction{

    private final List<Employee> employees;

    public EmployeeMemmory() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void hireEmployee(Employee employee) {
        if(employees.isEmpty()){
            employees.add(employee);
        }
        for (Employee emp : employees) {
            if(emp.getEmployeeId() == employee.getEmployeeId()){
                System.out.println("Employee with " +  emp.getEmployeeId() + " already exists!");
            }else
                employees.add(employee);
        }
    }

    @Override
    public Employee getEmployeeBy(int employeeId) {
        return employees.stream()
                .filter(em -> em.getEmployeeId()==employeeId)
                .findFirst()
                .get();
    }

    @Override
    public boolean getEmployeeById(int employeeId) {
        for (Employee emp : employees) {
            if(emp.getEmployeeId() == employeeId){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
