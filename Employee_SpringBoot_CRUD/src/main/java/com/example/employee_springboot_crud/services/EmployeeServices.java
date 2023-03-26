package com.example.employee_springboot_crud.services;


import com.example.employee_springboot_crud.entity.Employee;
import com.example.employee_springboot_crud.exception.EmployeeException;

import java.util.List;

public interface EmployeeServices {
    public Employee registerEmployee(Employee employee) throws EmployeeException;
    public Employee updateEmployeeByID(Employee employee,Integer empID) throws EmployeeException;
    public Employee deleteEmployeeByID(Integer empID) throws EmployeeException;
    public List<Employee> getAllEmployeeList() throws EmployeeException;
}
