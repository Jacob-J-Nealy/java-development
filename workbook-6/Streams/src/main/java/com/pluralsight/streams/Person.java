package com.pluralsight.streams;

public class Person {

    // Person Properties
    private String firstName;
    private String lastName;
    private int age;

    // Person Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder personBuilder = new StringBuilder();
        personBuilder.append("First & Last Name: ");
        personBuilder.append(firstName);
        personBuilder.append(lastName);

        return String.format("First Name & Last Name: %s %s", firstName, lastName);
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
