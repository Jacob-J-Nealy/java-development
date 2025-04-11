package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: Declaring Variables & Printing Maximum Salary

        // Setting Variables
        double bobSalary = 38.46; // 80k a Yearly Salary
        double garyFlowersSalary = 48.08; // 100k Yearly Salary

        // Function for who has the higher Salary? Answer: Gary
        double highestSalary = Math.max(garyFlowersSalary, bobSalary);

        // Print Highest Salary Total
        System.out.println("1. The highest salary is " + highestSalary);
        //_______________________________________________________________

        // Question 2: Finding and Displaying Minimum

        // Declaring Variables
        float carPrice = 20_199;
        float truckPrice = 40_299;

        // Finding Smallest of Two Variables
        float lowerPrice = Math.min(carPrice, truckPrice);

        //Displaying Lower Price of Two Vehicles
        System.out.println("2. The Lower Price of the Two Vehicles is " + lowerPrice);
        //_____________________________________________________________________________

        // Question 3:

        // Declaring Variable
        double radius = 7.25;

        // Solving Radius of a Circle
        double area = Math.PI * Math.pow(radius, 2);

        // Display the area of a circle whose radius is 7.25
        System.out.println("3. The area of a circle whose radius is 7.25 is " + area);
        //______________________________________________________________________________

        // Question 4: Find and display the square root a variable after it is set to 5.0

        // Declaring Variables
        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);

        //Print Answer
        System.out.println("4. The square root of " + num1 + " is " + sqrtNum1);
        //______________________________________________________________________________

        // Question 5: Find and display the distance between the points (5, 10) and (85, 50)

        // Declaring Variables
        int x1 = 5, y1 =10, x2 = 85, y2 = 50;

        // Solving the Problem
        double distance =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Print Answer
        System.out.println("5. The distance between the points is " + distance);
        //______________________________________________________________________________

        // Question 6: Find and display the absolute value of a variable after it is set to -3.8

        // Declaring Variables & Solving
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);

        // Print Answer
        System.out.println("6. The absolute value of " +num2 + " is " + absNum2);
        //______________________________________________________________________________

        // Question 7: Find and display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("7. The random number is " + randomNumber);
//________________________________________________________________________________________________________

    }

}
