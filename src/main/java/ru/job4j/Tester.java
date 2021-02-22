package ru.job4j;

import ru.job4j.collection.Job;
import ru.job4j.collection.JobDescByName;
import ru.job4j.collection.JobDescByPriority;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Tester {
    public static int get(int[] data, int el) {
        Optional<Integer> optional = indexOf(data, el);
        if (optional.isEmpty()) {
            return -1;
        }
        return optional.get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> optional = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                optional = Optional.of(i);
                break;
            }
        }
        return optional;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(get(array, 1));


    }
}


