package org.example.EcollectionStore.departmentCollection;

import org.example.EcollectionStore.employeeCollection.EmployeeMemmory;
import org.example.data.Department;
import org.example.data.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentMemmory implements DepartmentAction {

    private final List<Department> departments;
    private EmployeeMemmory employeeMemmory;

    public DepartmentMemmory(EmployeeMemmory employeeMemmory) {
        this.employeeMemmory = employeeMemmory;
        this.departments = new ArrayList<>();
    }

    @Override
    public void addDepartment(Department department) {
        if(departments.isEmpty()){
            departments.add(department);
        }
        for (Department dep : departments) {
            if(dep.getDepartmentId() == department.getDepartmentId()){
                System.out.println("Department with " + department.getDepartmentId() + " already exists!");
            }else
                departments.add(department);
        }
    }

    @Override
    public boolean getDepartmentById(int departmentId) {
        for (Department d : departments) {
            if(d.getDepartmentId() == departmentId){
                return true;
            }
        }
        return false;
    }

    @Override
    public Department getDepartment(int departmentId) {
        return departments.stream()
                .filter(dp -> dp.getDepartmentId() == departmentId)
                .findFirst()
                .get();
    }

    @Override
    public void assignEmployee(int departmentId, int employeeId) {
        if(!checkForExistingDepartment(departmentId)){
            System.out.printf("Department with ID %d does not exist!%n", departmentId);
        }if(!employeeMemmory.getEmployeeById(employeeId)){
            System.out.printf("Employee with ID %d doesn’t exist!%n", employeeId);
        }if(getDepartment(departmentId).getYearlyBudget() <
                (sumEmployeesSelaries(departmentId) + employeeSelary(employeeId) )){
                    System.out.printf("Unable to add employee %d to department %d as there is not enough budget!/n",
                            employeeId, departmentId);
        }else getDepartment(departmentId).getDepartmentMembers().add(employeeMemmory.getEmployeeBy(employeeId));
    }

    @Override
    public boolean checkForExistingDepartment(int departmentID) {
        for (Department dep : departments) {
            if(dep.getDepartmentId() == departmentID){
                return true;
            }
        }
        return false;
    }

    @Override
    public double sumEmployeesSelaries(int departmentID) {
        departments.get(getDepartment(departmentID).getDepartmentId());
        Department department = null;
        double selarySum = 0;
        for (Employee emp : department.getDepartmentMembers()) {
            selarySum += emp.getYearSalary();
        }
        return selarySum;
    }

    @Override
    public double employeeSelary(int employeeID) {
        return employeeMemmory.getEmployeeBy(employeeID).getYearSalary();
    }

    @Override
    public List<Department> getAllDepartments() {
        return departments;
    }


}
