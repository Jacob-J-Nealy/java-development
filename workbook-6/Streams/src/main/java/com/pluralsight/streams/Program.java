package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static Scanner globalScanner = new Scanner(System.in);



    public static void main(String[] args) {

        // Creating and Adding 10 Dragon Ball Z Characters to Array List
        List<Person> dragonballCharacters = new ArrayList<>();
        dragonballCharacters.add(new Person("Goku", "Son", 43));
        dragonballCharacters.add(new Person("Vegeta", "IV", 48));
        dragonballCharacters.add(new Person("Gohan", "Son", 18));
        dragonballCharacters.add(new Person("Piccolo", "Daimao", 30));
        dragonballCharacters.add(new Person("Trunks", "Brief", 17));
        dragonballCharacters.add(new Person("Krillin", "Kurisutin", 44));
        dragonballCharacters.add(new Person("Frieza", "Cold", 70));
        dragonballCharacters.add(new Person("Cell", "Perfect", 5));
        dragonballCharacters.add(new Person("Majin", "Buu", 5));
        dragonballCharacters.add(new Person("Android", "Eighteen", 20));

        // User Input First Name
        System.out.print("Please Enter First Name: ");
        String firstName = globalScanner.nextLine();

        // User Input Last Name (Seaarch First name or Last Name)
        System.out.print("Please Enter Last Name: ");
        String lastName = globalScanner.nextLine();

        // User Set Age to 0 (not a value we will be looking for
        int age = 0;

        // Created New Person from User Input
        Person userInput = new Person(firstName, lastName, age);

        // Created Found Person Array List (Currently Empty)
        List<Person> foundPersons = new ArrayList<>();

        // For each Person in Dragonball Character List...
        for (Person person : dragonballCharacters) {

            // if first & last name matches User Input add Person to Found Array List (
            if (person.getFirstName().equalsIgnoreCase(firstName) &&
                    person.getLastName().equalsIgnoreCase(userInput.getLastName())) {

                foundPersons.add(person); // Fix This
            }
        }

        // Display Matching Name(s)
        System.out.println("\n-----Found Names-----");

        if (foundPersons.isEmpty()) {
            System.out.println("No Names to Match Selection");
        }

        for (Person printPerson : foundPersons) {
            System.out.println(foundPersons);
        }

        //Display Oldest Name

        for (Person person)


    }

//    private Person nameSearch(ArrayList<Person> characterList) {
//
//
//    }


}
