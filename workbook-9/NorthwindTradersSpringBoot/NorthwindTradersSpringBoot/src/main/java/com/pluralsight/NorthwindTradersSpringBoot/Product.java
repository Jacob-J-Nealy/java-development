package com.pluralsight.NorthwindTradersSpringBoot;

public class Product {

    // Attributes
    private int productId;
    private String name;
    private String category;
    private double price;


    // Constructor
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // toString
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
