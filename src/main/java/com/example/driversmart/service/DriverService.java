package com.example.driversmart.service;

import com.example.driversmart.entity.Driver;
import com.example.driversmart.service.DriverService;
import com.example.driversmart.repository.RepositoryofDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private RepositoryofDriver driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver updateDriver(Long id, Driver updatedDriver) {
        Driver driver = driverRepository.findById(id).orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setName(updatedDriver.getName());
        driver.setTeam(updatedDriver.getTeam());
        driver.setAge(updatedDriver.getAge());
        driver.setWins(updatedDriver.getWins());
        return driverRepository.save(driver);
    }

    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
