package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // If Statement to tell the User to input Username & Password into Configuration
        // If you want to use this you have to use a Do-While Loop
        if (args.length != 2) {
            System.err.println("Username & Password are needed in Configuration to Run");
            System.exit(1);
        }

        // Grabs Username & Password from Configuration
        String username = args[0];
        String password = args[1];


        // Connects to SQL DataBase
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        DataManager dataManager = new DataManager(dataSource);
        List<Product> productList = dataManager.getAllProducts();

        productList.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Product ID: ");
        int productID = scanner.nextInt();

        Product product = dataManager.getProductById(productID);
        System.out.println(product);


    }
}
