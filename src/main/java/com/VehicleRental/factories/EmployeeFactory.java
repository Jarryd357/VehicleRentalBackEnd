package com.VehicleRental.factories;

import com.VehicleRental.domain.Employee;

public class EmployeeFactory
{
    public static Employee getEmployee(String employeeFirstName, String employeeLastname,
                                    String email, String userName, String password, String role) {

        Employee employee = new Employee.Builder()
                .employeeFirstName(employeeFirstName)
                .employeeLastName(employeeLastname)
                .email(email)
                .userName(userName)
                .password(password)
                .role(role)
                .build();

        return employee;
    }
}
