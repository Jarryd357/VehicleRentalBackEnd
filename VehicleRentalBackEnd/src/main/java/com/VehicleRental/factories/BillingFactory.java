package com.VehicleRental.factories;

import com.VehicleRental.domain.*;

import java.util.Date;

public class BillingFactory {
    public static Billing getBilling(Customer customer, Vehicle vehicle, Booking booking, Employee employee, Date date, long BillingID)
    {
        Billing billing = new Billing.Builder()
                .customer(customer)
                .vehicle(vehicle)
                .booking(booking)
                .employee(employee)
                .date(date)
                .BillingID(BillingID)
                .build();
        return billing;
    }
}
