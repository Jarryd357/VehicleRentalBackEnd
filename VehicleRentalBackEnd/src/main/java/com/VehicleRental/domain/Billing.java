package com.VehicleRental.domain;

import javafx.util.Builder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Billing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long BillingID;
    private Date date;

    private Customer customer;

    private Vehicle vehicle;

    @OneToMany
    private Booking booking;

    private Employee employee;

    public Billing() {
    }

    public Billing(Builder builder){
        this.BillingID = builder.BillingID;
        this.date = builder.date;
        this.customer = builder.customer;
        this.vehicle = builder.vehicle;
        this.booking = builder.booking;
        this.employee = builder.employee;
    }

    public static class Builder{
        private long BillingID;
        private Date date;
        private Customer customer;
        private Vehicle vehicle;
        private Booking booking;
        private Employee employee;

        public Builder BillingID(long value){
            this.BillingID = value;
            return this;
        }

        public Builder date(Date value){
            this.date = value;
            return this;
        }

        public Builder customer(Customer value){
            this.customer = value;
            return this;
        }

        public Builder vehicle(Vehicle value){
            this.vehicle = value;
            return this;
        }

        public Builder booking(Booking value){
            this.booking = value;
            return this;
        }

        public Builder employee(Employee value){
            this.employee = value;
            return this;
        }

        public Billing build() {
            return new Billing(this);
        }
    }

    public long getBillingID() {
        return BillingID;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Booking getBooking() {
        return booking;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

