package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        List<Address> addresses = collect(profiles);
        Comparator<Address> comparator = Comparator.comparing(Address::getCity);
        return addresses.stream()
                .sorted(comparator)
                .distinct()
                .collect(Collectors.toList());
    }
}
