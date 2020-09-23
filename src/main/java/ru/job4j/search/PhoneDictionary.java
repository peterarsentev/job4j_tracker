package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAddress().contains(key) || person.getName().contains(key)
                    || person.getPhone().contains(key) || person.getSurname().contains(key)) {
               result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> findNew(String key) {
        Predicate<Person> combine1 = (Person person) -> person.getAddress().contains(key);
        Predicate<Person> combine2 = (Person person) -> person.getName().contains(key);
        Predicate<Person> combine3 = (Person person) -> person.getPhone().contains(key);
        Predicate<Person> combine4 = (Person person) -> person.getSurname().contains(key);
        Predicate<Person> combine = (person) -> combine1.or(combine2.or(combine3.or(combine4)));

        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}