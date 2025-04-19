package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    // Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create New Phone
        CellPhone newPhone = new CellPhone();

        // Set Serial Number based on Scanner Entry
        System.out.print("What is the serial number? ");
        newPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        // Set Model based on Scanner Entry
        System.out.print("What model is the phone? ");
        newPhone.setModel(scanner.nextLine());

        // Set Carrier based on Scanner Entry
        System.out.print("Who is the carrier? ");
        newPhone.setCarrier(scanner.nextLine());

        // Set Phone Number based on Scanner Entry
        System.out.print("What is the phone number? ");
        newPhone.setPhoneNumber(scanner.nextLine());

        // Set Owner based on Scanner Entry
        System.out.print("Who is the owner of the phone? ");
        newPhone.setOwner(scanner.nextLine());

        // Get & Print CellPhone Class Attributes
        System.out.println("\nPhone Info:");
        System.out.println("Serial Number: " + newPhone.getSerialNumber());
        System.out.println("Model: " + newPhone.getModel());
        System.out.println("Carrier: " + newPhone.getCarrier());
        System.out.println("Phone Number: " + newPhone.getPhoneNumber());
        System.out.println("Owner: " + newPhone.getOwner());




    }
}
