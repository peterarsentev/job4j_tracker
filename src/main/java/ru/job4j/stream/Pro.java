package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Pro {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress)
                .sorted((x, y) -> x.getCity().compareTo(y.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}