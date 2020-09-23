package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        Comparator<Address> comp = Comparator.comparing(Address::getCity);
         return profiles.stream()
                .map(Profile::getAddress)
                 .sorted(comp)
                 .distinct()
                 .collect(Collectors.toList());
    }
}
