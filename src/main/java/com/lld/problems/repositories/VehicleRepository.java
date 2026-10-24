package com.lld.problems.repositories;

import com.lld.problems.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    public Optional<Vehicle> findVehicleByNumber(String Number){
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        // certain actions to save the object
        return vehicle;
    }
}
