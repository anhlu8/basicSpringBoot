package com.alu.employeeapplication.repository;

import com.alu.employeeapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /*
    * CRUD
    * getAllEmployees()
    * getEmployee(id)
    * updateEmployee(Employee employee)
    * deleteEmployee(Employee employee)
    * */


}
