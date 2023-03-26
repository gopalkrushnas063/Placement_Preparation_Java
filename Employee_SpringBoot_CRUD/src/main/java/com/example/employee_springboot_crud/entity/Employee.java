package com.example.employee_springboot_crud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empID;
    private String name;
    private String email;
    private String mobile;
    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

}