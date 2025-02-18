package com.example.driversmart.repository;


import com.example.driversmart.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Driver, Long> {

}
