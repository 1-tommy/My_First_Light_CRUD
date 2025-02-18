package com.example.driversmart.repository;


import com.example.driversmart.entity.Driver;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryofDriver extends JpaRepository<Driver, Long> {

}
