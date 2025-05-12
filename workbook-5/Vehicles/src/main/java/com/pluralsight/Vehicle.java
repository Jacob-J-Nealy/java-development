package com.pluralsight;

public class Vehicle {

    // Vehicle Attributes
    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int numberOfPassengers;
    private int cargoCapacity;

    // Vehicle Action Method
    private void startEngine() {
        System.out.println("ENGINE IS STARTING");
    }

    private void stopEngine() {
        System.out.println("ENGINE IS STOPPING");
    }

    private void accelerate() {
        System.out.println("Your Vehicle is...ACCELERATING!");
    }

    private void brake() {
        System.out.println("Slowing Down Now");
    }

    // Vehicle Getters and Setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
