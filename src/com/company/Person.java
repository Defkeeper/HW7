package com.company;

import java.util.Objects;

final class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;

        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && gender == person.gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + gender;
    }
}