package org.example.service;

import org.example.EcollectionStore.employeeCollection.EmployeeMemmory;

public class SalaryPromotionImpl implements SalarryPromotion {

    @Override
    public double calculateSalary(int employeeId, double persatage) {
        EmployeeMemmory employeeMemmory = null;
        double salary = employeeMemmory.getEmployeeBy(employeeId).getYearSalary();
        double newSalary = salary + (salary * (persatage / 100));
      //  employeeMemory.getEmployeeBy(employeeId).setYearSalary(newSalary);
        return newSalary;
    }
}
