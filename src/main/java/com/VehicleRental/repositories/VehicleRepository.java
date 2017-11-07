package com.VehicleRental.repositories;

import com.VehicleRental.domain.Booking;
import com.VehicleRental.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zany on 11/4/2017.
 */
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    Iterable<Vehicle> findAllById(Booking booking);
    Vehicle findCarsById(Long vehicleID);
}