package com.zut;

public class App {

    public static void main(String[] args) {

        try {
            String[] contact = new String[1];
            contact[0] = "Mary - 091";

            int contactArrayLength = contact.length;

            String[] contacts = new String[contactArrayLength + 2];

            System.arraycopy(contact, 0, contacts, 0, contactArrayLength);

            contacts[1] = "Jacob - 092";
            contacts[2] = "Ben - 093";

            for (String c : contacts) {
                System.out.println(c);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem in array: " + e.getMessage());
        }
    }
}