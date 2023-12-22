package com.example.lab_java_intro_to_jpa.model;

import jakarta.persistence.Entity;

@Entity
public class Customer {
private Integer customerId;
private String customerName;
private String customerStatus;
private Integer totalCustomerMileage;

//empty constructor
    public Customer() {

    }
//parameterized constructor
    public Customer(String customerName, String customerStatus, Integer totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                ", totalCustomerMileage=" + totalCustomerMileage +
                '}';
    }
}
