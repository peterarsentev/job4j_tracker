package ru.job4j.colllection;

import ru.job4j.search.Task;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<ru.job4j.search.Task> tasks = new LinkedList<>();

    public void put(ru.job4j.search.Task task) {
        int index = 0;
        for (ru.job4j.search.Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
