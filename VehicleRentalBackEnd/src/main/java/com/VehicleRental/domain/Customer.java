package com.VehicleRental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerID;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddressStreet;
    private String customerAddressArea;
    private String customerAddressCity;
    private String customerAddressCode;
    private String customerContactNumber;
    private String customerEmail;
    private String customerAccPassword;

    public Long getCustomerID() {
        return customerID;
    }

    public String getCustomerFirstName() { return customerFirstName; }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerAddressStreet() {
        return customerAddressStreet;
    }

    public String getCustomerAddressArea() {
        return customerAddressArea;
    }

    public String getCustomerAddressCity() {
        return customerAddressCity;
    }

    public String getCustomerAddressCode() {
        return customerAddressCode;
    }

    public String getCustomerContactNumber() {
        return customerContactNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAccPassword() {
        return customerAccPassword;
    }



    public Customer(){

    }

    public Customer(Builder builder) {
        this.customerID = builder.customerID;
        this.customerFirstName = builder.customerFirstName;
        this.customerLastName = builder.customerLastName;
        this.customerAddressStreet = builder.customerAddressStreet;
        this.customerAddressArea = builder.customerAddressArea;
        this.customerAddressCity = builder.customerAddressCity;
        this.customerAddressCode = builder.customerAddressCode;
        this.customerContactNumber = builder.customerContactNumber;
        this.customerEmail = builder.customerEmail;
        this.customerAccPassword = builder.customerAccPassword;

    }

    public static class Builder{
        private Long customerID;
        private String customerFirstName;
        private String customerLastName;
        private String customerAddressStreet;
        private String customerAddressArea;
        private String customerAddressCity;
        private String customerAddressCode;
        private String customerContactNumber;
        private String customerEmail;
        private String customerAccPassword;



        public Builder customerID(Long value){
            this.customerID = value;
            return this;
        }

        public Builder customerFirstName(String value) {
            this.customerFirstName = value;
            return this;
        }

        public Builder customerLastName(String value){
            this.customerLastName = value;
            return this;
        }

        public Builder customerAddressStreet(String value){
            this.customerAddressStreet = value;
            return this;
        }

        public Builder customerAddressArea(String value){
            this.customerAddressArea = value;
            return this;
        }

        public Builder customerAddressCity(String value){
            this.customerAddressCity = value;
            return this;
        }

        public Builder customerAddressCode(String value){
            this.customerAddressCode = value;
            return this;
        }

        public Builder customerContactNumber(String value){
            this.customerContactNumber = value;
            return this;
        }

        public Builder customerEmail(String value){
            this.customerEmail = value;
            return this;
        }

        public Builder customerAccPassword(String value){
            this.customerAccPassword = value;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

}

