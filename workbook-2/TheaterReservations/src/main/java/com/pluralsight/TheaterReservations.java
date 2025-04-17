package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.print("Please Enter Last Name:");
        String lastName = scanner.nextLine();

        String fullNameFormatted = "(" + lastName + ", " + firstName + ")";

        System.out.println("Please Enter Date (MM/dd/yyyy):");
        String unformattedDate = scanner.nextLine();

        // Convert 'String' to 'Slashed Date Data'
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate slashDateVersion = LocalDate.parse(unformattedDate, formatter);

        // 'Convert Slashed Date Data' to 'Dashed Date Data'
        //DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //String dashDateVersion = slashDateVersion.format(formatter2);

        System.out.println(slashDateVersion);



    }
}
