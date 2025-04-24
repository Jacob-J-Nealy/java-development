package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {

    // Created Scanner
    static Scanner scanner = new Scanner(System.in);

    // Creating an Array of 20 Vehicles
    private static Vehicle[] vehicles = new Vehicle[20];

    // Tracks Number of Vehicles in Inventory
    private static int numOfVehicles = 6;

    public static void main(String[] args) {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500.00f);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000.00f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700.00f);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500.00f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500.00f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000.00f);

        while(true){
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println("Enter your command:");

            int command = scanner.nextInt();
            scanner.nextLine();

            // Switch Cases for Options
            switch (command) {
                case 1:
                    // List of all Vehicles Based on How Vehicles are in the Inventory
                    listAllVehicles();
                    break;
                case 2:
                    // Search by make and model
                    findVehicleByMakeModel();
                    break;
                case 3:
                    // Search by Price
                    findVehicleByPrice(scanner);
                    break;
                case 4:
                    // Search by Color
                    findVehiclesByColor(scanner);
                    break;
                case  5:
                    // Add a Vehicle
                    addVehicle(scanner);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }


    }

    // All of my Methods

    private static void addVehicle(Scanner scanner) {

        System.out.println("Vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Enter Make & Model: ");
        String makeModel = scanner.nextLine();

        System.out.println("Enter Color: ");
        String color = scanner.nextLine();

        System.out.println("Enter Odometer Reading: ");
        int odometerReading = scanner.nextInt();

        System.out.println("Enter Price: ");
        float price = scanner.nextFloat();

        Vehicle newVehicle = new Vehicle(id, makeModel, color, odometerReading, price);
        vehicles[numOfVehicles] = newVehicle;
        numOfVehicles++;

        System.out.println("Vehicle Added");

    }

    private static void listAllVehicles() {
        System.out.println("Vehicle Inventory");

        for (int i = 0; i < numOfVehicles; i++) {
            System.out.println(vehicles[1]);
            
        }
    }

    private static void findVehicleByMakeModel(){
        System.out.println("Enter make and model: ");
        String makeModel = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)){
                System.out.println(vehicles[i]);
                found = true;
            }

            if (!found){
                System.out.println("No vehicles found.");
            }
        }
    }

    private static void findVehicleByPrice(Scanner scanner){
        System.out.print("Enter minimum price: ");
        float minPrice = scanner.nextFloat();

        System.out.print("Enter maximum price: ");
        float maxPrice = scanner.nextFloat();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {
            if(vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice);

            System.out.println(vehicles[i]);

        }
    }

    private static void findVehiclesByColor(Scanner scanner) {
        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicles[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found.");
        }
    }



}
