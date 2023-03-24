package com.example.employee_register.services;

import com.example.employee_register.entity.Employee;
import com.example.employee_register.exception.EmplyeeException;
import com.example.employee_register.repository.AddressRepository;
import com.example.employee_register.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServices{

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private AddressRepository addressRepo;


    @Override
    public Employee registerEmployee(Employee employee) throws EmplyeeException {
        Optional<Employee> optionalEmployee = empRepo.findByEmail(employee.getEmail());
        if(optionalEmployee.isPresent()){
            throw new EmplyeeException("Employee already exist with this mobile : "+employee.getEmail());
        }

        return empRepo.save(employee);
    }
}
