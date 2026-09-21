package com.zut;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {


public static void main(String[] args) {

    try {

        // ==========================================
        // PART 2 - ARRAYLIST
        // ==========================================

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


        // ==========================================
        // PART 3 - LINKEDLIST
        // ==========================================

        List<String> queue = new LinkedList<>();

        queue.add("Ticket 1");
        queue.add("Ticket 3");

        System.out.println();
        System.out.println("Ticket queue: " + queue);
        System.out.println("Queue size: " + queue.size());

        // Insert Ticket 2 in the middle
        queue.add(1, "Ticket 2");

        System.out.println(
            "After inserting Ticket 2: " + queue
        );


        // ==========================================
        // ARRAYLIST MIDDLE INSERT
        // ==========================================

        contacts.add(1, "Alex - 097");

        System.out.println(
            "After inserting Alex: " + contacts
        );

    } catch (ArrayIndexOutOfBoundsException e) {

        System.out.println(
            "Problem in array: " + e.getMessage()
        );
    }
}


}
