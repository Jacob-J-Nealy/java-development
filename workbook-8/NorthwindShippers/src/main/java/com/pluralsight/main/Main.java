package com.pluralsight.main;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Username and Password Necessary to Continue bro.");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);
        northwindDataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Northwind Shippers");
        System.out.println("\nLet's add a *NEW* Shipper");

        System.out.print("\nPlease Enter Shipper Company Name: ");
        String companyName = scanner.nextLine();

        System.out.print("Please Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();


    }
}
