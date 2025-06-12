package com.pluralsight.db;

import com.pluralsight.Shipper;

import javax.sql.DataSource;

public class DatabaseManager {

    private DataSource dataSource;

    public DatabaseManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Shipper addShipper(String companyName, String phoneNumber) {

        Shipper shipper = null;

        String addShipperQuery = """
                
                """;


        return new Shipper();
    }
}
