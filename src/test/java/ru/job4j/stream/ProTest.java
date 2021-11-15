package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProTest {
    @Test
    public void whenCollectAddressSortCity() {
        Address address1 = new Address("KZN", "Lenina", 7, 6);
        Address address2 = new Address("MSK", "Gagarina", 3, 2);
        Address address3 = new Address("KZN", "Lenina", 7, 6);
        Address address4 = new Address("MSK", "Gagarina", 3, 2);
        Address address5 = new Address("AMV", "Mendeleeva", 7, 1);

        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);
        Profile profile4 = new Profile(address4);
        Profile profile5 = new Profile(address5);

        List<Profile> profiles = List.of(profile1, profile2, profile3, profile4, profile5);
        List<Address> expected = List.of(address5, address1, address2);
        Pro pro = new Pro();
        List<Address> rsl = pro.collect(profiles);
        assertThat(rsl, is(expected));

    }

}