package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static Scanner globalScanner = new Scanner(System.in);



    public static void main(String[] args) {
        List<Person> dragonballCharacters = personList();

        // User Input First Name
        System.out.print("Please Enter Name to Search: ");
        String searchName = globalScanner.nextLine();


        // Created Found Person Array List (Currently Empty)
        List<Person> foundPersons = new ArrayList<>();

        // For each Person in Dragonball Character List...
        for (Person person : dragonballCharacters) {

            // if first & last searchName matches User Input add Person to Found Array List (
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                foundPersons.add(person);
            }
        }

        // Display Matching Name(s)
        System.out.println("\n-----Found Names-----");

        if (foundPersons.isEmpty()) {
            System.out.println("No Names to Match Selection");
        }

        for (Person foundPerson : foundPersons) {
            System.out.println(foundPerson.getFirstName() + " " + foundPerson.getLastName() +  " " + "Age:" + foundPerson.getAge());
        }

        System.out.println("\nAverage Age: " + calculateAverageAge(dragonballCharacters));


    }

    private static List<Person> personList() {

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

        // Returning List of People (Dragon Ball Characters)
        return dragonballCharacters;
    }

    private static int calculateAverageAge(List<Person> dragonballCharacters) {
        int totalAge = 0;

        for (Person person : dragonballCharacters) {
            totalAge += person.getAge();
        }

        return (int) Math.round((double) totalAge / dragonballCharacters.size());
    }




}
