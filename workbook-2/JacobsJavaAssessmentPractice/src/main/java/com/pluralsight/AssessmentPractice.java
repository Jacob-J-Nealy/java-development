package com.pluralsight;

public class AssessmentPractice {
    public static void main(String[] args) {

        /* 1. Primitive Data Types; There are only 8:
                - byte: -128 to 127
                - short: -32,768 to 32,767
                - int: -2,147,483,648 to 2,147,483,647
                - long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            FOR DECIMALS
                - float: holds about 6-7 significant digits
                - double:  holds about 15 significant digits
                - char: holds one letter
                - boolean: Only 'True' or 'False' */
        //____________________________________________________________________________________
        // 1.1 They are represented by:
        byte b = 10;
        short s = 500;
        int i = 1000;
        long l = 5000L;
        float f = 5.7F; // You can put an infinite amount of decimal places with a double but only saves some of them
        double d = 1234567891; // You can put an infinite amount of decimal places with a double
        char c = 'A';
        boolean bool = true;

        // 1.2 A 'String' is NOT a primitive data type
        String sr = "Hello Java!";
        //____________________________________________________________________________________

        // 2. Main Method: This is where you always put your Java Application:
        /*          - public static void main(String[] args)
                    - type 'main' and push enter                                    */
        //____________________________________________________________________________________
        // 3. Classes: They are declared using the 'class' keyword
        //      - Like This:
                    class MyClass {

                    }
        //____________________________________________________________________________________
        // 4. Identifiers; these are the names we give to elements, variables, methods, classes etc.
        //      - We use these to increase readability in our program
        // Valid Identifiers:
                                int daysInWeek = 7;
                                String myName = "Jacob";
                                double PI = 3.14;
        // Invalid Identifiers:
                                int number = 7;
                                String word = "Jacob";
                                double d6789 = 3.14;
        //_____________________________________________________________________________________
        // 5. Printing to the Console
        //  - You can write messages inside the console by using a shortcut called 'sout'
        //          to print System.out.println("This is a message");
                        System.out.println("This is a message");
        //_____________________________________________________________________________________
        // 6. Operators are ways to do math inside the console
        //    + , - , * , /
        //      - It is important to remember to do the Order of Operations and using parentheses
                    int answer = 2 + 2 * 2; // Equals 6 not 8
        //_____________________________________________________________________________________
        // 7. Postfix & Prefix: There is a difference between ++x and x++
        int x1 = 5;
        System.out.println(x1++); // 5
        int x2 = 5;
        System.out.println(++x2); // 6
        //_____________________________________________________________________________________
        // 8. Compound Assignment and Expression Evaluation: This is a shortcut for you performing
        //      the operation and then also assigning the result.
        int aNumber = 1; // sets equal to 1
        aNumber += 2; // adds 2 to aNumber then assigns it so it equals 3
        // _____________________________________________________________________________________
        // 9. String Comparison
        // ==                  checks if two string are the same object
        // .equals()           checks if two strings have the same value
        // .equalsIgnoreCase() checks the same as == but isn't case-sensitive.
            String s1 = "Hello";
            String s2 = "hello";
            boolean isEqual1 = s1.equals(s2);  // false
            boolean isEqual2 = s1.equalsIgnoreCase(s2);  // true
        //_____________________________________________________________________________________
        // 10. Arrays in Java are like containers that hold multiple values of the same type,
        //      all stored in a fixed-size structure.
            int[] array = {1, 2, 3, 4};
            String[] fruits = {"apple", "banana", "cherry"};
        //_____________________________________________________________________________________
        // 11. Skipped
        //_____________________________________________________________________________________
        // 12. Comparison Operators: These are Listed Below
        // == Equal to
        // != Not equal to
        // >  Greater Than
        // <  Less Than
        // >= Greater Than or Equal to
        // <= Less Than or Equal to
        //_____________________________________________________________________________________
        // 13. Conditional Statements: if-else statements can have multiple conditions;
        //     but only one 'else' block.
            int score = 85;
            if (score > 90) {
            System.out.println("A grade");
            } else if (score > 75) {
            System.out.println("B grade");
            } else {
            System.out.println("C grade");
            }
        //_____________________________________________________________________________________
        // 14. Loops Types
        // for: Standard loop.
        // while: Executes as long as the condition is true.
        // do-while: Executes at least once and then checks the condition.
            for (int j = 0; j < 3; j++) {
            System.out.println("For loop: " + j);
            }

            int k = 0;
            while (k < 3) {
            System.out.println("While loop: " + k);
            k++;
            }

            int m = 0;
            do {
            System.out.println("Do-while loop: " + m);
            m++;
            } while (m < 3);
        //_____________________________________________________________________________________
        // 15. Break: Used to exit out of loops early
            for (int n = 0; n < 5; n++) {
                if (n == 3) {
                break;
            }
            System.out.println("Number: " + n);
            }
        //_____________________________________________________________________________________
        // 16. String Operations
        // Concatenation: "Hello" + " World" = "Hello World".
        // Substring: s.substring(start, end). End index is exclusive.
        // Case-insensitive Comparison: Use .equalsIgnoreCase().
        //_____________________________________________________________________________________
        // 17. The Java Virtual Machine (JVM) is a virtual machine that enables a computer to run Java
        // programs as well as programs written in other languages that are also compiled to Java
        // bytecode. The JVM is responsible for loading code, verifying code, executing code,
        // and providing the runtime environment.
        //_____________________________________________________________________________________
        // 18. Constructors in Java are special methods used to initialize objects.
        // The constructor is called when an object of a class is created.
        // It can be used to set initial values for object attributes:
         class exampleClass {
            int x;

            // Constructor
            public exampleClass(int y) {
                x = y;
            }
        }
        //_______________________________________________________________________________________
        // 19. Creating an Empty Array
            int[] myArray = new int[10]; // An empty array of 10 elements
        //_______________________________________________________________________________________
        // 20. The "this" Keyword
        // In Java, this is a reference variable that refers to the current object.
        // It is used to access class variables and methods.
        // It is also used in constructors and setters to distinguish between instance variables
        // and parameters with the same names.
        // Example:
            class Dog {
                String breed;

                public void setBreed(String breed) {
                    this.breed = breed;
            }
        }
        // 21. The "-=" Operator
            int oof = 10;
            oof -= 2;  // i oof now 8
        //_______________________________________________________________________________________
        // 22. A switch lets you run different code based on the value of a variable,
        //      instead of writing a bunch of if-else statements.
            class SwitchExample {
                public static void main(String[] args) {
                    int choice = 2;

                    switch (choice) {
                        case 1:
                            System.out.println("You chose option 1.");
                            break;
                        case 2:
                            System.out.println("You chose option 2.");
                            break;
                        case 3:
                            System.out.println("You chose option 3.");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                }
            }
        }
        // 23. 

    }
}
