package org.example.present;

import org.example.EcollectionStore.departmentCollection.DepartmentMemmory;

public class DepartmentPresentImpl implements DepartmentPresent{

    private final DepartmentMemmory departmentMemmory;

    public DepartmentPresentImpl(DepartmentMemmory departmentMemmory) {
        this.departmentMemmory = departmentMemmory;
    }
    @Override
    public void departmentView(int departmentId){
        departmentMemmory.getDepartment(departmentId).getDepartmentName();
        System.out.printf("Department: %s /n ID: %d /n Budget: $.2f $/year. /n Not allocated: %.2f /n" +
                "Employees: ", departmentMemmory.getDepartment(departmentId).getDepartmentName(),
                                departmentMemmory.getDepartment(departmentId).getDepartmentId(),
                                departmentMemmory.getDepartment(departmentId).getYearlyBudget(),
                                departmentMemmory.getDepartment(departmentId).getYearlyBudget() -
                                departmentMemmory.sumEmployeesSelaries(departmentMemmory.getDepartment(departmentId).getDepartmentId()),
                                departmentMemmory.getDepartment(departmentId).getDepartmentMembers());

    }
}
