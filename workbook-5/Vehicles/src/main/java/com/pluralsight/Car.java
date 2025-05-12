package com.pluralsight;

public class Car extends Vehicle {

    // Car Exclusive Attributes
    private int numberOfDoors;

    // Car Action Methods
    private void openTrunk() {
        System.out.println("User is opening Truck of Car");
    }

    private void closeTrunk() {
        System.out.println("user has closed the Trunk");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
