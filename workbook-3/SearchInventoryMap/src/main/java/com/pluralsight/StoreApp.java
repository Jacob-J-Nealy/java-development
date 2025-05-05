package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StoreApp {

    static HashMap<Integer, Product> inventory = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What item # are you interested in? ");
        int id = scanner.nextInt();

        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
        } else {
            System.out.printf("We carry %s and thee price is %.2f\n",
                    matchedProduct.getName(), matchedProduct.getPrice());
        }
    }

    public static HashMap<Integer, Product> loadInventory() {
        HashMap<Integer, Product> inventory = new HashMap<>();

        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));


        } catch (FileNotFoundException e) {
            System.err.println("Error");
        }
    }



}
