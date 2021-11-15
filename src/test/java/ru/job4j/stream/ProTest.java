package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProTest {
    @Test
    public void whenCollectAddressAndFilterHome() {
        Address address1 = new Address("KZN", "Mira", 20, 235);
        Address address2 = new Address("MSK", "Gagarina", 3, 2);
        Address address3 = new Address("ORN", "Lenina", 7, 6);

        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);

        List<Profile> profiles = List.of(profile1, profile2, profile3);
        Pro pro = new Pro();
        List<Address> rsl = pro.collect(profiles);
        List<Address> expected = List.of(address1);

        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectAddressAndFilterHomeTwo() {
        Address address1 = new Address("KZN", "Mira", 20, 235);
        Address address2 = new Address("MSK", "Gagarina", 3, 2);
        Address address3 = new Address("ORN", "Lenina", 45, 6);

        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);

        List<Profile> profiles = List.of(profile1, profile2, profile3);
        Pro pro = new Pro();
        List<Address> rsl = pro.collect(profiles);
        List<Address> expected = List.of(address1, address3);

        assertThat(rsl, is(expected));
    }
}