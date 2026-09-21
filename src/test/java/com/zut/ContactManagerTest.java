package com.zut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ContactManagerTest {


@Test
void addingContactIncreasesSize() {

    List<Contact> contacts = new ArrayList<>();

    contacts.add(new Contact("Ben", "093"));

    assertEquals(1, contacts.size());
}


@Test
void hashSetRejectsDuplicateNumber() {

    Set<String> numbers = new HashSet<>();

    numbers.add("097");
    numbers.add("097");

    assertEquals(1, numbers.size());
}


@Test
void mapReturnsNullForMissingKey() {

    Map<String, Contact> phoneBook = new HashMap<>();

    phoneBook.put(
            "097",
            new Contact("Jacob", "097")
    );

    assertNull(phoneBook.get("000"));
}


@Test
void uniqueContactsWithoutEqualsHashCodeAreTwo() {

    Set<Contact> uniqueContacts = new HashSet<>();

    uniqueContacts.add(
            new Contact("Jacob", "091")
    );

    uniqueContacts.add(
            new Contact("Jacob", "091")
    );

    assertEquals(2, uniqueContacts.size());
}


}
