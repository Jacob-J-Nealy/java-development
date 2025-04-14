package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {

        // Declaring Scanners
        Scanner scannerfullName  = new Scanner(System.in);
        Scanner scannerworkHours = new Scanner(System.in);
        Scanner scannerpayRate   = new Scanner(System.in);

        // User's Input for First & Last Name
        System.out.print("Please enter your First & Last Name: ");
        String fullName = scannerfullName.nextLine();

        // User's Input for Hours Worked
        System.out.print("Enter hours worked this week: ");
        double workHours = scannerworkHours.nextDouble();

        // User's Hourly Rate
        System.out.print("Please enter your hourly rate: ");
        double hourlyRate = scannerpayRate.nextDouble();

        // Calculated Gross Pay
        double grossPay = workHours * hourlyRate;
        System.out.println("Your Gross Pay for this Week is $" + String.format("%.2f", grossPay));

    }
}
