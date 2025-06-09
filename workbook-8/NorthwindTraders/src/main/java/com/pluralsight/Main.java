package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    private static final String url      = "jdbc:mysql://localhost:3306/northwind";
    private static final String userName = "root";
    private static final String password = "P@ssw0rd";

    public static void main(String[] args) {

        // Opening a Connection
        Connection connection = DriverManager.getConnection(url, userName, password)) {

        }



    }
}
