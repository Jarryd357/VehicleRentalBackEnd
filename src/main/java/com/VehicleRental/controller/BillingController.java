package com.VehicleRental.controller;

import com.VehicleRental.domain.*;
import com.VehicleRental.services.Impl.BillingServiceImpl;
import com.VehicleRental.services.Impl.BookingServiceImpl;
import com.VehicleRental.services.Impl.CustomerServiceImpl;
import com.VehicleRental.services.Impl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.VehicleRental.factories.BillingFactory.getBilling;

@Controller
@RequestMapping(path = "/billing")
public class BillingController {

    private Billing billing;
    private Customer customer;
    private Vehicle vehicle;
    private Booking booking;
    private Employee employee;

    @Autowired
    private BillingServiceImpl billingService;

    @Autowired
    private CustomerServiceImpl customerService;

    /*
    @Autowired
    private VehicleServiceImpl vehicleService;

    @Autowired
    private BookingServiceImpl bookingService;

    @Autowired
    private EmployeeServiceImpl employeeService;
*/
    @GetMapping(path = "/{CustomerID}/addBilling")
    public
    @ResponseBody
    Billing create(@PathVariable long customerID,
                   @RequestParam @DateTimeFormat(pattern = "yyyyy/mm/dd")Date date,
                   @PathVariable long BillingID) {
        customer = customerService.read(customerID);

        billing = getBilling(customer, vehicle, booking, employee, date, BillingID);
        billingService.create(billing);
        return billing;
    }

    @GetMapping(path = "/{CustomerID}/billing/{CustomerID}updateBilling")
    public
    @ResponseBody
    Billing update(@PathVariable long BillingID, @RequestParam @DateTimeFormat(pattern = "dd.mm.yyyy") Date date){
        billing = billingService.read(BillingID);
        Billing updateBilling = new Billing.Builder()
                .BillingID(BillingID)
                .date(date)
                .build();

        billing = billingService.create(updateBilling);

        return billing;
    }

    @GetMapping(path = "/{CustomerID}/deleteBilling")
    public
    @ResponseBody
    void delete(@PathVariable long CustomerID, @RequestParam long BillingID){
        billingService.delete(BillingID);
    }

}

