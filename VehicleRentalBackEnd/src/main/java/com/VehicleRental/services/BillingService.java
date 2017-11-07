package com.VehicleRental.services;

import com.VehicleRental.domain.Billing;

public interface BillingService {
    Billing create(Billing billing);
    Billing read(long BillingID);
    Billing update(Billing billing);
    void delete(long BillingID);
}

