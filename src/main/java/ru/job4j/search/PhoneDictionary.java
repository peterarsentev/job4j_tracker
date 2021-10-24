package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person i : persons) {
            if (i.getName().contains(key) || i.getSurname().contains(key)
                    || i.getPhone().contains(key) || i.getAddress().contains(key)) {
                result.add(i);
            }
        }
        return result;
    }
}