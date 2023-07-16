package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    private List<Profile> list = new ArrayList<>();

    @Before
    public void setUp() {
        list.add(new Profile(new Address("Petropavlovsk-Kamchatskyy")));
        list.add(new Profile(new Address("Kazan")));
        list.add(new Profile(new Address("Dalyan")));
        list.add(new Profile(new Address("Petropavlovsk-Kamchatskyy")));
    }

    @Test
    public void whenCollectClassA() {
        Profiles pr = new Profiles();
        Comparator<Address> comparator = (x, y) -> (x.getCity().compareTo(y.getCity()));
        List<Address> rsl = pr.collect(list);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Dalyan"));
        expected.add(new Address("Kazan"));
        expected.add(new Address("Petropavlovsk-Kamchatskyy"));
        assertThat(rsl, is(expected));
    }

}