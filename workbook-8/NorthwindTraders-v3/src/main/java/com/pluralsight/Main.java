package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;


        try {
            if (args.length != 2) {
                System.out.println("This application needs a Username and a Password to run");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            // Connect to Northwind database instead of sakila
            String url = "jdbc:mysql://localhost:3306/Northwind";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, username, password);

            String query = """
                    SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                    FROM Products
                    ORDER BY ProductID;
                    """;

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
}