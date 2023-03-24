package com.example.employee_register.services;

import com.example.employee_register.entity.Employee;
import com.example.employee_register.exception.EmplyeeException;

public interface EmployeeServices {
    public Employee registerEmployee(Employee employee) throws EmplyeeException;
}
