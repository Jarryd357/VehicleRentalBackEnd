package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Billing;
import com.VehicleRental.repositories.BillingRepository;
import com.VehicleRental.services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceImpl implements BillingService {

    @Autowired
    BillingRepository billingService;

    @Override
    public Billing create(Billing billing){
        return billingService.save(billing);
    }

    @Override
    public Billing read(long BillingID) {
        return billingService.findOne(BillingID);
    }

    @Override
    public Billing update(Billing billing) {
        return billingService.save(billing);
    }

    @Override
    public void delete(long BillingID) {
        billingService.delete(BillingID);
    }
}
