package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;


    // Get Gross Pay
    public double getGrossPay() {
        return hoursWorked * payRate;
    }

    // Constructor
    public Employee(int employeeId, String name, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    // Getters & Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}

