package ru.job4j.colllection;

import java.util.Comparator;

public class JobDescByNameDecr implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
