package com.VehicleRental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String email;
    private String userName;
    private String password;
    private String role;

    public static class Builder
    {
        private Long employeeID;
        private String employeeFirstName;
        private String employeeLastName;
        private String email;
        private String userName;
        private String password;
        private String role;

        public Builder employeeID(Long value){
            this.employeeID = value;
            return this;
        }

        public Builder employeeFirstName(String value){
            this.employeeFirstName = value;
            return this;
        }

        public Builder employeeLastName(String value){
            this.employeeLastName = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder userName(String value){
            this.userName = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder role(String value){
            this.role = value;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    private Employee(){}

    public Employee(Builder builder)
    {
        this.employeeID = builder.employeeID;
        this.employeeFirstName = builder.employeeFirstName;
        this.employeeLastName = builder.employeeLastName;
        this.email = builder.email;
        this.userName = builder.userName;
        this.password = builder.password;
        this.role = builder.role;
        this.email = builder.email;
    }


    public Long getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return employeeID.equals(employee.employeeID);
    }

    @Override
    public int hashCode() {
        return employeeID.hashCode();
    }

    @Override
    public String toString() {



        return "Employee{" +
                "Employee ID ='" + employeeID + '\'' +
                ", First Name ='" + employeeFirstName + '\'' +
                ", Last Name ='" + employeeLastName + '\'' +
                ", Email ='" + email + '\'' +
                ", User Name ='" + userName + '\'' +
                ", Password ='" + password + '\'' +
                ", Role =" + role +
                '}';
    }
}

