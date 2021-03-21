package ru.job4j.colllection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByNameDecr().thenComparing(new JobDescByPriorityDecr());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameIncr() {
        Comparator<Job> compatorByNameIncr = new JobDescByNameIncr();
        int rsl =
                compatorByNameIncr.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameDecr() {
        Comparator<Job> compatorByNameDecr = new JobDescByNameDecr();
        int rsl =
                compatorByNameDecr.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityIncr() {
        Comparator<Job> compatorByPriority = new JobDescByPriorityInc();
        int rsl = compatorByPriority.compare(new Job("Impl task", 5), new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityDecr() {
        Comparator<Job> compatorByPriority = new JobDescByPriorityDecr();
        int rsl = compatorByPriority.compare(new Job("Impl task", 5), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityInc() {
        Comparator<Job> cmpNamePriority =
                new JobDescByNameIncr().thenComparing(new JobDescByPriorityInc());
        int rsl = cmpNamePriority.compare(new Job("Fix bug", 5), new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}