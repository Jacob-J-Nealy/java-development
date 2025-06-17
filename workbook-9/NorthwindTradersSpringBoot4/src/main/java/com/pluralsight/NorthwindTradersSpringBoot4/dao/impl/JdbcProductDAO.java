package com.pluralsight.NorthwindTradersSpringBoot4.dao.impl;

import com.pluralsight.NorthwindTradersSpringBoot4.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersSpringBoot4.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDAO implements IProductDao {

    private DataSource dataSource;

    @Autowired
    public JdbcProductDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Product addProduct(Product product) {
        String insertDataQuery = """
    INSERT INTO products (ProductName, CategoryId, unitPrice) 
    VALUES (?, ?, ?)
    """;
    }





    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(int productId) {
        return null;
    }

    @Override
    public void update(int productId, Product product) {

    }

    @Override
    public void delete(int productId) {

    }
}