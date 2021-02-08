package ru.job4j;

import ru.job4j.collection.Job;
import ru.job4j.collection.JobDescByName;
import ru.job4j.collection.JobDescByPriority;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);

        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority = Comparator.comparingInt(Job::getPriority);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);

        jobs.sort(combine);

        System.out.println(jobs);
    }
}
