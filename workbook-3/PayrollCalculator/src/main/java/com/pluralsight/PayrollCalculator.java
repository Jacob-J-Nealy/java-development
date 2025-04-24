package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {

            // Buffered Reader & File Reader for employee.csv
            BufferedReader bufferedReader = new BufferedReader( new FileReader("employees.csv"));

            String line;

            // While Loop
            while ((line = bufferedReader.readLine()) != null) {

              String[] tokens = line.split("\\|");

              // Transforming Strings to Doubles & Integers; Assigning them to the Array
              int id = Integer.parseInt(tokens[0]);
              String name = tokens[1];
              double hoursWorked = Double.parseDouble(tokens[2]);
              double payRate = Double.parseDouble(tokens[3]);

              // Creating New Object (Employee)
              Employee employee = new Employee(id, name, hoursWorked, payRate);

                //Formatting Information
                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: %.2f%n", employee.getEmployeeId(),
                                                                                  employee.getName(),
                                                                                  employee.getGrossPay());
            }

            // Closing Buffered Reader
            bufferedReader.close();

        } catch (Exception ex) {
            System.err.println("An error has occurred");
            ex.printStackTrace();
        }
    }
}

