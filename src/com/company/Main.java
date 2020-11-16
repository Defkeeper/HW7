package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Stanislav", "Lem", Gender.MALE);
        Person person2 = new Person("Agatha", "Christie", Gender.FEMALE);
        Person person3 = new Person("Uiliam", "Sheqspiri", Gender.MALE);
        Person person4 = new Person("Jane", "Austen", Gender.FEMALE);
        Person person5 = new Person("Victor", "Hugo", Gender.MALE);

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);

        for (Person person : list1) {
            System.out.println(person);
        }
        System.out.println("Всего элементов: " + list1.size());

        System.out.println("-----------------------");

        Person person6 = new Person("Kurt", "Russel", Gender.MALE);
        Person person7 = new Person("Kurt", "Russel", Gender.MALE);
        Person person8 = new Person("Alexis", "Bledel", Gender.FEMALE);
        Person person9 = new Person("Alexis", "Bledel", Gender.FEMALE);
        Person person10 = new Person("Rutger", "Hauer", Gender.MALE);

        Set<Person> actors = new HashSet<>();
        actors.add(person6);
        actors.add(person7);
        actors.add(person8);
        actors.add(person9);
        actors.add(person10);

        for (Person person : actors) {
            System.out.println(actors);
        }
        System.out.println("Кол-во элементов: " + actors.size());
        System.out.println("-------------------------");

        Person person11 = new Person("David", "Cronenberg", Gender.MALE);
        Person person12 = new Person("David", "Lynch", Gender.MALE);
        Person person13 = new Person("Lynne", "Ramsey", Gender.FEMALE);
        Person person14 = new Person("Sofia", "Coppola", Gender.FEMALE);
        Person person15 = new Person("Jim", "Jarmusch", Gender.MALE);

        Map<Integer, Person> cinema = new HashMap<>();
        cinema.put(1, person11);
        cinema.put(2, person12);
        cinema.put(3, person13);
        cinema.put(4, person14);
        cinema.put(5, person15);
        for (Map.Entry<Integer, Person> entry : cinema.entrySet()){
            System.out.println( entry.getValue());
        }
        System.out.println("Кол-во элементов: " + cinema.size());
    }
}
