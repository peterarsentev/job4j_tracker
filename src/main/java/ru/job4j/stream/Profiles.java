package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(p -> p.getAddress())
                .sorted(Comparator.comparing(Address::getCity, Comparator.naturalOrder()))
                .distinct()
                .collect(Collectors.toList());
    }
}
