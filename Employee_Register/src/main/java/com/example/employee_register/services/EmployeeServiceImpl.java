package com.example.employee_register.services;

import com.example.employee_register.entity.Employee;
import com.example.employee_register.exception.EmplyeeException;
import com.example.employee_register.repository.AddressRepository;
import com.example.employee_register.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServices{

    @Autowired
    private EmployeeRepo empRepo;

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

    @Override
    public List<Employee> getEmployeeList() throws EmplyeeException {
        List<Employee> employeeList = empRepo.getEmployeeList();

        if(employeeList.isEmpty()){
            throw new EmplyeeException("No any record founds");
        }
        return employeeList;
    }

    @Override
    public Employee getEmployeeByID(Integer id) throws EmplyeeException {
        Employee employee = empRepo.getEmpByID(id);
        if(employee != null){
            return employee;
        }
        throw new EmplyeeException("Employee not found with Employee ID : "+id);
    }
}
