package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        Comparator<Address> comp = (left, right) -> left.getCity().compareTo(right.getCity());
        List<Address> collect = profiles.stream().
                map(p -> p.getAddress())
                .sorted(comp)
                .distinct()
                .collect(Collectors.toList());
        return collect;
    }
}
