package com.pluralsight;

public class Product {
    private int productId;
    private String productName;
    private double unitPrice;
    private int unitsInStock;

    // Constructor
    public Product(int productId, String productName, double unitPrice, int unitsInStock) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Product ID: " + productId + "\n"
                + "Product Name: " + productName + "\n"
                + "Unit Price: " + unitPrice + "\n"
                + "Units in Stock: " + unitsInStock + "\n"
                + "______________________________________";
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
