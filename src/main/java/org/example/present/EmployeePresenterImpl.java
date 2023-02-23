package org.example.present;

import org.example.EcollectionStore.departmentCollection.DepartmentMemmory;
import org.example.EcollectionStore.employeeCollection.EmployeeMemmory;
import org.example.data.Department;
import org.example.data.Employee;

public class EmployeePresenterImpl implements EmplpyeePresenter{
    private final EmployeeMemmory employeeMemmory;
    private final DepartmentMemmory departmentMemmory;

    public EmployeePresenterImpl(EmployeeMemmory employeeMemmory, DepartmentMemmory departmentMemmory) {
        this.employeeMemmory = employeeMemmory;
        this.departmentMemmory = departmentMemmory;
    }


    @Override
    public void presentEmployee(int employeeId) {
        if(isItExist(employeeId)){
            int depId = getDepartmentName(employeeId);
            Employee employee = employeeMemmory.getEmployeeBy(employeeId);
            if(depId != 0){
                System.out.printf("“Employee ID: %d, name: %s %s, Department: %d, Salary: %.2f /n",
                        employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), depId,employee.getYearSalary());
            }else
                System.out.printf("“Employee ID: %d, name: %s %s, Department: N/A, Salary: %.2f /n",
                        employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),employee.getYearSalary());
        }else System.out.printf("Employee with ID %d does not exist!/n", employeeId);
    }

    @Override
    public boolean isItExist(int employeeID) {
        boolean hasMatches = false;
        for (Employee employee : employeeMemmory.getAllEmployees()) {
            hasMatches = employee.getEmployeeId() == employeeID;
        }
        if(hasMatches){
            return true;
        }else return false;
    }
    @Override
    public int getDepartmentName(int employee){
        int departmentID = 0;
        DepartmentMemmory departmentMemmory1 = null;
        departmentMemmory1.getAllDepartments();
        for(Department dep : departmentMemmory1.getAllDepartments()){
            for (Employee emp :  dep.getDepartmentMembers()) {
                if(emp.getEmployeeId() == employee){
                    departmentID = emp.getEmployeeId();
                }
            }
        }
        return departmentID;
    }
}
