package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("\nBilling Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Get Shipping Address Information
        System.out.print("\nShipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip:");
        String shippingZip = scanner.nextLine();

        System.out.println("\n");

        StringBuilder addressBuilder = new StringBuilder();

        // Billing Address
        addressBuilder.append(fullName).append("\n\n");
        addressBuilder.append("Billing Address:").append("\n");
        addressBuilder.append(billingStreet).append("\n");
        addressBuilder.append(billingCity).append(", ")
                      .append(billingState).append(" ")
                      .append(billingZip).append("\n\n");

        //Shipping Address
        addressBuilder.append("Shipping Address:").append("\n");
        addressBuilder.append(shippingStreet).append("\n");
        addressBuilder.append(shippingCity).append(", ")
                      .append(shippingState).append(" ")
                      .append(shippingZip);

        String addressBuilderString = addressBuilder.toString();
        System.out.println(addressBuilderString);



    }
}
