package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void dis() { //все впорядке
        List<Profile> add = List.of(new Profile(new Address("Adler")),
                new Profile(new Address("Sochi")),
                new Profile(new Address("Adler")));
        List<Address> exp = List.of(new Address("Adler"),
                new Address("Sochi"));
        assertEquals(exp, Profiles.collect(add));
    }

    @Test
    public void sort() {
        List<Profile> add = List.of(new Profile(new Address("Moscow")),
                new Profile(new Address("Sochi")),
                new Profile(new Address("Adler")));
        List<Address> exp = List.of(new Address("Adler"),
                new Address("Moscow"),
                new Address("Sochi"));
        assertEquals(exp, Profiles.collect(add));
    }
}