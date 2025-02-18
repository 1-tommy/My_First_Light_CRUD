package com.example.driversmart.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BasketballPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private String position;
    private double pointsPerGame;
}