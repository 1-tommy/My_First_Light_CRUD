package com.example.driversmart.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FootballPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String club;
    private String position;
    private int goals;
}