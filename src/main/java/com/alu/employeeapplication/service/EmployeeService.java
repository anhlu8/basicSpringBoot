package com.alu.employeeapplication.service;

import com.alu.employeeapplication.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "Anh", "Paoli"),
            new Employee(2, "Tom", "Paoli"),
            new Employee(3, "Owen", "Paoli")
    ));

    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    public Employee getAnEmployee(int id){
        return employeeList.stream().filter(employee -> employee.getEmployeeId() == id).findFirst().get();
    }

    public void createEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void updateEmployee(Employee employee){
        List<Employee> newEmployeeList = new ArrayList<>();
        for(Employee e: employeeList){
            if(e.getEmployeeId() == employee.getEmployeeId()){
                e.setEmployeeName(employee.getEmployeeName());
                e.setEmployeeCity(employee.getEmployeeCity());
            }
            newEmployeeList.add(e);
        }
        this.employeeList = newEmployeeList;
    }

    public void deleteEmployee(int id){
        List<Employee> tempEmployees = new ArrayList<>();
        for(Employee emp: employeeList){
            if(emp.getEmployeeId() == id){
                continue;
            }
            tempEmployees.add(emp);
        }
        this.employeeList = tempEmployees;

    }
}
