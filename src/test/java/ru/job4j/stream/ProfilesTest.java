package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    List<Profile> list = new ArrayList<>();

    @Before
    public void setUp() {
        list.add(new Profile(new Address()));
        list.add(new Profile(new Address()));
        list.add(new Profile(new Address()));
    }

    @Test
    public void whenCollectClassA() {
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(list);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address());
        expected.add(new Address());
        expected.add(new Address());
        assertThat(rsl, is(expected));
    }

}