package com.example.employee_register.controller;

import com.example.employee_register.entity.Employee;
import com.example.employee_register.exception.EmplyeeException;
import com.example.employee_register.services.EmployeeServices;
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
    public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee employee) throws EmplyeeException{
        Employee employee1 = employeeServices.registerEmployee(employee);
        return new ResponseEntity<>(employee1, HttpStatus.ACCEPTED);
    }

    @GetMapping("/employeeList")
    public ResponseEntity<List<Employee>> getEmployeeListHandler() throws EmplyeeException{
        List<Employee> employeeList = employeeServices.getEmployeeList();
        return new ResponseEntity<>(employeeList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeByIDHandler(@PathVariable("id") Integer id) throws EmplyeeException{
        Employee employee = employeeServices.getEmployeeByID(id);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
}
