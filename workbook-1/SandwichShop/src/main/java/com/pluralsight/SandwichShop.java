package com.pluralsight;
import java.util.*;

public class SandwichShop {
    static Scanner globalScanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Declaring Variable
        double sandwichPrice;

        // Prompt User for Sandwich Size Input
        System.out.println("Hey Sandwich Lover!");
        System.out.println("What size sandwich would you like?");
        System.out.println("1- Regular Size: 5.45$");
        System.out.println("2- Large Size: 8.95$");
        System.out.print  ("Input number below for sandwich size (1 or 2): ");

        int sandwichSize = globalScanner.nextInt();
        System.out.print  ("You chose Sandwich Size " + sandwichSize + ".");

        // If Statement to Save Sandwich Size with Sandwich Price
        if (sandwichSize == 1)
             sandwichPrice = 5.45;
            else if (sandwichSize ==2);
                sandwichPrice = 8.95;
        System.out.println(" Awesome Sandwich Choice! Your total sandwich price so far is: " + String.format("%.2f" , sandwichPrice) + ".");

        // Prompt the User for their Age
        System.out.println("We also give discounts depending on your age; how old are you?");
        System.out.print  ("Input Age Here: ");
        int userAge = globalScanner.nextInt();

        // Give Discount Based on Age
        if (userAge < 17) {
            sandwichPrice = sandwichPrice - (sandwichPrice * 0.10);
            System.out.println("You received a 10% minor age discount!");
        } else if (userAge > 65) {
            sandwichPrice = sandwichPrice - (sandwichPrice * 0.20);
            System.out.println("You have a received the LEGENDARY O-L-D M-A-N Discount");
        } else {
            System.out.println("You have received no discount.");
        }

        // Print Total Sandwich Price
        System.out.println("Your total price is " + String.format("%.2f" , sandwichPrice) + ".");
    }
}
