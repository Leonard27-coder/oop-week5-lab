package com.zut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {


public static void main(String[] args) {

    try {

        // PART 2 - ARRAYLIST

        List<String> contacts = new ArrayList<>();

        contacts.add("Mary - 091");
        contacts.add("Jacob - 092");
        contacts.add("Ben - 093");

        System.out.println("Contacts: " + contacts);

        System.out.println("First contact: " + contacts.get(0));

        contacts.set(1, "Jacob - 999");

        contacts.remove(2);

        System.out.println("Number of contacts: " + contacts.size());

        System.out.println(
                "Mary exists: " + contacts.contains("Mary - 091")
        );

        System.out.println(
                "Ben exists: " + contacts.contains("Ben - 093")
        );

        System.out.println("After ArrayList operations:");

        for (String c : contacts) {
            System.out.println(c);
        }


        // PART 3 - LINKEDLIST

        List<String> queue = new LinkedList<>();

        queue.add("Ticket 1");
        queue.add("Ticket 3");

        System.out.println();

        System.out.println("Ticket queue: " + queue);

        System.out.println("Queue size: " + queue.size());

        queue.add(1, "Ticket 2");

        System.out.println(
                "After inserting Ticket 2: " + queue
        );


        // ARRAYLIST MIDDLE INSERT

        contacts.add(1, "Alex - 097");

        System.out.println(
                "After inserting Alex: " + contacts
        );


        // PART 4 - HASHSET

        List<String> numbers = new ArrayList<>();

        numbers.add("097");
        numbers.add("096");
        numbers.add("097");

        System.out.println();

        System.out.println(
                "ArrayList numbers: " + numbers
        );


        // HASHSET - REMOVE DUPLICATES

        Set<String> numbers2 = new HashSet<>();

        numbers2.add("097");
        numbers2.add("096");
        numbers2.add("097");

        System.out.println(
                "HashSet numbers: " + numbers2
        );


        // HASHSET WITH CONTACT OBJECTS

        Set<Contact> uniqueContacts = new HashSet<>();

        uniqueContacts.add(
                new Contact("Jacob", "091")
        );

        uniqueContacts.add(
                new Contact("Jacob", "091")
        );

        System.out.println(
                "Unique contacts: " + uniqueContacts.size()
        );


        // PART 5 - LINKEDHASHSET

        Set<String> names = new LinkedHashSet<>();

        names.add("Shakil");
        names.add("Chanda");
        names.add("Ben");
        names.add("Jacob");

        System.out.println();

        System.out.println(
                "LinkedHashSet names: " + names
        );


        // PART 5 - TREESET

        Set<Integer> numbers3 = new TreeSet<>();

        numbers3.add(100);
        numbers3.add(50);
        numbers3.add(1);
        numbers3.add(-10);

        System.out.println(
                "TreeSet numbers: " + numbers3
        );

    } catch (ArrayIndexOutOfBoundsException e) {

        System.out.println(
                "Problem in array: " + e.getMessage()
        );
    }
}


}
