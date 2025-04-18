package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone newPhone = new CellPhone();


        System.out.print("What is the serial number? ");
        newPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        newPhone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        newPhone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        newPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        newPhone.setOwner(scanner.nextLine());
        String owner = scanner.nextLine();

        System.out.println("\nPhone Info:");
        System.out.println("Serial Number: " + newPhone.getSerialNumber());
        System.out.println("Model: " + newPhone.getModel());
        System.out.println("Carrier: " + newPhone.getCarrier());
        System.out.println("Phone Number: " + newPhone.getPhoneNumber());
        System.out.println("Owner: " + newPhone.getOwner());


    }
}
