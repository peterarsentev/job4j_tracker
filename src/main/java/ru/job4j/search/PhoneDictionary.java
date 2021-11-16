package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> prName = person -> person.getName().contains(key);
        Predicate<Person> prSurname = person -> person.getSurname().contains(key);
        Predicate<Person> prPhone = person -> person.getPhone().contains(key);
        Predicate<Person> prAddress = person -> person.getAddress().contains(key);
        Predicate<Person> combine =  prName.or(prSurname).or(prPhone).or(prAddress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}