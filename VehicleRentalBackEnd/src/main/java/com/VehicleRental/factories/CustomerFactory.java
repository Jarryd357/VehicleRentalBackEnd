package com.VehicleRental.factories;

import com.VehicleRental.domain.Customer;

public class CustomerFactory {
    public static Customer buildCustomer(String customerFirstName, String customerLastName, String customerAddressStreet, String customerAddressArea, String customerAddressCity, String customerAddressCode, String customerContactNumber, String customerEmail, String customerAccPassword){
        Customer customer = new Customer.Builder()
                .customerFirstName(customerFirstName)
                .customerLastName(customerLastName)
                .customerAddressStreet(customerAddressStreet)
                .customerAddressArea(customerAddressArea)
                .customerAddressCity(customerAddressCity)
                .customerAddressCode(customerAddressCode)
                .customerContactNumber(customerContactNumber)
                .customerEmail(customerEmail)
                .customerAccPassword(customerAccPassword)
                .build();
        return customer;
    }
}
