package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        System.out.println("________________________________________");

        // Old
        List<Person> nameMatchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                nameMatchingPeople.add(person);
            }
        }

        // New
        List<Person> nameMatchingPeopleStream =
                people.stream()
                        .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) ||
                                person.getLastName().equalsIgnoreCase(searchName))
                .toList();



        // Old
        System.out.print("People with matching name: ");
        for (Person person : nameMatchingPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        //Name matching People with Stream method
        System.out.print("(Using Stream) People with matching name: ");
        nameMatchingPeopleStream.stream().forEach(person -> System.out.println(searchName.get));

        System.out.println("_______________________________________________________");

        int averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        // Add at least 10 people to the list
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Jane", "Smith", 30));
        people.add(new Person("Michael", "Johnson", 35));
        people.add(new Person("Emily", "Brown", 22));
        people.add(new Person("David", "Miller", 40));
        people.add(new Person("Sarah", "Davis", 28));
        people.add(new Person("Daniel", "Anderson", 33));
        people.add(new Person("Jessica", "Wilson", 27));
        people.add(new Person("Matthew", "Martinez", 31));
        people.add(new Person("Olivia", "Taylor", 29));

        return people;
    }

    private static int calculateAverageAge(List<Person> people) {
//        int totalAge = 0;
//        for (Person person : people) {
//            totalAge += person.getAge();
//        }
//        return (int) Math.round((double) totalAge / people.size());

        int totalAge = people.stream().map(Person::getAge).reduce(0, (temp, age) -> temp + age);

       int totalAge people.stream()
                .mapToInt(Person::getAge)
                .average().orElse(0);

    }

    private static int calculateAverageAgeStream(List<Person> people) {
        people.stream().mapToInt(Person::getAge).average();

        return Person.getAge();
    }

    private static int findOldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    private static int findYoungestAge(List<Person> people) {
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }
}