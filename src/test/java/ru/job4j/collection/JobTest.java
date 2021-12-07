package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void compareJobAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Write description", 4),
                new Job("Task B", 5)
        );
        Collections.sort(jobs, new JobAscByName());
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Task B", 5),
                new Job("Write description", 4)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void compareJobDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Write description", 4),
                new Job("Task B", 5)
        );
        Collections.sort(jobs, new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Write description", 4),
                new Job("Task B", 5),
                new Job("Fix bug", 1)

        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void compareJobAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Write description", 4),
                new Job("Task B", 5)
        );
        Collections.sort(jobs, new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Write description", 4),
                new Job("Task B", 5)

        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void compareJobDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Write description", 4),
                new Job("Task B", 5)
        );
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Task B", 5),
                new Job("Write description", 4),
                new Job("Fix bug", 1)

        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int result = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorByNameLengthAndNameAndPriority() {
        Comparator<Job> cmpNameLengthNamePriority = new JobDescByNameLn()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        int result = cmpNameLengthNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(result, greaterThan(0));
    }
}