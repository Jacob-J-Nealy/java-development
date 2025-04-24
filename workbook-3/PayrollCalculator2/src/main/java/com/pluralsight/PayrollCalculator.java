package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of the file employee file to process: ");
            String inputFileName = scanner.nextLine();

            System.out.print("Enter the name of the payroll file to create: ");
            String outputFileName = scanner.nextLine();



            // Buffered Reader & File Writer for employee.csv
            try {
                FileWriter fileWriter = new FileWriter("employees.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            }

            String line;

            for (int i = 0; i <= 10; i++) {

                line = String.format("id|name|gross pay");
                line = String.format("111|Cameron Tay|3277.65");
                line = String.format("222|James Tee|2150.00");

            }

        } catch (Exception e) {
            System.err.println("ERROR BRO!!!");
        }
    }
}

