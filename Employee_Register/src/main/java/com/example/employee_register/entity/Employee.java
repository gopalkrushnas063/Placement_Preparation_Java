package com.example.employee_register.entity;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Designation designation;
    private double salary;
    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
}
