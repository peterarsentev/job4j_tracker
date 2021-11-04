package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(
                new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobAscByName() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("Aac", 0),
                new Job("Abc", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobDescByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Don", 0),
                new Job("Ben", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobDescByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorCombAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(
                new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("Sonya", 2),
                new Job("Won", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}
