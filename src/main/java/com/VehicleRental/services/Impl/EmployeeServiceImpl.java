package com.VehicleRental.services.Impl;

import com.VehicleRental.domain.Employee;
import com.VehicleRental.repositories.EmployeeRepository;
import com.VehicleRental.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public Employee save(Employee entity) {
        return employeeRepository.save(entity);
    }
    
    @Override
    public Employee findByID(Long employeeID) {
        return null;
    }

    @Override
    public Employee update(Long employeeID) {
        return null;
    }

    @Override
    public Employee read(Long employeeID) {
        return employeeRepository.findOne(employeeID);
    }
    
    /*@Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee read(long employeeID) {
        return employeeRepository.findOne(employeeID);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(long employeeID) {
        employeeRepository.delete(employeeID);
    }*/

}
