package com.VehicleRental.repositories;

import com.VehicleRental.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{
    
}
