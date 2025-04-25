package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// How to Read am Excel File and Print/ Display the Information from it

public class StoreApp {
    public static void main(String[] args) {

        List<Product> inventory = getInventory();

        listAllProducts(inventory);


    }


    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();
//        inventory.add(new Product(1, 19.99, "Shirt"));
//        inventory.add(new Product(2, 19.99, "Pants"));
//        inventory.add(new Product(3, 19.99, "Shoes"));
//        inventory.add(new Product(4, 19.99, "Hat  "));
//        inventory.add(new Product(5, 19.99, "Socks"));

        String line;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("inventory.csv"));



            while((line = bufReader.readLine()) != null) {
                String [] parts =line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                inventory.add( new Product(id, name, price));
            }

            bufReader.close();


        } catch (Exception e) {
            System.err.println("Error");
        }


        return inventory;
    }

    public static void listAllProducts(List<Product> productList) {
        System.out.println("We carry the following Inventory");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
