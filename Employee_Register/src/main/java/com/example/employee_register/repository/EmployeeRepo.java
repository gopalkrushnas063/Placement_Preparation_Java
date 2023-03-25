package com.example.employee_register.repository;

import com.example.employee_register.entity.Employee;
import com.example.employee_register.exception.EmplyeeException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    public Optional<Employee> findByEmail(String email);

    @Query("SELECT e FROM Employee e")
    public List<Employee> getEmployeeList() throws EmplyeeException;

    @Query("SELECT e FROM Employee e WHERE e.id =:i")
    public Employee getEmpByID(@Param("i") Integer id) throws EmplyeeException;
}
