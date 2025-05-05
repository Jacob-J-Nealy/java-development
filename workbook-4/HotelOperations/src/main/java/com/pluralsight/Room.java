package com.pluralsight;

public class Room {

    //Attributes
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    //Constructor
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = available;
    }

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
}
