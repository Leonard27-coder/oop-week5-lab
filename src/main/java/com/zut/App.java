package com.zut;

import java.util.ArrayList;

public class App {


public static void main(String[] args) {

    ArrayList<String> contacts = new ArrayList<>();

    contacts.add("Mary - 091");
    contacts.add("Jacob - 092");
    contacts.add("Ben - 093");

    System.out.println("First contact: " + contacts.get(0));

    contacts.set(1, "Jacob - 999");

    contacts.remove(2);

    System.out.println("Number of contacts: " + contacts.size());

    System.out.println("Number of contacts: " + contacts.size());

System.out.println("Mary exists: " + contacts.contains("Mary - 091"));
System.out.println("Ben exists: " + contacts.contains("Ben - 093"));

    try {

        for (String c : contacts) {
            System.out.println(c);
        }

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Problem in array: " + e.getMessage());
    }
}


}
