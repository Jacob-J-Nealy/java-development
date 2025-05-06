package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    // Constructor
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        } else {
            System.out.println("This room is dirty and probably occupied sorry!");
        }
    }

    public void checkOut() {
        isOccupied = false;

    }

    public void cleanroom() {
        if (!isOccupied) {
            System.out.println("A Cleaner is coming to Clean this Room");
            isDirty = false;
            System.out.println("ROOM CLEANED");
        }
    }
}





