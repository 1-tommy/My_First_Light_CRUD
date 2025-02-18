package com.example.driversmart.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private int age;
    private int wins;
}

