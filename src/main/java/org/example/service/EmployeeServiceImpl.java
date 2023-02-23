package org.example.service;

import org.example.EcollectionStore.departmentCollection.DepartmentMemmory;
import org.example.EcollectionStore.employeeCollection.EmployeeMemmory;
import org.example.data.Employee;
import org.example.service.departmentService.DepartmentService;

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeMemmory employeeMemmory;
    private final DepartmentService departmentService;
    private final SalarryPromotion salarryPromotion;
    private final DepartmentMemmory departmentMemmory;

    public EmployeeServiceImpl(EmployeeMemmory employeeMemmory, DepartmentService departmentService, SalarryPromotion salarryPromotion, DepartmentMemmory departmentMemmory) {
        this.employeeMemmory = employeeMemmory;
        this.departmentService = departmentService;
        this.salarryPromotion = salarryPromotion;
        this.departmentMemmory = departmentMemmory;
    }


    @Override
    public double promote(int employeeId, double salaryIncreasePercentage) {
        if(departmentService.employeeContainsInDepartment(employeeId)){
            if(departmentService.getDepartmentBudget(employeeId) <
                  salarryPromotion.calculateSalary(employeeId,salaryIncreasePercentage)){
                System.out.println("Department %d ’s budget does not allow for such a high promotion!/n");
            }else System.out.println("sde");
        }else {
            Employee employee = employeeMemmory.getEmployeeBy(employeeId);
        }
        return 0;
    }


}
