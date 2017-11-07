package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Customer;
import com.VehicleRental.repositories.CustomerRepository;
import com.VehicleRental.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    /*
    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll()
                .forEach(customers::add);
        return customers;
    }*/

    @Override
    public Customer save(Customer entity) {
        return customerRepository.save(entity);
    }

    @Override
    public Customer findByID(Long aLong) {
        return null;
    }

    @Override
    public Customer update(Long customerID) {
        return null;
    }

    @Override
    public Customer read(Long customerID) {
        return customerRepository.findOne(customerID);
    }

    /*
    @Override
    public Customer create(Customer entity){
        return customerRepository.save(entity);
    }

    @Override
    public Customer read(long customerID){
        return customerRepository.findOne(customerID);
    }

    @Override
    public Customer update(long customerID, Customer customers){
        return customerRepository.save(customers);
    }

    @Override
    public void delete(long customerID){
        customerRepository.delete(customerID);
    }*/
}
