package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> nameContainsKey = name -> name.getName().contains(key);
        Predicate<Person> surnameContainsKey = surname -> surname.getSurname().contains(key);
        Predicate<Person> phoneContainsKey = phone -> phone.getPhone().contains(key);
        Predicate<Person> addressContainsKey = address -> address.getAddress().contains(key);
        Predicate<Person> combine = nameContainsKey.or(surnameContainsKey).or(phoneContainsKey)
                .or(addressContainsKey);
        ArrayList<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
