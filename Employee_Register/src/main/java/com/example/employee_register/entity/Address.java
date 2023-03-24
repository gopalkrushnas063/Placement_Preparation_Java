package com.example.employee_register.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String village;
    private String city;
    private String state;
    private String pin;

    @JsonIgnore
    @OneToOne(cascade=CascadeType.ALL)
    private Employee employee;
}
