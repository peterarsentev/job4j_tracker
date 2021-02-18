package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = new ArrayList<>();
        addresses.stream().map(x -> x.getApartment()).collect(Collectors.toList());

        return addresses;
    }
}
