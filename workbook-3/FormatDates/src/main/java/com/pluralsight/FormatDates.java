package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDateTime currentDate = LocalDateTime.now();

        // Print Default 2025-04-24
        System.out.println(today);

        // Print April 24, 2025
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);

        // Print 04/24/2024
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate2 = currentDate.format(formatter2);
        System.out.println(formattedDate2);

        // Print Thursday, April 24, 2025 10:13(GMT Time)
        System.out.println( "I give up");

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String formattedDate3 = currentDate.format(formatter3);
        System.out.println(formattedDate3);

        // Print 10:16 on 24-April-2025
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("H:mma 'on' dd-MMMM-yyyy");
        String formattedDate4 = currentDate.format(formatter4);
        System.out.println(formattedDate4);

        // Print Thursday, April 24, 2025 10:23
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyy  HH:mma");
        String formattedDate5 = currentDate.format(formatter5);
        System.out.println(formattedDate5);
    }
}
