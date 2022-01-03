package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Ivan", "Ivanov", "123456", "Moscow"));
        phones.add(new Person("Veronika", "Lapenok", "6707680", "Vilnius"));
        ArrayList<Person> persons = phones.find("Ivanov");
        assertThat(persons.get(0).getAddress(), is("Moscow"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Ivan", "Ivanov", "123456", "Moscow"));
        phones.add(new Person("Veronika", "Lapenok", "6707680", "Vilnius"));
        ArrayList<Person> persons = phones.find("6707680");
        assertThat(persons.get(0).getName(), is("Veronika"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Ivan", "Ivanov", "123456", "Bryansk"));
        phones.add(new Person("Veronika", "Lapenok", "6707680", "Vilnius"));
        ArrayList<Person> persons = phones.find("Bryansk");
        assertThat(persons.get(0).getName(), is("Petr"));
        assertThat(persons.get(1).getName(), is("Ivan"));
    }
}
