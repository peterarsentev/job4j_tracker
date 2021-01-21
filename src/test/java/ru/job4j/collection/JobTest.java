package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAsc() {
        Comparator<Job> nameByAsc = new JobNameAscending();
        int rsl = nameByAsc.compare(
                new Job("abc", 0),
                new Job("bac", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenComparatorByNameDsc() {
        Comparator<Job> nameByDsc = new JobDescByName();
        int rsl = nameByDsc.compare(
                new Job("bac", 1),
                new Job("abc", 0)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenComparatorByPriorityAsc() {
        Comparator<Job> priorityByAsc = new JobDescByName();
        int rsl = priorityByAsc.compare(
                new Job("bac", 0),
                new Job("abc", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenComparatorByNameAscAndPriorityDesc() {
        Comparator<Job> nameAscPriorityDesc = new JobNameAscending().thenComparing(new JobDescByPriority());
        int rsl = nameAscPriorityDesc.compare(
                new Job("abc", 1),
                new Job("abc", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}