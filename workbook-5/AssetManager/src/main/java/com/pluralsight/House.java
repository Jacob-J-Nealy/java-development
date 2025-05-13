package com.pluralsight;

public class House extends Asset {

    // House Attributes
    private String address;
    private int condition; // (1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private double squareFoot;
    private double lotSize;

    // House Constructor
    public House(String description, String dateAcquired,
                 double originalCost, String address,
                 int condition, double squareFoot, double lotSize) {

        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    // Vehicle Getters & Setters
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }

    public double getSquareFoot() {
        return squareFoot;
    }
    public void setSquareFoot(double squareFoot) {
        this.squareFoot = squareFoot;
    }

    public double getLotSize() {
        return lotSize;
    }
    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }


    public double getValue() {

        double value = 0;
        switch (condition) {
            case 1:
                value = (180 * squareFoot) + (0.25 * lotSize);
                break;
            case 2:
                value = (130 * squareFoot) + (0.25 * lotSize);
                break;
            case 3:
                value = (90 * squareFoot) + (0.25 * lotSize);
                break;
            case 4:
                value = (80 * squareFoot) + (0.25 * lotSize);
                break;
            case 0:
                System.err.println("Couldn't Get Value");
        }
        return value;
    }
}


