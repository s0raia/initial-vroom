package com.initialvroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Required or RaceSimulationService.tick() silently never runs — worth checking first when wiring scheduling.
@SpringBootApplication
public class InitialVroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitialVroomApplication.class, args);
    }
}
