package com.example.employee_register.services;

import com.example.employee_register.entity.Employee;
import com.example.employee_register.exception.EmplyeeException;

import java.util.List;

public interface EmployeeServices {
    public Employee registerEmployee(Employee employee) throws EmplyeeException;
    public List<Employee> getEmployeeList() throws EmplyeeException;
    public Employee getEmployeeByID(Integer id) throws EmplyeeException;
}
