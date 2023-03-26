package com.example.employee_springboot_crud.controller;


import com.example.employee_springboot_crud.entity.Employee;
import com.example.employee_springboot_crud.exception.EmployeeException;
import com.example.employee_springboot_crud.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping("/register")
    public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee employee) throws EmployeeException {
        Employee employee1 = employeeServices.registerEmployee(employee);
        return new ResponseEntity<>(employee1, HttpStatus.ACCEPTED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee employee,@PathVariable("id") Integer empID) throws EmployeeException{
        Employee employee1 = employeeServices.updateEmployeeByID(employee,empID);
        return new ResponseEntity<>(employee1, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> deleteEmployeeHandler(@PathVariable("id") Integer empID) throws EmployeeException{
        Employee employee1 = employeeServices.deleteEmployeeByID(empID);
        return new ResponseEntity<>(employee1, HttpStatus.OK);
    }

    @GetMapping("/employeeList")
    public ResponseEntity<List<Employee>> employeeListHandler() throws EmployeeException{
        List<Employee> employeeList = employeeServices.getAllEmployeeList();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
}
