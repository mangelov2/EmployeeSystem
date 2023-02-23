package org.example.service.departmentService;

import org.example.EcollectionStore.departmentCollection.DepartmentAction;
import org.example.EcollectionStore.employeeCollection.EmployeeAction;
import org.example.data.Department;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentAction departmentAction;
    private EmployeeAction employeeAction;
    //private HashMap<Integer, ArrayList<Integer>> departmentsAndMembers;

    public DepartmentServiceImpl(DepartmentAction departmentAction, EmployeeAction employeeAction) {
        this.departmentAction = departmentAction;
        this.employeeAction = employeeAction;
       // this.departmentsAndMembers = new HashMap<>();
    }

    @Override
    public boolean employeeContainsInDepartment(int employeeId) {
        return departmentAction.getAllDepartments().contains(employeeId);
    }
    @Override
    public double getDepartmentBudget(int employeeId){
        double departmentBudget = 0;
        for (Department dep : departmentAction.getAllDepartments()) {
            if(dep.getDepartmentMembers().contains(employeeId)){
               departmentBudget = dep.getYearlyBudget();
            }
        }
        return departmentBudget;
    }


//    @Override
//    public double getDepartmentBudget(Department department) {
//        return 0;
//    }
//
//    @Override
//    public void assignEmployeesToDepartment(int departmentId, int employeeId) {
//        boolean isItExistDepartment = departmentAction.getDepartmentById(departmentId);
//        boolean isItExistEmployee = employeeAction.getEmployeeById(employeeId);
//
//        if(isItExistDepartment & isItExistEmployee){
//            Department department = departmentAction.getDepartment(departmentId);
//            Employee employee = employeeAction.getEmployeeBy(employeeId);
//
//            if(departmentsAndMembers.isEmpty()){
//                if(department.getYearlyBudget() >= employee.getYearSalary()){
//                    departmentsAndMembers.put(departmentId, new ArrayList<>(employeeId));
//                }else System.out.printf("Unable to add employee %d to department %d as there is not enough budget!",
//                        employeeId, departmentId);
//            }else if(departmentsAndMembers.containsKey(departmentId)){
//
//                }
//
//        }
//
//    }
}
