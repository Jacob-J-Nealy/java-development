package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;

        // Menu
        System.out.println("What do you want to do?");
        System.out.println("    1) Display all products");
        System.out.println("    2) Display all customers");
        System.out.println("    0) Exit");
        System.out.print("\nSelect an option: ");
        int input = scanner.nextInt();
        scanner.nextLine(); // scanner eater

        try {
            if (args.length != 2) {
                System.out.println("This application needs a Username and a Password to run");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            // Connect to Northwind database instead of sakila
            String url = "jdbc:mysql://localhost:3306/Northwind";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            // Menu
            switch (input) {
                case 1:
                    displayAllProducts(connection,
                            preparedStatement,
                            results);
                    break;
                case 2:
                    displayAllCustomers(connection,
                            preparedStatement,
                            results);
                    break;
                case 0:
                    System.out.println("Exiting Program...");
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void displayAllProducts(Connection connection,
                                           PreparedStatement preparedStatement,
                                           ResultSet results) {

        String query = """
                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                FROM Products
                ORDER BY ProductID;
                """;

        try {
            preparedStatement = connection.prepareStatement(query);

            results = preparedStatement.executeQuery();

            // Option 1: Stacked Information display
            while (results.next()) {
                int productId = results.getInt("ProductID");
                String productName = results.getString("ProductName");
                double unitPrice = results.getDouble("UnitPrice");
                int unitsInStock = results.getInt("UnitsInStock");

                System.out.println("Product Id: " + productId);
                System.out.println("Name: " + productName);
                System.out.println("Price: " + unitPrice);
                System.out.println("Stock: " + unitsInStock);
                System.out.println("------------------");
            }

            results.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("An error has occurred");
            ex.printStackTrace();
        } finally {

            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void displayAllCustomers(Connection connection,
                                            PreparedStatement preparedStatement,
                                            ResultSet results) {

        String query = """
                SELECT CustomerID, ContactName, CompanyName, City, Country, Phone
                FROM Customers
                ORDER BY CustomerID;
                """;

        try {
            preparedStatement = connection.prepareStatement(query);

            results = preparedStatement.executeQuery();

            // Option 1: Stacked Information display
            while (results.next()) {
                int CustomerID     = results.getInt(   "CustomerID");
                String ContactName = results.getString("ContactName");
                String CompanyName = results.getString("CompanyName");
                String City        = results.getString("City");
                String Country     = results.getString("Country");
                String Phone       = results.getString("Phone");



                System.out.println("Customer ID: " + CustomerID);
                System.out.println("Contact Name: " + ContactName);
                System.out.println("Company Name: " + CompanyName);
                System.out.println("City: " + City);
                System.out.println("Country:" + Country);
                System.out.println("Phone: " + Phone);
                System.out.println("------------------");
            }

            results.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("An error has occurred");
            ex.printStackTrace();
        } finally {

            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
