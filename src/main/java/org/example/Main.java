package org.example;

import org.example.EcollectionStore.departmentCollection.DepartmentAction;
import org.example.EcollectionStore.employeeCollection.EmployeeAction;
import org.example.data.Department;
import org.example.data.Employee;
import org.example.EcollectionStore.departmentCollection.DepartmentMemmory;
import org.example.EcollectionStore.employeeCollection.EmployeeMemmory;
import org.example.service.EmployeeServiceImpl;
import org.example.service.SalarryPromotion;
import org.example.service.departmentService.DepartmentService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        EmployeeMemmory employeeMemmory = new EmployeeMemmory();
        DepartmentMemmory departmentMemmory = new DepartmentMemmory(employeeMemmory);


        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while(!line.equals("End")){
            String[] tokens = line.split(" ");

            if(tokens[0].equals("HireEmployee")) {
                Employee employee = new Employee(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                employeeMemmory.hireEmployee(employee);
            }else if(tokens[0].equals("CreateDepartment")){
                Department department = new Department(Integer.parseInt(tokens[1]), tokens[2], Double.parseDouble(tokens[3]));
                departmentMemmory.addDepartment(department);
            }else if(tokens[0].equals("AssignDepartment")){
                departmentMemmory.assignEmployee(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
            }else if(tokens[0].equals("PromoteEmployee")){

            }else if(tokens[0].equals("ShowEmployee")){

            }else if(tokens[0].equals("ShowDepartment")){

            }

            System.out.println(employeeMemmory.getAllEmployees().size());

            line = scanner.nextLine();
        }
    }
}