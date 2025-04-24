package com.pluralsight;

public class Vehicle {
    private long vehicle;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Constructor
    public Vehicle(long vehicle, String makeModel, String color, int odometerReading, float price) {
        this.vehicle = vehicle;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    //toString: Allows Us to Print Objects as Strings
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle=" + vehicle +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }

    // Getters & Setters
    public long getVehicle() {
        return vehicle;
    }

    public void setVehicle(long vehicle) {
        this.vehicle = vehicle;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
}
