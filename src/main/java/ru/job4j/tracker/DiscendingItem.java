package ru.job4j.tracker;

public class DiscendingItem implements Comparable<Item> {

    @Override
    public int compareTo(Item another) {
        return Integer.compare(another.getId());
    }
}
