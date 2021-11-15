package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pro {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress)
                .filter(e -> e.getHome() > 10)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Address address1 = new Address("KZN", "STR", 2, 4);
        Address address2 = new Address("MSK", "SOR", 12, 1);
        Address address3 = new Address("ORN", "SIR", 3, 8);

        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);

        List<Profile> profiles = List.of(profile1, profile2, profile3);

        Pro pro = new Pro();
        List<Address> list = pro.collect(profiles);
        System.out.println(list);
    }
}