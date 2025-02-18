package com.example.driversmart;

import com.example.driversmart.component.Sport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DriverSmartApplication {

    private final Sport sport;

    public DriverSmartApplication(Sport sport) {
        this.sport = sport;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DriverSmartApplication.class, args);
        Sport sport = context.getBean(Sport.class);
        sport.sport();
    }
}
