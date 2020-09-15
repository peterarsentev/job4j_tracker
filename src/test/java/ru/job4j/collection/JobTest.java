package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameUp() {
        Comparator<Job> cmpNamePriority = new JobCompUp();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameDown() {
        Comparator<Job> cmpNamePriority = new JobCompDown();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityUp() {
        Comparator<Job> cmpNamePriority = new JobCompDown().thenComparing(new JobCompPrDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDown() {
        Comparator<Job> cmpNamePriority = new JobCompPrDown();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByProrityUp() {
        Comparator<Job> cmpNamePriority = new JobCompPrUp();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDownThen() {
        Comparator<Job> cmpNamePriority = new JobCompDown().thenComparing(new JobCompPrDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}