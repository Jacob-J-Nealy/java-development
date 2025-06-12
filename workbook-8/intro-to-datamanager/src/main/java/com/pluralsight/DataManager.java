package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    // Create this
    private BasicDataSource dataSource;

    // Constructor
    public DataManager(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Product> getAllProducts () {
        List<Product> products = new ArrayList<>();

        // Query to Run
        String productsQuery = """
                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                FROM Products
                """;

        // Setting Internal to DataSource Material Alwayse
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(productsQuery);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) { //This If Statement is here to allow empty rows and/or spaces
                System.out.println("\nProducts:");
                System.out.println("__________________");

                // While Loop to Print Each Product with Information (Adjustable)
                do {
                    int productId = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    double unitPrice = resultSet.getDouble(3);
                    int unitsInStock = resultSet.getInt(4);

                    products.add(new Product(productId, productName, unitPrice, unitsInStock));

//                    System.out.println("Product ID: " + productId);
//                    System.out.println("Product Name: " + productName);
//                    System.out.println("Unit Price: " + unitPrice);
//                    System.out.println("Units in Stock: " + unitsInStock);
//                    System.out.println("______________________________________");
                } while (resultSet.next());

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    public Product getProductById(int productId) {
        Product product = null;
        String productByIdQuery = """
                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                FROM Products
                WHERE ProductID = ?
                """;

        try (Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(productByIdQuery)) {
            preparedStatement.setInt(1, productId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                        int productIdFromDb = resultSet.getInt(1);
                        String productName = resultSet.getString(2);
                        double unitPrice = resultSet.getDouble(3);
                        int unitsInStock = resultSet.getInt(4);

                        product = new Product(productIdFromDb, productName, unitPrice, unitsInStock);

                } else System.out.println("Product Not Found!");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return product;
    }


}
