package com.VehicleRental.factories;

import com.VehicleRental.domain.Booking;
import com.VehicleRental.domain.Vehicle;
import com.VehicleRental.keyGen.KeyGenerator;

import java.util.Map;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public class BookingFactory {
    public static Booking buildBooking(Vehicle vehicle, Map<String, String> values, int duration, boolean availabilityFK)
    {
        Booking booking = new Booking.Builder()
                .id(KeyGenerator.getEntityId())
                .pickupDate(values.get("pickupDate"))
                .returnDate(values.get("returnDate"))
                .duration(duration)
                .vehicle(vehicle)
                .availabilityFK(availabilityFK)
                .build();
        return booking;
    }
}
