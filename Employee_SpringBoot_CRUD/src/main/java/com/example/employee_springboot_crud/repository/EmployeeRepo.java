package com.example.employee_springboot_crud.repository;


import com.example.employee_springboot_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Optional<Employee> findByEmail(String email);

    Optional<Employee> findById(Integer empID);
}
