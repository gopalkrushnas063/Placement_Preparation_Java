package com.example.employee_springboot_crud.services;


import com.example.employee_springboot_crud.entity.Employee;
import com.example.employee_springboot_crud.exception.EmployeeException;
import com.example.employee_springboot_crud.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServices{

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {
        Optional<Employee> optionalEmployee = employeeRepo.findByEmail(employee.getEmail());

        if(optionalEmployee.isPresent()){
            throw new EmployeeException("Already employee exist with Employee Email : "+employee.getEmail());
        }
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployeeByID(Employee employee,Integer empID) throws EmployeeException {
        Optional<Employee> employeeOptional = employeeRepo.findById(empID);
        System.out.println("Edit Employee Name :");
        if(employeeOptional.isPresent()){
            return employeeRepo.save(employee);
        }
        throw new EmployeeException("Does not exist with this EmpID : "+empID);
    }

    @Override
    public Employee deleteEmployeeByID(Integer empID) throws EmployeeException {
        Optional<Employee> optionalEmployee = employeeRepo.findById(empID);
        if(optionalEmployee.isPresent()){
            employeeRepo.deleteById(empID);
            return optionalEmployee.get();
        }
        throw new EmployeeException("Does not exist with this EmpID : "+empID);
    }

    @Override
    public List<Employee> getAllEmployeeList() throws EmployeeException {
        List<Employee> employees = employeeRepo.findAll();
        if(employees != null){
            return employees;
        }
        throw new EmployeeException("No any records are found");
    }
}
