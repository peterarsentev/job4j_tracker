package ru.job4j.collection;

import java.util.Comparator;

/**
 * у приоритета обычно обратный порядок,
 * т.е приоритет 1 больше чем приоритет 3,
 * это важно учитывать в сортировке
 */
public class JobAscByPriority implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
