package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner globalScanner = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.print("Hey User! Please Enter your First Name: ");
        String firstName = globalScanner.nextLine();

        System.out.print("Please Enter your Last Name: ");
        String lastName = globalScanner.nextLine();

        System.out.print("Please Enter your Middle Initial; " +
                            "If you don't have one please press 'Enter': ");
        String middleInitial = globalScanner.nextLine();
        if (middleInitial.isEmpty()) {
                middleInitial = "";
        } else { middleInitial = middleInitial + ". ";
        }

        System.out.print("Please Enter any suffix for your name if you have one, " +
                            "if not please press 'Enter': ");
        String suffix = globalScanner.nextLine();
        if (suffix.isEmpty()) {
            suffix = "";
        } else suffix = ", " + suffix;

        String fullName = firstName + " "
                        + middleInitial
                        + lastName + suffix;

        System.out.println("Hello " + fullName);

    }
}
